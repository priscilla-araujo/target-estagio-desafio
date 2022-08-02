package desafio;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma palavra:");
		String palavra = entrada.next();
		
		for(int i = (palavra.length()-1); i >= 0; i--) {
			System.out.print(palavra.charAt(i));
		}
		
		entrada.close();
		
	}
}
