package desafio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Exercicio3 {
	private static ArrayList<Double> items = new ArrayList<Double>();
	public static void main(String[] args) {
		lerArquivo();
		double valorMaximo = maior(items);
		double valorMinimo = menor(items);
		long dias = media(valorMaximo);
		
		
		System.out.println("O maior valor de faturamento: R$" + valorMaximo);
		System.out.println("O menor valor de faturamento: R$" + valorMinimo);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: " + dias);
	}
	
	
	public static void lerArquivo() {
		JSONParser json = new JSONParser();
		
		try (FileReader reader = new FileReader("dados.json"))
        {
            Object dados = json.parse(reader);
 
            JSONArray saldos = (JSONArray) dados;
            
            saldos.forEach( saldo -> addSaldo((JSONObject) saldo) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}
	
	public static void addSaldo(JSONObject saldo) {
		double valor = (double) saldo.get("valor");
		items.add(valor);
	}
	
	public static double menor(ArrayList<Double> input) {
		return input.stream().filter(v -> v > 0).mapToDouble(Double::intValue).min().orElseGet(null);
	}
	
	public static double maior(ArrayList<Double> input) {
		return input.stream().mapToDouble(Double::intValue).max().orElseGet(null);
	}
	
	public static long media(double value) {
		double total = items.stream().filter(v -> v > 0).mapToDouble(Double::intValue).average().orElseGet(null);
		return items.stream().filter(v -> v > total).count();
	}
}
