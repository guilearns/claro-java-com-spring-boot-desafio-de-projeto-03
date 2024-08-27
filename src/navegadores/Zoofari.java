package navegadores;

public class Zoofari implements Navegador {
	
	public Zoofari() {
		adicionarNovaAba();
	}
	
	@Override
	public void exibirPagina(String url) {
		System.out.println("A página de URL '" + url + "' foi carregada.");
	}

	@Override
	public void adicionarNovaAba() {
		abas.add("zoofari://newtab");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Página de endereço '" + abas.get(abaSelecionada) + "' atualizada.");
	}

	@Override
	public void exibirAba(int numeroAba) {
		if (numeroAba <= obterQuantidadeAbas()-1) {
			System.out.println("A aba seleciona está no endereço '" + abas.get(abaSelecionada) + "'.");
		} else {
			System.out.println("O usuário notou que só existe(m) " + obterQuantidadeAbas() + " aba(s) aberta(s).");
		}
	}
	
	public int obterQuantidadeAbas() {
		return abas.size();
	}

}
