package tr.mustafaesattemel.rentACar.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.mustafaesattemel.rentACar.business.abstracts.BrandService;
import tr.mustafaesattemel.rentACar.dataAccess.abstracts.BrandRepository;
import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

@Service//Bu sinif bir business nesnesidir.
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;

	@Autowired //Yazmasan da calisir fakat sen yaz :D Bize BrandRepositorty nesnesi ver diyoruz. InMemory gibi.
	public BrandManager(BrandRepository brandRepository) {
		this.brandRepository = brandRepository;
	}
	
	@Override
	public List<Brand> getAll() {
		// is kurallari.
		return brandRepository.getAll();
	}

}
