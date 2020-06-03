package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorNomeCompleto implements ValidadorSistemaProduto {

	@Override
	public <T> boolean validar(Object entrada) {
		
		//regex para ferificar se existe algum n�mero e/ou caracter especial
		final String regex1 = "[(0-9)(\\\"\\'!@#$%�&*\\(\\)\\-\\+_=�\\|,.;\\/<>:?~^}\\]��`{\\[�������)]";
		//Regex para verificar se existe mais 2 letras na string
		final String regex2 = "([a-zA-Z]).{2,}";
		final String string = (String) entrada;

		final Pattern numeroECaractEspec = Pattern.compile(regex1, Pattern.MULTILINE);
		final Pattern quantidadeCaract = Pattern.compile(regex2, Pattern.MULTILINE);
		final Matcher matcher1 = numeroECaractEspec.matcher(string);
		final Matcher matcher2 = quantidadeCaract.matcher(string);
		

		if (matcher1.find()) {
		    System.out.println("Possue n�meros ou caracteres especiais ");
		    		    
		}else if (!matcher2.find()) {
			System.out.println("Possue menos que 3 caracteres");
		}else {
			System.out.println("Passou no teste");
			System.out.println(string);
			return true;
		}
		
		
		
		return false;
	}

}
