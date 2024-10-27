package com.fight.model;

import java.time.LocalDateTime;
import jakarta.persistence.*;

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

    @Column(name ="data_nascimento", nullable = false)
    private LocalDateTime dataNascimento;

    @Column(name = "peso", nullable = false)
    private Double peso;
    
    @ManyToOne
    @JoinColumn(name="id_academia", nullable = false)
    private Academia academia;


    @Column(name = "graduacao", nullable = false)
    private String graduacao;
    
    @Column(name = "disponivel_luta", nullable = false)
    private Boolean disponivelLuta;

    public Lutador() {
    }

    public Lutador(LutadorDTO lutadorDTO, Academia academia) {
        this.nome = lutadorDTO.getNome();
        this.dataNascimento = lutadorDTO.getDataNascimento();
        this.academia = academia;
        this.peso = lutadorDTO.getPeso();
        this.disponivelLuta = lutadorDTO.getDisponivelLuta();

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

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Academia getAcademia() {
		return academia;
	}

	public void setAcademia(Academia academia) {
		this.academia = academia;
	}
	
	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public Boolean getDisponivelLuta() {
		return disponivelLuta;
	}

	public void setDisponivelLuta(Boolean disponivelLuta) {
		this.disponivelLuta = disponivelLuta;
	}

}
