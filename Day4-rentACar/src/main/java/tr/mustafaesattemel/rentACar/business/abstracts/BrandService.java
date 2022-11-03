package tr.mustafaesattemel.rentACar.business.abstracts;

import java.util.List;

import tr.mustafaesattemel.rentACar.business.requests.CreateBrandRequest;
import tr.mustafaesattemel.rentACar.business.responses.GetAllBrandsResponse;

public interface BrandService {
	
	List<GetAllBrandsResponse> getAll();
	void add(CreateBrandRequest createBrandRequest);

}
