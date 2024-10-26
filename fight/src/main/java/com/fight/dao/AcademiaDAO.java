package com.fight.dao;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.fight.model.Academia;

public interface AcademiaDAO extends CrudRepository <Academia, Long>{
	public List<Academia> findByNome(String nome);
	public List<Academia> findByMestre(String mestre);
}
