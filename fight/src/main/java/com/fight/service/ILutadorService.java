package com.fight.service;

import java.util.List;


import com.fight.model.Lutador;


public interface ILutadorService {
	public Lutador cadastrarLutador(Lutador lutador);
	public Lutador atualizarInfoLutador(Lutador lutador);
	public Lutador excluirLutador(Long id);
	
	public List<Lutador> listarLutadores();
	public List<Lutador> buscarPorPalavraChave(String key);
	public List<Lutador> buscarPorId(Long id);
}
