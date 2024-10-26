package com.fight.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="academia")
public class Academia {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_academia")
	@Column(name = "id")
	private Long id;

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "mestre", nullable = false)
	private String mestre;
	
	@Column(name = "telefone", nullable = false)
	private String telefone;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@OneToMany(mappedBy = "academia", cascade = CascadeType.ALL)
	@JoinColumn(name="id_lutador")
	private List<Lutador> alunos;

	
	
	public Academia() {
		
	}
	public Academia(AcademiaDTO academiaDTO) {
		
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

	public String getMestre() {
		return mestre;
	}

	public void setMestre(String mestre) {
		this.mestre = mestre;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public List<Lutador> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Lutador> alunos) {
		this.alunos = alunos;
	}
	
	

	
}
