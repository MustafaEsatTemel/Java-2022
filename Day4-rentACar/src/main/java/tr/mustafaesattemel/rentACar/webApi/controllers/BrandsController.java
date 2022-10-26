package tr.mustafaesattemel.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.mustafaesattemel.rentACar.business.abstracts.BrandService;
import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
	
	private BrandService brandService;
	
	@Autowired//Brandservice nesnesini bulurum ben hehehee boi
	public BrandsController(BrandService brandService) {
		//super();
		this.brandService = brandService;
	}
	
	@GetMapping("/getAll") //mustafaesattemel.me/api/brands/getAll
	public List<Brand> getAll(){
		return brandService.getAll();
	}
	
}
