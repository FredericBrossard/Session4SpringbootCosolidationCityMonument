package co.simplon.patrimoine.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Monument {
	@Id
	@GeneratedValue
	private Long id;
	
	
	@Column
	private String name;
	
	//c'est ce nom d'objet attribut qui sera dans le mappedby de l entité City
	@ManyToOne
	private City city;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Monument [id=" + id + ", name=" + name + ", city=" + city.getName() + "]";
	}

	
}
