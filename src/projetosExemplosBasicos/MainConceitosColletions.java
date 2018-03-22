import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import exemplos.collections.Produto;

/**
 * 
 */

/**
 * Classe para testar arrays, colletions
 * 
 * @author Prof. Joao Andrei
 * @since 7 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainConceitosColletions {

	/*
	 * metodos construtores
	 */
	/**
	 * construtor padrao
	 */
	public MainConceitosColletions() {
	}

	/*
	 * acoes da classe
	 */
	/**
	 * metodo main para iniciar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * exemplo de array de produtos
		 */

		System.out.println("Exemplo de array");

		Produto[] arrayProdutos = new Produto[2];
		arrayProdutos[0] = new Produto(1, "celular");
		arrayProdutos[1] = new Produto(2, "computador");

		for (int j = 0; j < arrayProdutos.length; j++) {
			arrayProdutos[j].imprimeProduto();
		}

		System.out.println("Exemplo de collection com for");
		List<Produto> listProdutos = new ArrayList<>();
		listProdutos.add(new Produto(1, "celular"));
		listProdutos.add(new Produto(2, "computador"));

		for (Iterator<Produto> objetoDaLista = listProdutos.iterator(); objetoDaLista.hasNext();) {
			Produto produtoRecuperado = (Produto) objetoDaLista.next();
			produtoRecuperado.imprimeProduto();
		}

		System.out.println("Exemplo de collection outro tipo for");

		for (Produto produtoRecuperado2 : listProdutos) {
			produtoRecuperado2.imprimeProduto();
		}

	}

}
