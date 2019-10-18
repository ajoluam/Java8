package capitulos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Capitulo4 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		//List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		//Como Arrays.asList é imutável ela não pode ser aumentada , nem diminuida
		//assim o Predicate não funcionara
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);

		Consumer<Usuario> mostraMensagem = u -> System.out.println("antes de imprimir os nomes");
		Consumer<Usuario> imprimeNome = u -> System.out.println(u.getNome());

		usuarios.forEach(mostraMensagem.andThen(imprimeNome));

		// O Predicate é uma interface funcional que permite testar objetos de um
		// determinado
		// tipo, dado um Predicate, o removeIf vai remover todos os elementos que
		// devolverem true
		// para esse predicado.
		Predicate<Usuario> testeMaior160 = new Predicate<Usuario>() {
			@Override
			public boolean test(Usuario t) {
				return t.getPontos() > 160;
			}
		};
		
		//usuarios.removeIf(testeMaior160);
		usuarios.removeIf(u-> u.getPontos()>160);
		usuarios.forEach(mostraMensagem.andThen(imprimeNome));
		

	}

}
