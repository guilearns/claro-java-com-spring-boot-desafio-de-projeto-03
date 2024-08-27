package reprodutores.audio;

import java.util.Scanner;

public class IphoMusicPlayer implements ReprodutorMidia {
	
	String musicaSelecionada = "";
	boolean tocando = false;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void tocar() {
		if (!tocando) {
			musicaSelecionada = assegurarNomeMusica(musicaSelecionada);
			tocando = true;
			System.out.println("Tocando música '" + musicaSelecionada + ".mp3'.");
		} else {
			System.out.println("A música '" + musicaSelecionada + ".mp3' já está tocando.");
		}
	}

	@Override
	public void pausar() {
		if (tocando) {
			System.out.println("Música '" + musicaSelecionada + ".mp3' pausada.");
		} else {
			System.out.println("Não há uma música em reprodução no momento.");
		}
	}

	@Override
	public void selecionarMidia(String musica) {
		musicaSelecionada = assegurarNomeMusica(musica);
		System.out.println("Música '" + musicaSelecionada + ".mp3' selecionada.");
		if (tocando) {
			tocando = false;
		}
		tocar();
	}
	
	public String assegurarNomeMusica(String nomeMusica) {
		String musica = nomeMusica.trim();
		while (musica.equals("")) {
			System.out.print("Por favor, digite o nome da música a ser reproduzida: ");
			musica = scanner.next().trim();
		}
		return musica;
	}
}
