package exemplos.abstracts;
/**
 * 
 */

/**
 * @author Prof. Joao Andrei
 * @since 19 de mar de 2016
 * @version 1.0.0
 * 
 */
public abstract class Veiculo{

	/**
	 * 
	 */
	protected Double valor;
	/**
	 * 
	 */
	protected String corDoVeiculo;
	/**
	 * 
	 */
	private String tipoDoVeiculo;
	/**
	 * 
	 */
	private String modeloDoVeiculo;
	/**
	 * 
	 */
	private String marcaDoVeiculo;
	/**
	 * 
	 */
	private int anoDoVeiculo;

	/*
	 * construtores da classe
	 */

	/**
	 * 
	 */
	public Veiculo(int anoDoVeiculo, String corDoVeiculo, String tipoDoVeiculo, String modeloDoVeiculo,
			String marcaDoVeiculo) {
		
		this.anoDoVeiculo = anoDoVeiculo;
		this.corDoVeiculo = corDoVeiculo;
		this.tipoDoVeiculo = tipoDoVeiculo;
		this.modeloDoVeiculo = modeloDoVeiculo;
		this.marcaDoVeiculo = marcaDoVeiculo;
	}

	/**
	 * 
	 * @return the corDoVeiculo
	 */
	public String getCorDoVeiculo() {
		return corDoVeiculo;
	}

	/**
	 * @param corDoVeiculo
	 *            the corDoVeiculo to set
	 */
	public void setCorDoVeiculo(String corDoVeiculo) {
		this.corDoVeiculo = corDoVeiculo.toUpperCase();
	}

	/**
	 * @return the tipoDoVeiculo
	 */
	public String getTipoDoVeiculo() {
		return tipoDoVeiculo;
	}

	/**
	 * @param tipoDoVeiculo
	 *            the tipoDoVeiculo to set
	 */
	public void setTipoDoVeiculo(String tipoDoVeiculo) {
		this.tipoDoVeiculo = tipoDoVeiculo;
	}

	/**
	 * @return the modeloDoVeiculo
	 */
	public String getModeloDoVeiculo() {
		return modeloDoVeiculo;
	}

	/**
	 * @param modeloDoVeiculo
	 *            the modeloDoVeiculo to set
	 */
	public void setModeloDoVeiculo(String modeloDoVeiculo) {
		this.modeloDoVeiculo = modeloDoVeiculo;
	}

	/**
	 * @return the marcaDoVeiculo
	 */
	public String getMarcaDoVeiculo() {
		return marcaDoVeiculo;
	}

	/**
	 * @param marcaDoVeiculo
	 *            the marcaDoVeiculo to set
	 */
	public void setMarcaDoVeiculo(String marcaDoVeiculo) {
		this.marcaDoVeiculo = marcaDoVeiculo;
	}

	/**
	 * @return the anoDoVeiculo
	 */
	public int getAnoDoVeiculo() {
		return anoDoVeiculo;
	}

	/**
	 * @param anoDoVeiculo
	 *            the anoDoVeiculo to set
	 */
	public void setAnoDoVeiculo(int anoDoVeiculo) {
		this.anoDoVeiculo = anoDoVeiculo;
	}


	/**
	 * @param valor the valor to set
	 */
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	/**
	 * @return the valor
	 */
	public abstract Double getValor();
	

}
