package br.opet.tds172a.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class TesteLista {

	public static final int MAX_ITENS = 10;

	public static void main(String[] args) {

		LinkedList<Integer> listaLinkedList = new LinkedList<Integer>();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaLinkedList.add(i);
		}

		long comecaLong = System.nanoTime();
		for (int i = 0; i < MAX_ITENS; i++) {
			listaLinkedList.get(i);
		}

		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaLinkedList.remove(i);
		}
		long terminaLong = System.nanoTime();
		System.out.println("ListaLinkedList get...\t" + (terminaLong - comecaLong));
//**
		Vector<Integer> listaVectors = new Vector<Integer>();
		long startLong = System.nanoTime();

		for (int i = 0; i < MAX_ITENS; i++) {
			listaVectors.add(i);
		}

		for (int i = 0; i < MAX_ITENS; i++) {
			listaVectors.get(i);
		}

		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaVectors.remove(i);
		}
		long endLong = System.nanoTime();
		System.out.println("ListaVectors get...\t" + (endLong - startLong));
//**
		ArrayList<Integer> listaArrays = new ArrayList<Integer>();
		long inicioLong = System.nanoTime();

		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrays.add(i);
		}

		for (int i = 0; i < MAX_ITENS; i++) {
			listaArrays.get(i);
		}
		for (int i = MAX_ITENS - 1; i >= 0; i--) {
			listaArrays.remove(i);
		}

		long fimLong = System.nanoTime();
		System.out.println("ArrayList get...\t" + (fimLong - inicioLong));

	}

}
