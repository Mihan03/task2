/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsflesson.enterprise.service;

import com.jsflesson.enterprise.DAO.ProductDAO;
import com.jsflesson.enterprise.entity.Product;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author mihan
 */

@Named(value = "serviceController")
@RequestScoped
public class ProductService {
    
    @Inject
    private ProductDAO service;
    
    private Product product;
    
    @PostConstruct
    public void init() {
        product = new Product();
    }
    
    
    public List<Product> get() {
        return service.get();
    }
    
    public void insert() {
        service.insert(product);
    }
    
    public Product getProduct() {
        return product;
    }
    
    public String addProduct(){
        return "add";
    }
    
    public String updateProduct(Product p){
        product = p;
        return "edit";
    }
    
}
