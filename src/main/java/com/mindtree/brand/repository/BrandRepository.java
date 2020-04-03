package com.mindtree.brand.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.brand.entities.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand,Integer>{

}
