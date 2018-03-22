package projetosExemplosBasicos;


import java.util.ArrayList;
import java.util.List;

public class MainListException {
	/**
	 * atributo estatico para indicar o numero maximo de itens a ser utilizado
	 * nas listas
	 */
	final static int MAX_ITENS = 10;

	public MainListException() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<Integer> listaArrayList = new ArrayList<>();

		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrayList.add(i);
		}
		long fimLong = System.nanoTime();

		gerarAlgumaCoisa(listaArrayList);
	}

	/**
	 * @param listaArrayList
	 */
	public static void gerarAlgumaCoisa(List<Integer> listaArrayList) {
		try {
			String nome = null;

			int i = 2;
			int j = 0;
			int x = i / j;

			System.out.println(listaArrayList.get(2));

		} catch (IndexOutOfBoundsException | ArithmeticException e) {

			e.printStackTrace();

			System.out.println("Tentou pegar um indice que nao tem");

		} catch (Exception e1) {

			e1.printStackTrace();

			System.out.println("Tentou pegar um geral");
		}finally {
			System.out.println("sempre executa");
		}
	}
}
