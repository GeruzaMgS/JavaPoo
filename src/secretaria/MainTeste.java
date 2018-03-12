package secretaria;

import com.opet.util.Reader;

public class MainTeste {

	public final static int TAMANHO_LISTA_FUNCIONARIOS = 20;

	public static void main(String[] args) throws Exception {
		
	
		Funcionario[] listaFuncionario = new Funcionario[TAMANHO_LISTA_FUNCIONARIOS];

		int menu = 0;

		while (menu != 9) {

			System.out.println("--- ---");
			System.out.println("1 - INCLUIR FUNCIONÁRIOS");
			System.out.println("2 - LISTAR");
			System.out.println("9 - SAIR");

			menu = Reader.readInt();

			switch (menu) {

			case 1:

				System.out.println("Digite seu nome: ");
				String nome = Reader.readString();
				System.out.println("Digite sua matricula: ");
				int matricula = Reader.readInt();
				System.out.println("Digite sua data de nascimento: ");
				String dtNasc = Reader.readString();
				
				Funcionario funNome = new Funcionario(nome, dtNasc,  matricula);
				for (int i = 0; i < TAMANHO_LISTA_FUNCIONARIOS; i++) {
					if (listaFuncionario[i] == null) {
						listaFuncionario[i] = funNome;
						break;
					}

				}

				break;
			case 2:
				for (int i = 0; i < TAMANHO_LISTA_FUNCIONARIOS; i++) {
					if(listaFuncionario[i] != null) {
						System.out.println(
								i + " - Nome: " + listaFuncionario[i].getNome() + 
								" \t\t Data Nasc: " + listaFuncionario[i].getDtNasc() + 
								" \t\t Matricula: " + listaFuncionario[i].getMatricula());
						
					}
					
				}
				break;

			case 9:
				System.out.println("Saindo");
				break;

			}
			if (menu != 1 && menu != 9 && menu != 2) {
				System.out.println("Opção inválida");
			}

		}

	}

}
