package capitulos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Capitulo6 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		// method references - no lugar de u -> u.tornaModerador
		usuarios.forEach(Usuario::tornaModerador);

		// method references - no lugar de u -> u.getNome()
		usuarios.sort(Comparator.comparing(Usuario::getNome));

		// 2.maneira
		Function<Usuario, String> byName = Usuario::getNome;
		usuarios.sort(Comparator.comparing(byName));

		// Ordenar pelos pontos e em caso de empate ordenar pelo nome
		usuarios.sort(Comparator.comparing(Usuario::getPontos).
				thenComparing(Usuario::getNome));
		
		//todos os usarios nulos de nossa lista irão para o fim na hora ordenação
		usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));

		//todos os usarios nulos de nossa lista irão para o começo na hora ordenação
		usuarios.sort(Comparator.nullsFirst(Comparator.comparing(Usuario::getNome)));
		
		//se quisermos ordenar em ordem inversa
		usuarios.sort(Comparator.comparing(Usuario::getNome).reversed());
		
		//referenciando metodos que recebem argumentos
		usuarios.forEach(System.out::println);
	}

}
