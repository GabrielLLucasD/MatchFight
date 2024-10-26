package com.fight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fight.dao.LutadorDAO;
import com.fight.model.Lutador;

@Service
public class LutadorServicesImpl implements ILutadorService{

	@Autowired
	private LutadorDAO dao;
	
	@Override
	public Lutador cadastrarLutador(Lutador lutador) {
		// TODO Auto-generated method stub
		return dao.save(lutador);
	}

	@Override
	public Lutador atualizarInfoLutador(Lutador lutador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Lutador excluirLutador(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lutador> listarLutadores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lutador> buscarPorPalavraChave(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Lutador> buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
