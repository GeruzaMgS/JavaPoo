import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * definicao dos imports necessarios
 */

/**
 * Classe para testar a performance das listas: ArrayList, Vector, e LinkedList
 * 
 * @author Prof. Joao Andrei
 * @since 14 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainList {
	/*
	 * inicio das declaracoes dos attibutos da classe
	 */
	/**
	 * atributo estatico para indicar o numero maximo de itens a ser utilizado
	 * nas listas
	 */
	final static int MAX_ITENS = 10;

	/*
	 * definicao dos construtores
	 */
	/**
	 * Construtor padrao
	 */
	public MainList() {
	}

	/**
	 * Metodo estatico para iniciar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> listaArrayList = new ArrayList<>();

		Date data = new Date();
		// System.out.println(data.toString());

		SimpleDateFormat sdf = null;
		sdf = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss:SSSSSSSS");

		String dataString = sdf.format(data);

		// System.out.println(dataString + "\n");

		// vai iniciar o add dos listes
		long inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrayList.add(i);
		}
		long fimLong = System.nanoTime();

		System.out.println("ArrayList add...: " + (fimLong - inicioLong));

		// vai iniciar o get dos listes
		inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrayList.get(i);
		}
		fimLong = System.nanoTime();

		System.out.println("ArrayList get...: " + (fimLong - inicioLong));

		// vai iniciar o remove dos listes
		inicioLong = System.nanoTime();
		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaArrayList.remove(i);
		}
		fimLong = System.nanoTime();

		System.out.println("ArrayList remove: " + (fimLong - inicioLong));

		data = new Date();
		dataString = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss:SSSSSSSS").format(data);
		// System.out.println("\n" + dataString);

		List<Integer> listaVector = new Vector<>();

		data = new Date();
		// System.out.println("\n\n");

		sdf = new SimpleDateFormat("MM/dd/yyyy HH:MM:ss:SSSSSSSS");

		dataString = sdf.format(data);

		// System.out.println(dataString + "\n");

		// vai iniciar o add dos listes
		inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaVector.add(i);
		}
		fimLong = System.nanoTime();

		System.out.println("Vector add...: " + (fimLong - inicioLong));

		// vai iniciar o get dos listes
		inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaVector.get(i);
		}
		fimLong = System.nanoTime();

		System.out.println("Vector get...: " + (fimLong - inicioLong));

		// vai iniciar o remove dos listes
		inicioLong = System.nanoTime();
		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaVector.remove(i);
		}
		fimLong = System.nanoTime();

		System.out.println("Vector remove: " + (fimLong - inicioLong));

		data = new Date();
		dataString = new SimpleDateFormat("dd/MM/yyyy hh:MM:ss:SSSSSSSS").format(data);
		// System.out.println("\n" + dataString);

		List<Integer> listaLinkedList = new LinkedList<>();

		// System.out.println(dataString + "\n");

		// vai iniciar o add dos listes
		inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaLinkedList.add(i);
		}
		fimLong = System.nanoTime();

		System.out.println("LinkedList add...: " + (fimLong - inicioLong));

		// vai iniciar o get dos listes
		inicioLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaLinkedList.get(i);
		}
		fimLong = System.nanoTime();

		System.out.println("LinkedList get...: " + (fimLong - inicioLong));

		// vai iniciar o remove dos listes
		inicioLong = System.nanoTime();
		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaLinkedList.remove(i);
		}
		fimLong = System.nanoTime();

		System.out.println("LinkedList remove: " + (fimLong - inicioLong));

		data = new Date();
		// dataString = new SimpleDateFormat("dd/MM/yyyy
		// hh:MM:ss:SSSSSSSS").format(data);
		// System.out.println("\n" + dataString);

	}
	/*
	 * List<Integer> listaVector = new ArrayList<>();
	 */
	/*
	 * List<Integer> listaLinkedLIst = new LinkedList<>();
	 */

}
