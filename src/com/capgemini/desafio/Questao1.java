package com.capgemini.desafio;

import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner teclado  = new Scanner(System.in);
		int n;
		
		n = teclado.nextInt();
		
		for (int i = 0; i < n; i++) {
			int cont = n - (i +1);
			int cont2 = n - cont;
				if (cont != 0) {
					for (int y=0; y<cont; y++) {
						System.out.print(" ");
					}
					for (int x = 0; x < cont2; x++) {
						System.out.print("*");
					}
				}else {
					for(int z = 0; z < n; z++) {
						System.out.print("*");
					}
				}
			System.out.println();
		}
		
	}
}


