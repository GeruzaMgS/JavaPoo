package model;

import java.util.ArrayList;

import control.Automovel;
import control.Motocicleta;
import control.Veiculo;

public class Teste {

	public static void main(String[] args) {
		//Veiculo v = new Veiculo();
		
		Veiculo automovel = new Automovel("Fiat ", "142");
		Automovel auto2 = new Automovel("Ga ", "Vectra");
		Automovel auto3 = new Automovel("VW ", "Gol");
		Veiculo moto = new Motocicleta("Honda ","CG");
	
		
		ArrayList <Veiculo> listaAutomoveis = new ArrayList <Veiculo>();
		
		
		listaAutomoveis.add(auto2);
		listaAutomoveis.add(auto3);
		
		for(Veiculo veiculoRecuperado: listaAutomoveis) {
			veiculoRecuperado.acelerar(120);
		}
	}

}
