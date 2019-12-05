/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import Entidad.Insumo;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.persistence.criteria.*;
/**
 *
 * @author ACER
 */
public class InsumoDAO {
    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistence");

    public InsumoDAO(){
    }
    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public boolean create(Insumo insumo) {
        EntityManager em = null;
        boolean res=true;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(insumo);
            em.getTransaction().commit();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
            res=false;
        }finally {
            if (em != null) {
                em.close();
            }
        }
        return res;
    }

    public boolean edit(Insumo insumo) {
        EntityManager em = null;
        boolean result = false;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            insumo = em.merge(insumo);
            em.getTransaction().commit();
            result = true;
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Long id = insumo.getId();
                if (findInsumo(id) == null) {
                    System.out.println("EL insumo con id " + id + " no existe más.");
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

    public boolean destroy(Long id) {
        EntityManager em = null;
        boolean result = false;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Insumo insumo = null;
            try {
                insumo = em.getReference(Insumo.class, id);
                insumo.getId();
            } catch (EntityNotFoundException enfe) { }
            em.remove(insumo);
            em.getTransaction().commit();
            result = true;
        } finally {
            if (em != null) {
                em.close();
            }
        }
        return result;
    }

    public List<Insumo> findInsumoEntities() {
        return findInsumoEntities(true, -1, -1);
    }

    public List<Insumo> findInsumoEntities(int maxResults, int firstResult) {
        return findInsumoEntities(false, maxResults, firstResult);
    }

    private List<Insumo> findInsumoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Insumo.class));
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

    public Insumo findInsumo(Long id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Insumo.class, id);
        } finally {
            em.close();
        }
    }

    
    
}
