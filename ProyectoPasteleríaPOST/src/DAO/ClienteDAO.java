/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Entidad.Cliente;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
/**
 *
 * @author enano
 */
public class ClienteDAO implements Serializable {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public ClienteDAO() {
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Cliente cliente) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public boolean edit(Cliente cliente) {
        EntityManager em = null;
        boolean result = false;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            cliente = em.merge(cliente);
            em.getTransaction().commit();
            result = true;
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = cliente.getId();
                if (findCliente(id) == null) {
                    System.out.println("The cliente with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return result;
    }

    public boolean destroy(Integer id) {
        EntityManager em = null;
        boolean result = false;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Cliente cliente = null;
            try {
                cliente = em.getReference(Cliente.class, id);
                cliente.getId();
            } catch (EntityNotFoundException enfe) { }
            em.remove(cliente);
            em.getTransaction().commit();
            result = true;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return result;
    }

    public List<Cliente> findClienteEntities() {
        return findClienteEntities(true, -1, -1);
    }

    public List<Cliente> findClienteEntities(int maxResults, int firstResult) {
        return findClienteEntities(false, maxResults, firstResult);
    }

    private List<Cliente> findClienteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Cliente.class));
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

    public Cliente findCliente(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Cliente.class, id);
        } finally {
            em.close();
        }
    }

    public int getClienteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Cliente> rt = cq.from(Cliente.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Cliente> dynoSerch(String key) {
        EntityManager em = getEntityManager();
        List<Cliente> list = null;
        try {
            em.getTransaction().begin();
            StoredProcedureQuery procedureQuery =  em.createStoredProcedureQuery("dynoserch", Cliente.class);
            procedureQuery.registerStoredProcedureParameter("_data", String.class, ParameterMode.IN);
            procedureQuery.registerStoredProcedureParameter("_table", Integer.class, ParameterMode.IN);
            procedureQuery.setParameter("_table", 1);
            procedureQuery.setParameter("_data", "%" + key + "%");
            procedureQuery.execute();
            em.getTransaction().commit();
            list = procedureQuery.getResultList();
        } finally {
            em.close();
        }
        return list;
    }
}
