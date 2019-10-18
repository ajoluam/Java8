package Java8;

@FunctionalInterface
interface Validator<T> {

	boolean valida(T t);
}
