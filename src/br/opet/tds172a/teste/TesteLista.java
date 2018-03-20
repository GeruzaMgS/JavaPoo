package br.opet.tds172a.teste;

import java.util.Vector;

public class TesteLista {

	public static final int MAX_ITENS = 10;

	public static void main(String[] args) {

		String[] meuArray = new String[2];

		meuArray[0] = "Joao";
		meuArray[1] = "Maria";

		for (int i = 0; i < meuArray.length; i++) {
			System.out.println(meuArray[1]);
		}

		Vector<String> listaStrings = new Vector<String>();

		listaStrings.add("v_Joao");
		listaStrings.add("v_Maria");

		for (int i = 0; i < listaStrings.size(); i++) {

			String objRecuperado = listaStrings.get(1);
			System.out.println(objRecuperado);

		}

	}

}
