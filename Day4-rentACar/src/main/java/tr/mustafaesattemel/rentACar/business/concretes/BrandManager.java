package tr.mustafaesattemel.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.mustafaesattemel.rentACar.business.abstracts.BrandService;
import tr.mustafaesattemel.rentACar.business.requests.CreateBrandRequest;
import tr.mustafaesattemel.rentACar.business.responses.GetAllBrandsResponse;
import tr.mustafaesattemel.rentACar.dataAccess.abstracts.BrandRepository;
import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

//is kurallari.

@Service//Bu sinif bir business nesnesidir.
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;

	@Autowired //Yazmasan da calisir fakat sen yaz :D Bize BrandRepositorty nesnesi ver diyoruz. InMemory gibi.
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	@Override
	public List<GetAllBrandsResponse> getAll() {
		List<Brand> brands = brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse = new ArrayList<>();
		
		for(Brand brand : brands) {
			GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			
			brandsResponse.add(responseItem);
		}
		
		return brandsResponse;
	}

	@Override
	public void add(CreateBrandRequest createBrandRequest) {
		
		Brand brand = new Brand();
		brand.setName(createBrandRequest.getName());
		
		brandRepository.save(brand);
		
	}

}
