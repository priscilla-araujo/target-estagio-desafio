package desafio;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int num = entrada.nextInt();
		
		int num1 = 0, num2 = 1, sum = 0;

		while(num > sum) {
			sum = num1 + num2;
			num1 = num2;
			num2 = sum;
		}

		if(sum == num) {
			System.out.println("O número " + num + " pertence a sequência de Fibonacci!");
		}else {
			System.out.println("O número " + num + " não pertence a sequência de Fibonacci!");
		}
		
		
		entrada.close();
	}

}
