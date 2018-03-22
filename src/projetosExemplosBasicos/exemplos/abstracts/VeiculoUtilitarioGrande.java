package exemplos.abstracts;

/**
 * 
 * @author Prof. Joao Andrei
 * @since 23 de mar de 2016
 * @version 1.0.0
 */
public class VeiculoUtilitarioGrande extends VeiculoUtilitario {
	/**
	 * 
	 */
	private String guindaste;

	/**
	 * 
	 * @param anoDoVeiculo
	 * @param corDoVeiculo
	 * @param tipoDoVeiculo
	 * @param modeloDoVeiculo
	 * @param marcaDoVeiculo
	 */
	public VeiculoUtilitarioGrande(int anoDoVeiculo, String corDoVeiculo, String tipoDoVeiculo, String modeloDoVeiculo,
			String marcaDoVeiculo, String guindaste) {
		super(anoDoVeiculo, corDoVeiculo, tipoDoVeiculo, modeloDoVeiculo, marcaDoVeiculo);
		this.guindaste = marcaDoVeiculo;
	}

	/**
	 * @return the guindaste
	 */
	public String getGuindaste() {
		return guindaste;
	}

	/**
	 * @param guindaste
	 *            the guindaste to set
	 */
	public void setGuindaste(String guindaste) {
		this.guindaste = guindaste;
	}

}
