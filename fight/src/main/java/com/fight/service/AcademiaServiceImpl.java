package com.fight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fight.dao.AcademiaDAO;
import com.fight.model.Academia;

@Service
public class AcademiaServiceImpl implements IAcademiaService {

    @Autowired
    private AcademiaDAO academiaDAO;

    @Override
    public Academia cadastrarAcademia(Academia academia) {
        return academiaDAO.save(academia);
    }

    @Override
    public Academia alterarInfoAcademia(Academia academia) {
        return academiaDAO.save(academia);
    }

    @Override
    public Academia excluirAcademia(Academia academia) {
        academiaDAO.delete(academia);
        return academia;
    }

    @Override
    public Academia adicionarAluno(Long idAcademia, Long idAluno) {
        // Implementar lógica para adicionar aluno
        return null;
    }

    @Override
    public Academia excluirAluno(Long idAcademia, Long idAluno) {
        // Implementar lógica para excluir aluno
        return null;
    }

    @Override
    public List<Academia> buscarAluno(Long idAluno) {
        // Implementar lógica para buscar academias por aluno
        return null;
    }

    @Override
    public Academia buscarPorId(Long idAcad) {
        return academiaDAO.findById(idAcad).orElse(null); // Retorna a academia ou null se não existir
    }

    @Override
    public List<Academia> buscarPorPalavraChave(String key) {
        // Implementar lógica para buscar academias por palavra-chave
        return null;
    }
}
