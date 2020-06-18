package celular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCelular {

	public static void main(String[] args) {
		
		String entrada = "11911111111";
		
		String ddd = entrada.substring(0, 2);
		String fixo = entrada.substring(2, 3);
		String numero = entrada.substring(3, entrada.length());
		
		//Validacao do DDD , so poderá de 11 ate 99 e com dois digitos
		final String regex = "^([11-99]{2})$";
		
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(ddd);
		
		//Validacao do numero fixo 9
		final String regex2 = "^(9)$";

		final Pattern pattern2 = Pattern.compile(regex2, Pattern.MULTILINE);
		final Matcher matcher2 = pattern2.matcher(fixo);
		
		//Composto só por numeros
		final String regex3 = "[\\D]";
		
		final Pattern pattern3 = Pattern.compile(regex3, Pattern.MULTILINE);
		final Matcher matcher3 = pattern3.matcher(numero);
		
		//Não aceita repetições de numeros 
		final String regex4 = "([0-9])\\1{7}";

		final Pattern pattern4 = Pattern.compile(regex4, Pattern.MULTILINE);
		final Matcher matcher4 = pattern4.matcher(numero);

		
		if (!matcher.find()) System.out.println("DDD com problemas");
		else if (!matcher2.find()) System.out.println("Numero 9 fixo não existe");
		else if (numero.length()>8) System.out.println("Mais que 8 caracteres");
		else if (numero.length()<8) System.out.println("Menos de 8 caractereres");
		else if (matcher3.find()) System.out.println("Possui letras ou caracteres especiais");
		else if (matcher4.find()) System.out.println("Composto só por numeros repetidos");
		else System.out.println("Passou");
		
		
	}
	
}
