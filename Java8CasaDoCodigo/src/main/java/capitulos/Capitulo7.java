package capitulos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Capitulo7 {

	public static void main(String[] args) {

		List<Usuario> usuarios = new ArrayList<>();

		for (int i = 0; i < 10; i++) {

			usuarios.add(new Usuario("usuario" + i, i * 40));
		}

		usuarios.sort(Comparator.comparing(Usuario::getPontos));

		//usuarios.subList(0, 10).forEach(Usuario::tornaModerador);
		usuarios.forEach(u -> System.out.println(u.isModerador()));
		
		usuarios.stream().filter(u->u.getPontos()>100).forEach(Usuario::tornaModerador);

		
		//coletando dados de um stream e criando uma lista
		List<Usuario> maiorQue100 = new ArrayList<>();
		usuarios.stream().filter(u->u.getPontos()>100).forEach(maiorQue100::add);
		
		maiorQue100.forEach(u -> System.out.println(u.getNome()));
		
		
		//podemos fazer essa coleta com o Collectors
		

	}

}
