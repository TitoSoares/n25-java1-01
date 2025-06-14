package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("sauro"));
		//Obter a posição do texto
		System.out.println(str01.indexOf("o"));
		//obter o carac na posição desejada
		System.out.println(str01.charAt(3));
		//obeter uma substring
		System.out.println(str01.substring(8));
		//obter uma substring limitando o final
		System.out.println(str01.substring(8,16));
		//Usando o CompareTo
		System.out.println(str01.compareTo("Roberval"));
	}
}
