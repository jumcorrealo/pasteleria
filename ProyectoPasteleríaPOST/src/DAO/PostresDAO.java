/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.exceptions.NonexistentEntityException;
import Entidad.Postres;
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
    private final EntityManagerFactory emf;
    
    public PostresDAO() {
        this.emf = Persistence.createEntityManagerFactory("Persistence");
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Postres postres) {
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

    public void edit(Postres postres) throws NonexistentEntityException, Exception {
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
            Postres postres;
            try {
                postres = em.getReference(Postres.class, id);
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

    public List<Postres> findPostresEntities() {
        return findPostresEntities(true, -1, -1);
    }

    public List<Postres> findPostresEntities(int maxResults, int firstResult) {
        return findPostresEntities(false, maxResults, firstResult);
    }

    private List<Postres> findPostresEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Postres.class));
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

    public Postres findPostres(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Postres.class, id);
        } finally {
            em.close();
        }
    }

    public int getPostresCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Postres> rt = cq.from(Postres.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
    public List<Postres> dynoSerch(String data) {
        EntityManager em = getEntityManager();
        List<Postres> list = null;
        try {
            em.getTransaction().begin();
            StoredProcedureQuery procedureQuery = em.createStoredProcedureQuery("dynoserch", Postres.class);
            procedureQuery.registerStoredProcedureParameter("_data", String.class, ParameterMode.IN);
            procedureQuery.registerStoredProcedureParameter("_table", Integer.class, ParameterMode.IN);
            procedureQuery.setParameter("_data", "%" + data + "%");
            procedureQuery.setParameter("_table", 2);
            procedureQuery.execute();
            em.getTransaction().commit();
            list = procedureQuery.getResultList();
        }finally {
            em.close();
        }
        return list;
    }
}
