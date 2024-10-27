package com.fight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.fight.model.Lutador;
import com.fight.model.LutadorDTO;
import com.fight.service.ILutadorService;

@RestController
@RequestMapping("/lutadores")
@CrossOrigin
public class LutadorController {

    @Autowired
    private ILutadorService service;

    @PostMapping
    public ResponseEntity<Lutador> criarLutador(@RequestBody LutadorDTO lutadorDTO) {
        Lutador lutador = service.cadastrarLutador(lutadorDTO);
        return new ResponseEntity<>(lutador, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lutador> buscarLutador(@PathVariable Long id) {
        Lutador lutador = service.buscarPorId(id);
        return new ResponseEntity<>(lutador, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lutador> atualizarLutador(@PathVariable Long id, @RequestBody LutadorDTO lutadorDTO) {
        Lutador lutadorAtualizado = service.atualizarInfoLutador(lutadorDTO);
        return new ResponseEntity<>(lutadorAtualizado, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarLutador(@PathVariable Long id) {
        service.excluirLutador(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
