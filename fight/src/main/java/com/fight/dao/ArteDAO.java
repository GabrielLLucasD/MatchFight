package com.fight.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fight.model.Arte;

public interface ArteDAO extends CrudRepository <Arte, Long> {
	public List<Arte> findByName(String nome);
	public List<Arte> findByGraduacao(String graduacao);
	public List<Arte> findByLutadorId(Long id);
}
