package secretaria;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opet.util.Reader;

public class MainTeste {

	public final static int TAMANHO_LISTA_FUNCIONARIOS = 1;

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
				
				for (int i = 0; i < TAMANHO_LISTA_FUNCIONARIOS; i++) {
					if (listaFuncionario[i] == null) {

						System.out.println("Digite seu nome: ");
						String nome = Reader.readString();
						System.out.println("Digite sua matricula: ");
						int matricula = Reader.readInt();

						System.out.println("Digite sua data de nascimento: ");

						String dtNascimento = Reader.readString();

						Date dt = formatDate.parse(dtNascimento);

						Funcionario funNome = new Funcionario(nome, dt, matricula);

						listaFuncionario[i] = funNome;
						break;
					}else {
						System.out.println("NÃO FOI POSSIVEL CADASTRAR NOVO FUNCIONARIO");
					}

				}

				break;
			case 2:

				for (int i = 0; i < TAMANHO_LISTA_FUNCIONARIOS; i++) {
					if (listaFuncionario[i] != null) {
						System.out.println(i + " - Nome: " + listaFuncionario[i].getNome() + " \t\t Data Nasc: "
								+ formatDate.format(listaFuncionario[i].getDtNasc()) + " \t\t Matricula: "
								+ listaFuncionario[i].getMatricula());

					}

				}
				break;

			case 9:
				System.out.println("Saindo");
				break;

			default:
				System.out.println("Opção inválida");

			}

		}

	}
}
