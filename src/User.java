import cellphone.IphoClone;

public class User {

	public static void main(String[] args) {
		
		IphoClone iphoClone = new IphoClone();
		
		iphoClone.exibirPagina("www.google.com.br");
		iphoClone.exibirAba(0);
		iphoClone.atualizarPagina();
		iphoClone.pausar();
		iphoClone.tocar();
		iphoClone.tocar();
		iphoClone.pausar();
		iphoClone.selecionarMidia("Testezinho");
		
		System.out.println("Fim do Programa.");
	}
	
}