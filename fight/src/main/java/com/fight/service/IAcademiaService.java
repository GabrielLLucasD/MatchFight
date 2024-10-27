package com.fight.service;

import java.util.List;

import com.fight.model.Academia;

public interface IAcademiaService {

    public Academia cadastrarAcademia(Academia academia);
    public Academia alterarInfoAcademia(Academia academia);
    public Academia excluirAcademia(Academia academia);
    public Academia adicionarAluno(Long idAcademia, Long idAluno);
    public Academia excluirAluno(Long idAcademia, Long idAluno);
    public List<Academia> buscarAluno(Long idAluno);
    public Academia buscarPorId(Long idAcad); 
    public List<Academia> buscarPorPalavraChave(String key);
}
