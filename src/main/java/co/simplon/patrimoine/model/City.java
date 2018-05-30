package co.simplon.patrimoine.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

//JPA a besoin des annotaion
@Entity
@Table(name="City")
public class City {
	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String name;
	//indiquer le type relation que l'on veut mettre en place : one to one(un pays a une capitale et inversement), one to many, many to one, many to many
	//l'entité city à plusieurs monuments et MappedBy prends le nom de l'attribut dans la classe monument
	@OneToMany
	private List<Monument> monuments = new ArrayList<>();
	//Hibernate à besoin d'un constructeur vide
	public City()  {}
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
	public List<Monument> getMonuments() {
		return monuments;
	}
	public void setMonuments(List<Monument> monuments) {
		this.monuments = monuments;
	}
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", monuments=" + monuments.size() + "]";
	};
	
	
}
