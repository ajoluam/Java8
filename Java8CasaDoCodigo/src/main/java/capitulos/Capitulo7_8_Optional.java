package capitulos;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Comparator;

public class Capitulo7_8_Optional {

	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>();
		List<Usuario> usuarios2 = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			usuarios.add(new Usuario("usuario" + i, i * 40));
		}

		// Para tirar a media
		OptionalDouble average = usuarios.stream().mapToInt(Usuario::getPontos).average();
		double media = average.orElse(0.0);
		System.out.println(media);

		// caso a lista que virara um stream esteja vazia, orElese retornara 0
		double media2 = usuarios2.stream().mapToInt(Usuario::getPontos).average().orElse(0.0);
		System.out.println(media2);

		// Para saber qual usuario tem a maior pontuação e qual o seu nome
		Optional<Usuario> maximo = usuarios2.stream().max(Comparator.comparing(Usuario::getPontos));
		String nome = maximo.map(u->u.getNome()).toString();
		System.out.println(nome);

	}

}
