/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsflesson.enterprise.DAO;

import com.jsflesson.enterprise.entity.Product;
import java.util.List;
import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author mihan
 */

@Model
public class ProductDAO {
    
    public void insert(Product p){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsflesson");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
    }
    
    public void  delete(Long id){}
    
    public void update(Product p){}
    
    public List<Product> get(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jsflesson");
        EntityManager em = emf.createEntityManager();

        List<Product> result = em.createNamedQuery("findAll").getResultList();
        
        em.close();
        emf.close();
        
        return result;
    }
    
}
