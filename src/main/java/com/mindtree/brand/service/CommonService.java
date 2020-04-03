package com.mindtree.brand.service;



import java.util.List;

import com.mindtree.brand.entities.Brand;
import com.mindtree.brand.exception.BrandserviceException;



public interface CommonService {

	 public Brand addBrand(Brand brand);
	 public List<Brand> getAllBrand();
	 public Brand getBrandById(int brandId) throws BrandserviceException;
		 
	 

}
