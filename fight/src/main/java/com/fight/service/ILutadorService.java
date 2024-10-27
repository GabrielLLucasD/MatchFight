package com.fight.service;

import java.util.List;

import com.fight.model.Lutador;
import com.fight.model.LutadorDTO;

public interface ILutadorService {
    Lutador cadastrarLutador(LutadorDTO lutadorDTO);
    Lutador buscarPorId(Long id);
	Lutador atualizarInfoLutador(LutadorDTO lutadorDTO);
    Lutador excluirLutador(Long id);
    List<Lutador> listarLutadores();
    List<Lutador> casarLutas(Lutador lutador);
	List<Lutador> buscarPorPalavraChave(String key);

}
