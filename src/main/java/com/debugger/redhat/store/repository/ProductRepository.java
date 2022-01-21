package com.debugger.redhat.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.debugger.redhat.store.catalog.Product;

public interface ProductRepository extends CrudRepository<Product, String>{

}
