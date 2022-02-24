package test.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao2;



class Questao2Test {

	@Test
	public void deveriaRetornarTres() {
		Questao2 verificador = new Questao2();
		int resultado = verificador.verificaSenha("Ya3");
		
		Assert.assertEquals(3, resultado);
	}
	
	@Test
	public void deveriaRetornarZero() {
		Questao2 verificador = new Questao2();
		int resultado = verificador.verificaSenha("Ya3&ab");
		
		Assert.assertEquals(0, resultado);
	}

}
