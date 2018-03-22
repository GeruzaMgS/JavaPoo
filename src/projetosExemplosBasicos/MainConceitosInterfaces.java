import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import exemplos.heranca.Pessoa;
import exemplos.interfaces.PersistenciaPessoa;

/**
 * 
 */

/**
 * Classe responsável por mostrar o uso de interfaces
 * 
 * @author Prof. Joao Andrei
 * @since 22 de mar de 2016
 * @version 1.0.0
 * 
 */
public class MainConceitosInterfaces {

	/**
	 * método responsável por iniciar o java application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			PersistenciaPessoa persistenciaPessoa = new PersistenciaPessoa();

			DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

			Pessoa pessoa = new Pessoa();
			pessoa.setIdPessoa(99);
			pessoa.setNome("FERNANDO");
			pessoa.setSexo("M");
			pessoa.setDob(sdf.parse("22/12/1976"));

			if (persistenciaPessoa.inserir(pessoa)) {
				System.out.println("inseriu corretamente: " + pessoa);
			} else {
				System.out.println("NAO inseriu corretamente");
			}

			System.out.println("PESQUISA TODOS");
			List<? extends Pessoa> listaPessoas = new ArrayList<>();
			listaPessoas = persistenciaPessoa.pesquisarAll();
			for (Pessoa pessoaRecuperada : listaPessoas) {
				System.out.println(pessoaRecuperada);
			}
			System.out.println("FIM PESQUISA TODOS");

			System.out.println("PESQUISA O FERNANDO");
			listaPessoas = persistenciaPessoa.pesquisar(pessoa);
			for (Pessoa pessoaRecuperada : listaPessoas) {
				System.out.println(pessoaRecuperada);
			}
			System.out.println("FIM PESQUISA FERNANDO");

			if (persistenciaPessoa.excluir(pessoa)) {
				System.out.println("excluiu corretamente: " + pessoa);
			} else {
				System.out.println("NAO excluiu corretamente");
			}

			listaPessoas = persistenciaPessoa.pesquisarAll();

			System.out.println("PESQUISA TODOS");
			for (Pessoa pessoaRecuperada2 : listaPessoas) {
				System.out.println(pessoaRecuperada2);
			}
			System.out.println("FIM PESQUISA TODOS");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
