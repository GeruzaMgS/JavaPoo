package TesteException;
import java.util.ArrayList;

public class TesteException {

	private static ArrayList<String> listaNomes = new ArrayList<String>();

	public static void main(String[] args) {
		
		
		listaNomes.add("Pedro");
		listaNomes.add("Mané");
		listaNomes.add("João");
		
		
		String nomeEncontrado = pesquisaNome("Pedro");
		
		System.out.println(nomeEncontrado + " -- " + nomeEncontrado.toLowerCase());

		

	}

	public static String pesquisaNome(String nome) {	

		for (String nomeTemp : listaNomes) {
			if (nomeTemp.equals(nome)) {
				return nomeTemp.toUpperCase();
			}

		}

		return null;
	}

}
