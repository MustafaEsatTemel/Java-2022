package tr.mustafaesattemel.rentACar.dataAccess.abstracts;

import java.util.List;


import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

public interface BrandRepository {
	
	List<Brand> getAll();
	

}
