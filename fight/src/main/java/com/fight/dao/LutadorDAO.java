package com.fight.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fight.model.Lutador;

public interface LutadorDAO extends CrudRepository <Lutador , Integer>{

	public List<Lutador> findByAcademia(Long idAcademia);
	List<Lutador> findByDataNascimentoBetween(LocalDateTime startDate, LocalDateTime endDate);
	List<Lutador> findByArtesNome(String nomeArte);
	List<Lutador> findByArteAndGraduacao(String arte, String graduacao);


}
