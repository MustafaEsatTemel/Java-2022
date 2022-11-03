package tr.mustafaesattemel.rentACar.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.mustafaesattemel.rentACar.entities.concretes.Brand;

//Brand'in primary key'i hangi turden ? Integer. Artik bu sayede List<Brand> getAll();'i sutlayabiliriz.
//JpaRepository sayesinde bircok method gelecek getAll gibi. Ayni sekilde artik inMemoryBrandRep.'i(class) de silebilirsin.
//Yani Jpa sana arkaplanda BrandRepository'den implemente etmis bir class veriyor.
public interface BrandRepository extends JpaRepository<Brand,Integer> {
	
}
