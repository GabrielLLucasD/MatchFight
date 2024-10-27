package com.fight.model;

import java.time.LocalDateTime;

public class LutadorDTO {

    private Long id;
    private String nome;
    private LocalDateTime dataNascimento;
    private Double peso;
    private Long idAcademia;
    private String graduacao;
    private Boolean disponivelLuta;

    public LutadorDTO() {}

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

	public Long getIdAcademia() {
        return idAcademia;
    }

    public void setIdAcademia(Long idAcademia) {
        this.idAcademia = idAcademia;
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

    public void setDisponivelLuta(Boolean disponivel) {
        this.disponivelLuta = disponivel;
    }
}

