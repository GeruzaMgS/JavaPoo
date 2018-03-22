
/*
 * imports necessarios
 */
import java.util.ArrayList;
import java.util.List;

/**
 * Classe para exemplificar o uso de listas, numeros randomicos e exceptions
 * Aluno sorteado para apresentar seu trabalho na sala
 * 
 * @author Prof. Joao Andrei
 * @since 10 de mar de 2016
 * @version 1.0.0
 */
public class MainRandom {

	/*
	 * definicao dos contrutores
	 */
	/**
	 * construtor padrao da classe
	 */
	public MainRandom() {
	}

	/*
	 * metodos de ações da classe
	 */
	/**
	 * metodo para iniciar o java aplication
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Integer idChamada = new Integer(0);
		Boolean continua = new Boolean(true);

		List<String> listaAlunos = new ArrayList<String>();
		
		montaListaProjetos(listaAlunos);

		do {
			try {
				idChamada = (new Double(Math.random() * 100))
						.intValue();

				String achouAluno = listaAlunos.get(idChamada);
				System.out.println("\nNumero da sorte encontrado: " + idChamada + "\n\n");
				System.out.println("Aluno escolhido:\n");
				System.out.println("-------->  " + achouAluno.toUpperCase() + "  <--------");
				continua = false;
			} catch (Exception e) {
				System.out.println(e.getMessage()+"Numero da sorte NAO encontrado: " + idChamada);
				continua = true;
			}
		} while (continua);
	}

	/**
	 * metodo para montar a lista de alunos para participarem do sorteio
	 * 
	 * @param listaAlunos
	 *            List<String> - lista de alunos
	 */
	public static void montaListaAlunos(List<String> listaAlunos) {
		listaAlunos.add("Alejandro");
		listaAlunos.add("Alex");
		listaAlunos.add("Allan");
		listaAlunos.add("Antonio");
		listaAlunos.add("Daniel");
		listaAlunos.add("Emerson");
		listaAlunos.add("Fabio");
		listaAlunos.add("Felipe Bogado");
		listaAlunos.add("Felipe Pereira");
		listaAlunos.add("Fernando");
		listaAlunos.add("Gabriel");
		listaAlunos.add("Gilmar");
		listaAlunos.add("Guilherme");
		listaAlunos.add("Ibere");
		listaAlunos.add("Jose");
		listaAlunos.add("Kauan");
		listaAlunos.add("Leonardo");
		listaAlunos.add("Lucas");
		listaAlunos.add("Luiz");
		listaAlunos.add("Marcelo");
		listaAlunos.add("Rafael");
		listaAlunos.add("Reginaldo");
		listaAlunos.add("Rhullyan");
		listaAlunos.add("Ricardo");
		listaAlunos.add("Rodrigo Cesar");
		listaAlunos.add("Rodrigo da Paixao");
		listaAlunos.add("Sandra");
		listaAlunos.add("Suzana");
		listaAlunos.add("Thiago Nogarolli");
		listaAlunos.add("Vinicius");
		listaAlunos.add("Thiago Nazar");
		listaAlunos.add("Franciane");
		listaAlunos.add("Juan");
		listaAlunos.add("Rafael Matucheski");
		listaAlunos.add("Thiago Cardozo");
		listaAlunos.add("Welinton");
		listaAlunos.add("Ikaro");
	}
	
	public static void montaListaProjetos(List<String> listaAlunos) {
		listaAlunos.add("Honney distribuidora de bebidas LTDA");
		listaAlunos.add("Projeto Service Desk chamados");
		listaAlunos.add("Alugue Service");
		listaAlunos.add("2Jobs");
		listaAlunos.add("Rede social para amantes de automóveis");
		listaAlunos.add("Controle de Estoque(Petterson Cristhian Grendel M.E.");
		listaAlunos.add("Clean Code");
		listaAlunos.add("D3CWork");
		listaAlunos.add("Panificadora SABOR DO PÃO");
		listaAlunos.add("Controle de Almoxarifado");
		listaAlunos.add("Controle de Imobilizados");
	}
}
