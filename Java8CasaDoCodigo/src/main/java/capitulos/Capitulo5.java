package capitulos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class Capitulo5 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		// 1.maneira
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			@Override
			public int compare(Usuario o1, Usuario o2) {
				return o1.getNome().compareTo(o2.getNome());
			}
		};

		// 2. maneira
		Comparator<Usuario> comparator2 = (u1, u2) -> u1.getNome().compareTo(u2.getNome());

		usuarios.sort(comparator2);

		
		//3. maneira
		usuarios.sort((u1,u2)->u1.getNome().compareTo(u2.getNome()));
		
		
		//4. maneira
		usuarios.sort((u1,u2) -> String.CASE_INSENSITIVE_ORDER.compare(u1.getNome(), u2.getNome()));

		//5. maneira
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		
		
		//NaturalOrder e ReverseOrder
		List<String> palavras = Arrays.asList("Casa do Código", "Alura", "Caelum");
		
		palavras.sort(Comparator.naturalOrder());
		
		palavras.sort(Comparator.reverseOrder());
		
		
		
		//T é o tipo de input e R é o resultado
		Function<Usuario, Integer> extrairPontos = u -> u.getPontos();
		Comparator<Usuario> comparator4 = Comparator.comparing(extrairPontos);
		usuarios.sort(comparator4);
		
		//Como o function devolve um Integer no lugar de um int (primitivo) - Autoboxing
		ToIntFunction<Usuario> extrairPontos2 = u -> u.getPontos();
		Comparator<Usuario> comparator5 = Comparator.comparing(extrairPontos);
		usuarios.sort(comparator4);
		
		
		
	}

}
