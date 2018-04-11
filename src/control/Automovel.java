package control;
/**
 * 
 */

/**
 * @author opet
 * 
 * @since abril 09, 2018
 * 
 * @version 1.0
 *
 */
public class Automovel extends Veiculo {

	/* (non-Javadoc)
	 * @see Veiculo#acelerar(int)
	 */
	@Override
	public void acelerar(int novaAceleracao) {
		System.out.println(getMarca() + getModelo()+ " Vai acelerar " + novaAceleracao);

	}

	public Automovel(String marca, String modelo) {
		super(marca, modelo);
		
	}

}
