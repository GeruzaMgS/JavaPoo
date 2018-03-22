package exemplos.abstracts;

/**
 * 
 * @author Prof. Joao Andrei
 * @since 23 de mar de 2016
 * @version 1.0.0
 */
public class VeiculoUtilitario extends Veiculo {
	/**
	 * 
	 */
	private int capacidadeCarro;

	/**
	 * 
	 * @param anoDoVeiculo
	 * @param corDoVeiculo
	 * @param tipoDoVeiculo
	 * @param modeloDoVeiculo
	 * @param marcaDoVeiculo
	 */
	public VeiculoUtilitario(int anoDoVeiculo, String corDoVeiculo, String tipoDoVeiculo, String modeloDoVeiculo,
			String marcaDoVeiculo) {
		super(anoDoVeiculo, corDoVeiculo, tipoDoVeiculo, modeloDoVeiculo, marcaDoVeiculo);

	}

	/**
	 * @return the capacidadeCarro
	 */
	public int getCapacidadeCarro() {
		return capacidadeCarro;
	}
	
	/**
	 * @return the valor
	 */
	@Override
	public Double getValor() {
		return 100.00;
	}

	/**
	 * @param capacidadeCarro
	 *            the capacidadeCarro to set
	 */
	public void setCapacidadeCarro(int capacidadeCarro) {
		this.capacidadeCarro = capacidadeCarro;
		this.corDoVeiculo = "verde";

	}

	/**
	 * 
	 */
	public void ligarQuatroPorQuatro() {
		System.out.println("ligou");
	}
	
	
}
