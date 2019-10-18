package capitulos;

public class Capitulo3 {

	public static void main(String[] args) {

		// 1.maneira
		Validator<String> validadorCEP = new Validator<String>() {
			@Override
			public boolean valida(String valor) {
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
		};

		// 2.maneira
		Validator<String> validadorComLambda = valor -> valor.matches("[0-9]{5}-[0-9]{3}");

		boolean resultado;
		String cep = "54800-000";
		resultado = validadorCEP.valida(cep);
		System.out.println(resultado);

		resultado = validadorComLambda.valida(cep);
		System.out.println(resultado);

	}

}
