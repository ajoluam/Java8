package capitulos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Capitulo7 {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			usuarios.add(new Usuario("usuario" + i, i * 40));
		}

		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());

		usuarios.subList(0, 10).forEach(Usuario::tornaModerador);
		usuarios.forEach(u -> System.out.println(u.isModerador()));

		usuarios.stream().filter(u -> u.getPontos() > 100).forEach(Usuario::tornaModerador);

		// coletando dados de um stream e criando uma lista
		List<Usuario> maiorQue100 = new ArrayList<>();
		usuarios.stream().filter(u -> u.getPontos() > 100).forEach(maiorQue100::add);

		maiorQue100.forEach(u -> System.out.println(u.getNome()));

		// podemos fazer essa coleta com o Collectors
		List<Usuario> maiorQue100_2 = usuarios.stream().filter(u -> u.getPontos() > 100).collect(Collectors.toList());

		maiorQue100_2.forEach(u -> System.out.println(u.getNome()));
		
		//fazendo uma lista só com os pontos de todos os usuários
		//transforma em stream , mapeia só pelos pontos e depois coleta tudo para uma lista
		List<Integer> pontos = usuarios.stream().map(Usuario::getPontos).collect(Collectors.toList());
		pontos.sort(Comparator.reverseOrder());
		pontos.forEach(System.out::println);
		
		//posso fazer um mapeamento para int com o mapToInt
		Double media = usuarios.stream().mapToInt(Usuario::getPontos).average().getAsDouble();
		System.out.println(media);
		
		
	}

}
