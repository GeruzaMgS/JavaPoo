/**
 * 
 */
package control;

/**
 * @author opet
 * 
 * @since abril 09, 2018
 * 
 * @version 1.0
 *
 */
public class Motocicleta extends Veiculo {

	public Motocicleta(String marca, String modelo) {
		super(marca, modelo);
		
	}

	/* (non-Javadoc)
	 * @see control.Veiculo#acelerar(int)
	 */
	@Override
	public void acelerar(int novaAceleracao) {
		System.out.println(getMarca()+ getModelo()+" Vai acelerar para " + novaAceleracao);

	}

}
