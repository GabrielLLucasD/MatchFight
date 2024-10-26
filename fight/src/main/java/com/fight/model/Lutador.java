package com.fight.model;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;


@Entity
@Table(name="lutador")
public class Lutador {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_lutador")
	@SequenceGenerator(name="id_lutador", sequenceName = "id_lutador", allocationSize = 1)
	@Column(name="id")
	private Long id;
	
	@Column(name ="nome", nullable = false)
	private String nome;
	
	@Column(name ="data_nascimento",nullable = false)
	private LocalDateTime dataNascimento;
	
	@ManyToOne
	@JoinColumn(name="id_academia", nullable = false)
	private Academia academia;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id_arte", nullable = false)
	private List<Arte> artes;

	@Column(name = "disponivel_luta", nullable = false)
	private Boolean disponivelLuta;
	
	
	
	
	public Lutador() {
		
	}
	public Lutador(LutadorDTO lutadorDTO) {
		this.nome = lutadorDTO.getNome();
		this.dataNascimento = lutadorDTO.getDataNascimento();
		this.academia = lutadorDTO.getAcademia();
		this.disponivelLuta = lutadorDTO.getDisponivel();
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

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	
}
