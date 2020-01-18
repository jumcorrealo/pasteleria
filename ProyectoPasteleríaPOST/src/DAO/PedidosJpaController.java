/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Control.exceptions.NonexistentEntityException;
import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import Entidad.Cliente;
import Entidad.Pedidos;
import Entidad.Postres;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author andre
 */
public class PedidosJpaController implements Serializable {

    public PedidosJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pedidos pedidos) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente IDCliente = pedidos.getIDCliente();
            if (IDCliente != null) {
                IDCliente = em.getReference(IDCliente.getClass(), IDCliente.getId());
                pedidos.setIDCliente(IDCliente);
            }
            Postres IDPostre = pedidos.getIDPostre();
            if (IDPostre != null) {
                IDPostre = em.getReference(IDPostre.getClass(), IDPostre.getId());
                pedidos.setIDPostre(IDPostre);
            }
            em.persist(pedidos);
            if (IDCliente != null) {
                IDCliente.getPedidosCollection().add(pedidos);
                IDCliente = em.merge(IDCliente);
            }
            if (IDPostre != null) {
                IDPostre.getPedidosCollection().add(pedidos);
                IDPostre = em.merge(IDPostre);
            }
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pedidos pedidos) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedidos persistentPedidos = em.find(Pedidos.class, pedidos.getIDPedido());
            Cliente IDClienteOld = persistentPedidos.getIDCliente();
            Cliente IDClienteNew = pedidos.getIDCliente();
            Postres IDPostreOld = persistentPedidos.getIDPostre();
            Postres IDPostreNew = pedidos.getIDPostre();
            if (IDClienteNew != null) {
                IDClienteNew = em.getReference(IDClienteNew.getClass(), IDClienteNew.getId());
                pedidos.setIDCliente(IDClienteNew);
            }
            if (IDPostreNew != null) {
                IDPostreNew = em.getReference(IDPostreNew.getClass(), IDPostreNew.getId());
                pedidos.setIDPostre(IDPostreNew);
            }
            pedidos = em.merge(pedidos);
            if (IDClienteOld != null && !IDClienteOld.equals(IDClienteNew)) {
                IDClienteOld.getPedidosCollection().remove(pedidos);
                IDClienteOld = em.merge(IDClienteOld);
            }
            if (IDClienteNew != null && !IDClienteNew.equals(IDClienteOld)) {
                IDClienteNew.getPedidosCollection().add(pedidos);
                IDClienteNew = em.merge(IDClienteNew);
            }
            if (IDPostreOld != null && !IDPostreOld.equals(IDPostreNew)) {
                IDPostreOld.getPedidosCollection().remove(pedidos);
                IDPostreOld = em.merge(IDPostreOld);
            }
            if (IDPostreNew != null && !IDPostreNew.equals(IDPostreOld)) {
                IDPostreNew.getPedidosCollection().add(pedidos);
                IDPostreNew = em.merge(IDPostreNew);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pedidos.getIDPedido();
                if (findPedidos(id) == null) {
                    throw new NonexistentEntityException("The pedidos with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Pedidos pedidos;
            try {
                pedidos = em.getReference(Pedidos.class, id);
                pedidos.getIDPedido();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pedidos with id " + id + " no longer exists.", enfe);
            }
            Cliente IDCliente = pedidos.getIDCliente();
            if (IDCliente != null) {
                IDCliente.getPedidosCollection().remove(pedidos);
                IDCliente = em.merge(IDCliente);
            }
            Postres IDPostre = pedidos.getIDPostre();
            if (IDPostre != null) {
                IDPostre.getPedidosCollection().remove(pedidos);
                IDPostre = em.merge(IDPostre);
            }
            em.remove(pedidos);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pedidos> findPedidosEntities() {
        return findPedidosEntities(true, -1, -1);
    }

    public List<Pedidos> findPedidosEntities(int maxResults, int firstResult) {
        return findPedidosEntities(false, maxResults, firstResult);
    }

    private List<Pedidos> findPedidosEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pedidos.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Pedidos findPedidos(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pedidos.class, id);
        } finally {
            em.close();
        }
    }

    public int getPedidosCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pedidos> rt = cq.from(Pedidos.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
