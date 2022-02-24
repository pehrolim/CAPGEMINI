package test.java;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.capgemini.desafio.Questao3;

class Questao3Test {

	@Test
	public void deveriaRetornarDois() {
		Questao3 anagrama = new Questao3();
		int pares =  anagrama.montaParesAnagrama("ovo");
		Assert.assertEquals(2, pares);
	}
	
	@Test
	public void deveriaRetornarTres() {
		Questao3 anagrama = new Questao3();
		int pares =  anagrama.montaParesAnagrama("ifailuhkqq");
		Assert.assertEquals(3, pares);
	}
	
	@Test
	public void deveriaRetornarZero() {
		Questao3 anagrama = new Questao3();
		int pares =  anagrama.montaParesAnagrama("abc");
		Assert.assertEquals(0, pares);
	}

}
