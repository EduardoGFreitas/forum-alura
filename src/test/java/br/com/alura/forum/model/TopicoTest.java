package br.com.alura.forum.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TopicoTest {

	@Test
	public void o_estado_inicial_de_um_topico_deve_ser_nao_respondido() {
		// Dado
		Usuario autor = new Usuario("Newton", "newton@caelum.com", "abc123");
		Categoria categoria = new Categoria("Programação");
		Curso curso = new Curso("Java Básico", categoria );
		Topico topico = new Topico("Me ajudem", "O Java não funciona no meu computador!", autor , curso );
				
		// Então
		assertEquals(StatusTopico.NAO_RESPONDIDO, topico.getStatus());
	}
	
	@Test
	public void o_estado_deve_ser_fechado_quando_fechar_um_topico(){
		//Dado
		Usuario autor = new Usuario("Newton", "newton@caelum.com", "abc123");
		Categoria categoria = new Categoria("Programação");
		Curso curso = new Curso("Java Básico", categoria );
		Topico topico = new Topico("Me ajudem", "O Java não funciona no meu computador!", autor , curso );
		// Quando
		topico.fechar();
		// Então
		assertEquals(StatusTopico.FECHADO, topico.getStatus()); 
		
	}

}
