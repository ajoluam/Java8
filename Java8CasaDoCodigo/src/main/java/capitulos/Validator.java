package capitulos;

@FunctionalInterface
interface Validator<T> {

	boolean valida(T t);
}
