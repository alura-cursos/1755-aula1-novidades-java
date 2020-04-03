package br.com.alura.factorymethod;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teste {

	//Novidade do Java 9 - Factory Method para Collection.
	public static void main(String[] args) {
		List.of("primeiroNome", "segundoNome");
		Set.of("terceiroNome");
		Map.of("nome", "João");
		/*
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("primeiroNome");
		nomes.add("segundoNome");
		nomes.add("terceiroNome");
		List<String> nomesImutavel = Collections.unmodifiableList(nomes);
		System.out.println(nomesImutavel);
		 */

		List<String> asList = Arrays.asList("nome1", "nome2");
		//asList.add("nome3"); java.lang.UnsupportedOperationException
		//asList.set(1, "nome3"); Ok
		System.out.println(asList);

		List<String> of = List.of("nome1", "nome2");
		//of.add("nome3"); java.lang.UnsupportedOperationException
		//of.set(3, "nome3"); java.lang.UnsupportedOperationException 
		System.out.println(of);
	}
}
