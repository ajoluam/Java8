package br.com.casadocodigo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Capitulo2 {

	public static void main(String[] args) {

		Usuario user1 = new Usuario("Paulo Silveira", 150);
		Usuario user2 = new Usuario("Rodrigo Turini", 120);
		Usuario user3 = new Usuario("Guilherme Silveira", 190);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);

		// 1.maneira
		for (Usuario u : usuarios) {
			System.out.println(u.getNome());
		}
		System.out.println("----------------------");

		// 2.maneira
		Consumer<Usuario> moderador = new Consumer<Usuario>() {
			@Override
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		};
		usuarios.forEach(moderador); //  forEach recebe um consumer como parametro
		System.out.println("----------------------");

		// 3.maneira
		usuarios.forEach(new Consumer<Usuario>() {
			public void accept(Usuario u) {
				System.out.println(u.getNome());
			}
		});
		System.out.println("----------------------");
		
		
		//4.maneira usando lambdas - consumer possui apenas 1 metodo abstrato
		//toda interface java com apenas 1 metodo abstrato pode ser implemantada por um lambda
		usuarios.forEach(u -> System.out.println(u.isModerador()));
		System.out.println("----------------------");
		
		
		//tornando todos eles moderadores
		usuarios.forEach(u -> u.tornaModerador());
		usuarios.forEach(u -> System.out.println(u.isModerador()));

	}

}
