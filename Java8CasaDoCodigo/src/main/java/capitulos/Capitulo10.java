package capitulos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Capitulo10 {

	public static void main(String[] args) {

		//Trabalhando com Datas
		LocalDate localDate = LocalDate.now( ZoneId.of( "America/New_York" ));
		System.out.println("LocalDate : " + localDate);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("LocalDateTime : " + localDateTime);
		
		
		
		
	}

}
