package com.mindtree.brand.clientcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.brand.dto.ErrorDto;
import com.mindtree.brand.entities.Brand;
import com.mindtree.brand.exception.BrandAppException;
import com.mindtree.brand.service.CommonService;

@RestController
@RequestMapping("/brandclient")
public class ClientController {
	@Autowired
	private CommonService service;

	public ErrorDto createErrorDto(Exception e) {
		ErrorDto dto = new ErrorDto();
		dto.setErrorType(e.getClass().getCanonicalName());
		dto.setMessage(e.getMessage());
		return dto;
	}

	@PostMapping("/addBrand")
	public ResponseEntity<?> addBrand(@RequestBody Brand brand) {
		Brand brand2 = null;
		if (brand != null) {
			brand2 = service.addBrand(brand);
		} else
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		return new ResponseEntity<Brand>(brand2, HttpStatus.OK);
	}

	@GetMapping("/getallBrand")
	public ResponseEntity<?> getAllBrand() {
		List<Brand> list = new ArrayList<Brand>();
		list = (service.getAllBrand());
		if (list != null)
			return new ResponseEntity<List<Brand>>(list, HttpStatus.OK);
		else
			return new ResponseEntity<Brand>(HttpStatus.BAD_REQUEST);

	}

	@GetMapping("/getBrand/{brandId}")
	public ResponseEntity<?> getBrandByid(@PathVariable int brandId) {
		Brand brand2 = null;
		try {
			brand2 = service.getBrandById(brandId);
		} catch (BrandAppException e) {

			return new ResponseEntity<ErrorDto>(createErrorDto(e), HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<Brand>(brand2, HttpStatus.OK);

	}

}
