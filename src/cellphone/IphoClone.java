package cellphone;

import navegadores.Navegador;
import navegadores.Zoofari;
import reprodutores.audio.IphoMusicPlayer;
import reprodutores.audio.ReprodutorMidia;
import telefonia.Phonapp;
import telefonia.Telefonia;

public class IphoClone implements Telefonia, ReprodutorMidia, Navegador {
	
	Telefonia aplicativoTelefonicoPadrao = new Phonapp();
	ReprodutorMidia reprodutorMidiaticoPadrao = new IphoMusicPlayer();
	Navegador navegadorPadrao = new Zoofari();
	
	public IphoClone(){
		System.out.println("IphoClone Inicializado");
	}
	
	@Override
	public void exibirPagina(String url) {
		navegadorPadrao.exibirPagina(url);
	}

	@Override
	public void adicionarNovaAba() {
		navegadorPadrao.adicionarNovaAba();
	}

	@Override
	public void atualizarPagina() {
		navegadorPadrao.atualizarPagina();
	}

	@Override
	public void exibirAba(int aba) {
		navegadorPadrao.exibirAba(aba);
	}

	@Override
	public void tocar() {
		reprodutorMidiaticoPadrao.tocar();
	}

	@Override
	public void pausar() {
		reprodutorMidiaticoPadrao.pausar();
	}

	@Override
	public void selecionarMidia(String midia) {
		reprodutorMidiaticoPadrao.selecionarMidia(midia);
	}

	@Override
	public void ligar(String numero) {
		aplicativoTelefonicoPadrao.ligar(numero);
	}

	@Override
	public void atender() {
		aplicativoTelefonicoPadrao.atender();
		
	}

	@Override
	public void iniciarCorreioVoz() {
		aplicativoTelefonicoPadrao.iniciarCorreioVoz();
	}


}
