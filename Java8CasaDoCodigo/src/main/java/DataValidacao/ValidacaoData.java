package DataValidacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class ValidacaoData {

	public static void main(String[] args) {
		String entrada = "1970-06-13";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");     
		dateFormat.setLenient(false); // ano bissexto 
		try {                                                           
			//Parse apenas para garantir que está no formato certo
			Date dataFormatada = dateFormat.parse(entrada);
			
			LocalDate dataEntrada = LocalDate.parse(entrada);
			LocalDate hoje = LocalDate.now();
			
//			if (dataEntrada.isAfter(hoje))   {
//				System.out.println("FALSE - " + dataEntrada + " é maior que hoje:  " + hoje);                                              
//			
//			} else {
//				
//				System.out.println("TRUE - " + dataEntrada + " é menor que hoje:  " + hoje);                                              
//			}
			 
			if (dataEntrada.isBefore(hoje.minusYears(100))) {
				System.out.println("FALSE - " + dataEntrada + " tem mais de 100 anos de hoje:  " + hoje);
			} else {
				
				System.out.println("TRUE - " + dataEntrada + " tem menos de 100 anos de hoje:  " + hoje);
			}
			
			
		} catch (ParseException e) {                                    
			System.out.println("FALSE");                                              
		}   
	}

}
