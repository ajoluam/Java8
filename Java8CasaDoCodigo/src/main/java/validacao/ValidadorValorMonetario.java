package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.api.client.repackaged.org.apache.commons.codec.binary.StringUtils;

public class ValidadorValorMonetario implements ValidadorSistemaProduto{
	
	
	@Override
	public <T> boolean validar(Object entrada) {
		final String regex = "^(R\\$\\ )[0-9]\\d{0,2}(\\.\\d{0,3})*,\\d{2}$";
		final String string = (String) entrada;

		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);
		
		if (matcher.find()) {
			return true;
		}
		
		
		return false;
	}

}
