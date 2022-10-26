package tr.mustafaesattemel.rentACar.business.abstracts;

import java.util.List;

import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

public interface BrandService {
	
	List<Brand> getAll();

}
