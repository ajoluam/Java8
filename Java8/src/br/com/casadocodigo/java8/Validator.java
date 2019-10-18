package br.com.casadocodigo.java8;

@FunctionalInterface
interface Validator<T> {

	boolean valida(T t);
}
