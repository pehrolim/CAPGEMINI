package com.capgemini.desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {

		String palavra;
		int valor;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		palavra = teclado.next();
		valor = montaParesAnagrama(palavra);

		System.out.println(valor);
	}

	public static int montaParesAnagrama(String palavra) {

		HashMap<String, Integer> map = new HashMap<>();
		int a, b;
		int tamanhoDaPalavra = palavra.length();

		for (a = 0; a < tamanhoDaPalavra; a++) {
			
			for (b = a; b < tamanhoDaPalavra; b++) {
				
				char[] arrayPalavra = palavra.substring(a, b + 1).toCharArray();
				Arrays.sort(arrayPalavra);
				String novoArrayPalavra = new String(arrayPalavra);
				
				if (map.containsKey(novoArrayPalavra)) {
					map.put(novoArrayPalavra, map.get(novoArrayPalavra) + 1);
				}else {
					map.put(novoArrayPalavra, 1);
				}
					
			}
		}

		int paresAnagrama = 0;
		for (String chave : map.keySet()) {
			int x = map.get(chave);
			paresAnagrama += (x * (x - 1)) / 2;
		}
		return paresAnagrama;
	}
}
