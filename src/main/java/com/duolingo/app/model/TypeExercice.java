package com.duolingo.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "type_exercices")
public class TypeExercice implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idTypeExercice")
	private int idTypeExercice;
	
	@Column(name = "nameTypeExercice")
	private String nameTypeExercice;
	
	@OneToMany(mappedBy = "idTypeExercice", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Exercice> exercices;
	
	public TypeExercice() {}

	public TypeExercice(int idTypeExercice, String nameTypeExercice) {
		super();
		this.idTypeExercice = idTypeExercice;
		this.nameTypeExercice = nameTypeExercice;
	}

	public int getIdTypeExercice() {
		return idTypeExercice;
	}

	public void setIdTypeExercice(int idTypeExercice) {
		this.idTypeExercice = idTypeExercice;
	}

	public String getNameTypeExercice() {
		return nameTypeExercice;
	}

	public void setNameTypeExercice(String nameTypeExercice) {
		this.nameTypeExercice = nameTypeExercice;
	}

	@Override
	public String toString() {
		return nameTypeExercice;
	}
}
