package com.mindtree.brand.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.brand.entities.Brand;
import com.mindtree.brand.exception.BrandserviceException;
import com.mindtree.brand.exception.NoSuchBrandException;
import com.mindtree.brand.repository.BrandRepository;
import com.mindtree.brand.service.CommonService;
@Service
public class CommonSAerviceImpl implements CommonService{
	@Autowired
	private BrandRepository brandRepository;

	@Override
	public Brand addBrand(Brand brand) {
		Brand brand2=null;
		if(brand!=null )
		{
		brand2=	brandRepository.save(brand);
		}
		else
		{
			return null;
		}
		
		return brand2;
	}

	@Override
	public List<Brand> getAllBrand() {
		List<Brand> brand2 = new ArrayList<Brand>();
		
			brand2=(brandRepository.findAll());
		
		
		return brand2;
	}

	@Override
	public Brand getBrandById(int brandId) throws BrandserviceException {
		Brand brand3= new Brand();
		brand3=brandRepository.findById(brandId).orElse(null);
		if(brand3!=null)
		{
			return brand3;
		}
		else
		{
			throw new NoSuchBrandException("There is no such brand with the id entered");
		}
	
	}

}
