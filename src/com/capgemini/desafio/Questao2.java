package com.capgemini.desafio;

import java.util.Scanner;

public class Questao2 {
	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);
		
		String senha = teclado.next();
		
		int ausentes = verificaSenha(senha);
		System.out.println(ausentes);
		
	}
	
	public static int verificaSenha(String senha) {
			int caracteres = senha.length();
		
		if (caracteres < 6) {
			return (6 - caracteres);
		}else
			return 0;
	}
}


