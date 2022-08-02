package desafio;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio4 {
	public static void main(String[] args) {
		
		double sp = 67836.43;
		double rj = 36678.66;
		double mg = 29229.88;
		double es = 27165.48;
		double outro = 19849.53;
		
		Locale localeBR = new Locale("pt", "BR");
		NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
		
		double total = sp + rj + mg + es + outro;
		System.out.println("Total mensal da Distribuidora: " + dinheiro.format(total));
		
		double percSP = ((sp/total) * 100);
		double percRJ = ((rj/total) * 100); 
		double percMG = ((mg/total) * 100);
		double percES = ((es/total) * 100); 
		double percOUTRO = ((outro/total) * 100);
		
		System.out.println("A porcentagem de SP: " + (Math.round(percSP))+ " %");
		System.out.println("A porcentagem de RJ: " + (Math.round(percRJ))+ " %");
		System.out.println("A porcentagem de MG: " + (Math.round(percMG))+ " %");
		System.out.println("A porcentagem de ES: " + (Math.round(percES))+ " %");
		System.out.println("A porcentagem de OUTRO: " + (Math.round(percOUTRO))+ " %");

	}
}
