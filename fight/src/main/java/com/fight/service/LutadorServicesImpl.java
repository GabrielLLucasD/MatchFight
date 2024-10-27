package com.fight.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fight.dao.LutadorDAO;
import com.fight.model.Academia;
import com.fight.model.Lutador;
import com.fight.model.LutadorDTO;

@Component
public class LutadorServicesImpl implements ILutadorService {

    @Autowired
    private LutadorDAO dao;

    @Autowired
    private IAcademiaService academiaService;

    @Override
    public Lutador cadastrarLutador(LutadorDTO lutadorDTO) {

        Academia academia = academiaService.buscarPorId(lutadorDTO.getIdAcademia());
        return dao.save(new Lutador(lutadorDTO, academia));
    }
    @Override
    public Lutador atualizarInfoLutador(LutadorDTO lutadorDTO) {
    	Academia academia = academiaService.buscarPorId(lutadorDTO.getIdAcademia());
        return dao.save(new Lutador(lutadorDTO, academia));
    }

    @Override
    public Lutador excluirLutador(Long id) {
        Lutador lutador = dao.findById(id).orElse(null);
        if (lutador != null) {
            dao.deleteById(id);
        }
        return lutador;
    }

    @Override
    public List<Lutador> listarLutadores() {
        return (List<Lutador>) dao.findAll();
    }

    @Override
    public List<Lutador> buscarPorPalavraChave(String key) {
        return dao.findByNomeContainingIgnoreCase(key);
    }

    @Override
    public Lutador buscarPorId(Long id) {
        return dao.findById(id).orElse(null);
    }


    @Override
    public List<Lutador> casarLutas(Lutador lutador) {
        List<Lutador> todosLutadores = (List<Lutador>) dao.findAll();
        
        return todosLutadores.stream()
            .filter(outroLutador -> !outroLutador.getId().equals(lutador.getId())) // Lutador nao pode lutar contra ele mesmo
            .filter(outroLutador -> outroLutador.getGraduacao().equals(lutador.getGraduacao())) // Lutador precisa ter a mesma graduacao
            .filter(outroLutador -> Math.abs(outroLutador.getPeso() - lutador.getPeso()) <= 10) // A categoria dos lutadores sao ate 10 kg de diferenca
            .filter(outroLutador -> Math.abs(outroLutador.getDataNascimento().getYear() - lutador.getDataNascimento().getYear()) <= 2) // A idade dos lutadores dentro de 2 anos
            .collect(Collectors.toList());
    }


}
