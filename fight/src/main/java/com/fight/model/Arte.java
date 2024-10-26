package com.fight.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="arte")
public class Arte {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_arte")
	@Column(name= "id")
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "graduacao", nullable = false)
	private String graduacao;
	
	public Arte() {
		
	}
	
	public Arte(ArteDTO arteDTO) {

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

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	
	
	
}
