package navegadores;

import java.util.ArrayList;

public interface Navegador {
	
	public ArrayList<String> abas = new ArrayList<String>();
	public int abaSelecionada = 0;
	
	public void exibirPagina(String url);
	public void adicionarNovaAba();
	public void atualizarPagina();
	public void exibirAba(int aba);

}
