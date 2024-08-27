package telefonia;

public class Phonapp implements Telefonia {

	@Override
	public void ligar(String numero) {
		System.out.println("Chamando o número '" + numero + "'.");
	}

	@Override
	public void atender() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz.");
	}

}
