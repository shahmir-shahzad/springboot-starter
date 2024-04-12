package com.shahmir.basicwebapparchitecture.repositories;

import com.shahmir.basicwebapparchitecture.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ProductRepo extends JpaRepository<Product,Long> {

    @Query(value = "SELECT id,name FROM Product p where p.  name = :name")
    List<Product> findByFirstName(@Param(value = "name") String name);
}
