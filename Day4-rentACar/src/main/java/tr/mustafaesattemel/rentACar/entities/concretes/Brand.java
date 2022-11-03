package tr.mustafaesattemel.rentACar.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "brands") //Sen, veritabanindaki brands tablosuna aitsin.
//@Data //@Getter - @Setter
@Getter
@Setter
@NoArgsConstructor //Parametresiz costructor.
@AllArgsConstructor //Parametreli constructor da getir.
@Entity//Sen bir nesnesin.
public class Brand {

	@Id//Sen veritabanindaki primary keysin.
	@GeneratedValue(strategy = GenerationType.IDENTITY) //id'ler otomatik artan.
	@Column(name="id")//Sen veritabanindaki id column'unu temsil ediyorsun.
	private int id;
	
	@Column(name="name")//Sen veritabanindaki name column'unu temsil ediyorsun.
	private String name;
	

	
	
	
}
