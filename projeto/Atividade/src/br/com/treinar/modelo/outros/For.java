package br.com.treinar.modelo.outros;

import java.util.Scanner;

public class For {
	
	public static void main(String[] args) {
		
		Scanner nome = new Scanner (System.in);
		Scanner leitor = new Scanner (System.in);
		String impressao;
		
		System.out.println("Qual é o nome a repetir?");
		impressao = nome.nextLine();
		
		System.out.println("Quantas vezes?");
		int quantidade = leitor.nextInt();
		
		for (int i = 1; i <= quantidade; i++) {
			System.out.println(i + " " + impressao);
			
		}
		leitor.close();
	}

}
