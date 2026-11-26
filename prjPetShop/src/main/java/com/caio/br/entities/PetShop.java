package com.caio.br.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="Tb_PetShop")
public class PetShop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private String tipo;
	
	private String raca;
	
	private int idade;
	
	private String sexo;
	
	@Lob
	private byte[] foto;
	
	private String tutorNome;
	
public PetShop() {
		
	}

public PetShop(Long id, String nome, String tipo, String raca, int idade, String sexo, byte[] foto, String tutorNome) {
	super();
	this.id = id;
	this.nome = nome;
	this.tipo = tipo;
	this.raca = raca;
	this.idade = idade;
	this.sexo = sexo;
	this.foto = foto;
	this.tutorNome = tutorNome;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public String getRaca() {
	return raca;
}

public void setRaca(String raca) {
	this.raca = raca;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public byte[] getFoto() {
	return foto;
}

public void setFoto(byte[] foto) {
	this.foto = foto;
}

public String getTutorNome() {
	return tutorNome;
}

public void setTutorNome(String tutorNome) {
	this.tutorNome = tutorNome;
}



}
