/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.exceptions.NonexistentEntityException;
import Entidad.Postre;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.ParameterMode;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author enano
 */
public class PostresDAO implements Serializable {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");
    
    public PostresDAO() {
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Postre postres) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(postres);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Postre postres) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            postres = em.merge(postres);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = postres.getId();
                if (findPostres(id) == null) {
                    throw new NonexistentEntityException("The postres with id " + id + " no longer exists.");
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
            Postre postres;
            try {
                postres = em.getReference(Postre.class, id);
                postres.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The postres with id " + id + " no longer exists.", enfe);
            }
            em.remove(postres);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Postre> findPostresEntities() {
        return findPostresEntities(true, -1, -1);
    }

    public List<Postre> findPostresEntities(int maxResults, int firstResult) {
        return findPostresEntities(false, maxResults, firstResult);
    }

    private List<Postre> findPostresEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Postre.class));
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

    public Postre findPostres(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Postre.class, id);
        } finally {
            em.close();
        }
    }

    public int getPostresCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Postre> rt = cq.from(Postre.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<String> selectDistinct(){
        EntityManager em = getEntityManager();
        List<String> tipo = null;
        try {
            Query query = em.createQuery("SELECT DISTINCT p.tipo FROM Postre p");
            tipo = query.getResultList();
        } finally {
            em.close();
        }
        return tipo;
    }
    
    public List<Postre> selectByTipo(String tipo) {
        EntityManager em = getEntityManager();
        List<Postre> list = null;
        try {
            Query query = em.createNamedQuery("Postre.findByTipo").setParameter("tipo", tipo);
            list = query.getResultList();
        } finally {
            em.close();
        }
        return list;
    }
}
