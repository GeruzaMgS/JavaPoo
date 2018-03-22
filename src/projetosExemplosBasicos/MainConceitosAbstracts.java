import exemplos.abstracts.Veiculo;
import exemplos.abstracts.VeiculoPasseio;
import exemplos.abstracts.VeiculoUtilitario;

/**
 * 
 * @author Prof. Joao Andrei
 * @since 23 de mar de 2016
 * @version 1.0.0
 */
public class MainConceitosAbstracts {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Veiculo meuVeiculo;

		meuVeiculo = new VeiculoPasseio(2020, "azul", "passeio", "uno", "fiat");
		meuVeiculo.setValor(new Double(3000.00));

		System.out.println("meuVeiculo.getValor()="+meuVeiculo.getValor().toString());

		
		
		VeiculoUtilitario meuVeiculoUtilitario;

		meuVeiculoUtilitario = new VeiculoUtilitario(2020, "azul", "passeio", "uno", "fiat");
		meuVeiculoUtilitario.setValor(new Double(2000.00));

		System.out.println("meuVeiculoUtilitario.getValor()="+meuVeiculoUtilitario.getValor().toString());
	
	}

}
