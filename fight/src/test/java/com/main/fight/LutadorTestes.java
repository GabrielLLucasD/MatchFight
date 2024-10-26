package com.main.fight;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fight.model.Lutador;
import com.fight.service.ILutadorService;

@SpringBootTest
public class LutadorTestes {
	
	
	@Autowired
	private ILutadorService service;
	
	@Test
	public void shouldRecordLutador() {
		System.out.println("test shouldRecordLutador");	
		Lutador l = new Lutador();
		l.setNome("Gabri");
		assertNotNull(service.cadastrarLutador(l));
	}	
}
