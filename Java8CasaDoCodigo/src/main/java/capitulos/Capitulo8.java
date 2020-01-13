package capitulos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Capitulo8 {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			usuarios.add(new Usuario("usuario" + new Random().nextInt(), i * 40));
		}
		usuarios.forEach(u -> System.out.println(u.getNome()));

		// pegei uma lista, filtrei para os com pontos maiores que 100, ordenei por nome
		// e transformei numa lista
		// No Stream o método de ordenação é o *sorted*
		List<Usuario> usuarioOrd = usuarios.stream().filter(u -> u.getPontos() < 100)
				.sorted(Comparator.comparing(Usuario::getNome)).collect(Collectors.toList());
		System.out.println("------------------");
		usuarioOrd.forEach(u -> System.out.println(u.getNome()));

	}

}
