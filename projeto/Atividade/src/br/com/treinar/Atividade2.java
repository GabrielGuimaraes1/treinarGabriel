package br.com.treinar;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		int minutos = 100;
		int resto = minutos%60;
		int horas = (minutos-resto)/60;
		
		System.out.println(horas+":"+resto);
		
	}
	
	

}
