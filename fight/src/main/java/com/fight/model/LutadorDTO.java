package com.fight.model;

import java.time.LocalDateTime;

public class LutadorDTO {

		private Long id;
		private String nome;
		private LocalDateTime dataNascimento;
		private Academia academia;
		private Boolean disponivel;
		
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

		public Academia getAcademia() {
			return academia;
		}

		public void setAcademia(Academia academia) {
			this.academia = academia;
		}

		public Boolean getDisponivel() {
			return disponivel;
		}

		public void setDisponivel(Boolean disponivel) {
			this.disponivel = disponivel;
		}
		
		
}
