package TesteException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import br.opet.tds172a.util.Reader;

public class TesteException {

	private static ArrayList<String> listaNomes = new ArrayList<String>();

	public static void main(String[] args) {

		listaNomes.add("Pedro");
		listaNomes.add("Pedro");
		listaNomes.add("Pedro");
		listaNomes.add(null);
		listaNomes.add("Martinha");

		String nomeEcontrado = pesquisaNome("Pedro");

		if (nomeEcontrado == null) {
			System.out.println("Nome não encontrado");
		} else {
			System.out.println(nomeEcontrado + " - " + nomeEcontrado.toLowerCase());
		}

		removerNome("Pedro");

		System.out.println("------------");

		for (String nomeTemp : listaNomes) {
			System.out.println(nomeTemp);
		}

		Date novaData = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);

		String dataRecebidaEmString = Reader.readString("");

		try {
			novaData = sdf.parse(dataRecebidaEmString);
		} catch (ParseException e) {
			//e.printStackTrace();
			System.out.println("Data no formato invalido.");
		}

		int meuNumero = 0;
		
		meuNumero = Integer.parseInt("aaa");
	}

	public static String pesquisaNome(String nome) {

		for (String nomeTemp : listaNomes) {
			try {
				if (nomeTemp.equalsIgnoreCase(nome)) {
					return nomeTemp.toUpperCase();
				}
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void removerNome(String nome) {
		try {
			for (int i = 0; i < listaNomes.size() + 1; i++) {
				String nomeTemp = listaNomes.get(i);

				try {
					if (nomeTemp.equalsIgnoreCase(nome)) {
						listaNomes.remove(i);
					}
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
}
