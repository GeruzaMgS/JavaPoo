package exemplos.abstracts;

/**
 * 
 * @author Prof. Joao Andrei
 * @since 23 de mar de 2016
 * @version 1.0.0
 */
public class VeiculoPasseio extends Veiculo{
/**
 * 
 */
	private String radio;
	
	/**
	 * 
	 * @param anoDoVeiculo
	 * @param corDoVeiculo
	 * @param tipoDoVeiculo
	 * @param modeloDoVeiculo
	 * @param marcaDoVeiculo
	 */
	public VeiculoPasseio(int anoDoVeiculo, String corDoVeiculo, String tipoDoVeiculo, String modeloDoVeiculo,
			String marcaDoVeiculo) {
		super(anoDoVeiculo, corDoVeiculo, tipoDoVeiculo, modeloDoVeiculo, marcaDoVeiculo);

	}

	/**
	 * @return the radio
	 */
	public String getRadio() {
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(String radio) {
		this.radio = radio;
	}

	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return 300.00;
	}
}
