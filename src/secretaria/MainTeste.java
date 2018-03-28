package secretaria;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.opet.util.Reader;

import br.opet.tds172a.util.MyReader;

public class MainTeste {

	public final static ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();

	public static void main(String[] args) throws Exception {

		/*
		 * Funcionario f = new Funcionario("Joao", new Date("20/09/93"), 123);
		 * 
		 * Date dtHora = new Date(); boolean retornoPonto = f.baterPonto(dtHora);
		 * 
		 * if (retornoPonto) { System.out.println("Ponto batido com sucesso"); } else {
		 * System.out.println("Ponto NÃO batido"); }
		 * 
		 * Diretor d = new Diretor ("Maria", new Date ("05/12/69"), 321); retornoPonto =
		 * d.baterPonto(dtHora); if (retornoPonto) {
		 * System.out.println("Ponto batido com sucesso"); } else {
		 * System.out.println("Ponto NÃO batido"); }
		 */
		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

		int menu = 0;

		while (menu != 9) {

			System.out.println("--- ---");
			System.out.println("1 - INCLUIR");
			System.out.println("2 - LISTAR");
			System.out.println("3 - REMOVER");
			System.out.println("4 - ALTERAR");
			System.out.println("9 - SAIR");

			menu = Reader.readInt();

			switch (menu) {

			case 1:
				System.out.println("Digite seu nome: ");
				String nome = Reader.readString();
				System.out.println("Digite sua matricula: ");
				int matricula = Reader.readInt();
				System.out.println("Digite sua data de nascimento: ");
				Date dtNascimento = MyReader.readDate();

				listaFuncionario.add(new Funcionario(nome, dtNascimento, matricula));
				System.out.println("Funcionario " + nome + " cadastrado com sucesso!");

				break;
			case 2:
				System.out.println("Lista de funcionários");

				for (Funcionario funcionario : listaFuncionario) {

					System.out.println("Nome: " + funcionario.getNome() + " \t\t Data Nasc: "
							+ formatDate.format(funcionario.getDtNasc()) + " \t\t Matricula: "
							+ funcionario.getMatricula());

				}

				break;

			case 3:
				System.out.println("Digite a matricula: ");
				matricula = Reader.readInt();

				for (Funcionario funcionario : listaFuncionario) {
					if (funcionario.getMatricula() == matricula) {
						listaFuncionario.remove(funcionario);
						System.out.println("Funcionario " + funcionario.getNome() + " removido com sucesso!");
						break;
					}

				}

				break;

			case 4:
				
				MainTeste.alteracaoMenu();

				break;

			case 9:
				System.out.println("Saindo");
				break;

			default:
				System.out.println("Opção inválida");

			}

		}

	}

	public static void alteracaoMenu() throws Exception {

		System.out.println("O QUE DESEJA ALTERAR?");
		System.out.println("1 - NOME");
		System.out.println("2 - DATA DE NASCIMENTO");
		System.out.println("3 - MATRICULA");
		System.out.println("4 - VOLTAR AO MENU PRINCIPAL");
		int menuAlteracao = Reader.readInt();

		System.out.println("Informe a matricula");
		int matricula = Reader.readInt();

		for (Funcionario funcionario : listaFuncionario) {
			if (funcionario.getMatricula() == matricula) {

				switch (menuAlteracao) {

				case 1:
					System.out.println("Digite novo nome");
					String nome = Reader.readString();

					funcionario.setNome(nome);
					System.out.println("Nome alterado com sucesso");
					break;

				case 2:
					System.out.println("Digite nova data nascimento");
					Date dtNascimento = MyReader.readDate();

					funcionario.setDtNasc(dtNascimento);
					System.out.println("Data de nascimento alterada com sucesso");
					break;

				case 3:
					System.out.println("Digite nova matricula");
					int novaMatricula = Reader.readInt();
					funcionario.setMatricula(novaMatricula);
					System.out.println("Matricula alterado com sucesso");
					break;
					
				case 4:
					break;

				}
				

			}

		}

	}
}
