package validacao;

public class TestandoValidacao {

	public static void main(String[] args) {
		String nome = "Alex";
		String entrada = null;
		
		try {
			//System.out.println(TipoDeEntrada.toEnum(entrada));
			
			boolean teste = (boolean) TipoDeEntrada.toEnum(entrada).valida(nome);
			
			System.out.println(teste);
			
		} catch (EnumInvalidoException e) {
			System.out.println(e.getMessage());
		}
		

	}

}
