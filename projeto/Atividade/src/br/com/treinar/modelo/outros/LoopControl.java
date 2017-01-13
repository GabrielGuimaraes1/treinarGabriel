package br.com.treinar.modelo.outros;

public class LoopControl {

	public static void main(String[] args) {
		int x = 10;
		
		fora:
		while (true){
		
			while (x < 30) {
				System.out.println("value of x: "+x);
				x++;
				if (x==17) {
					break fora;
				}
			}
		}
	}

}
