package calendar;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarProgram {
	public static void main(String[] args) {
		
		SimpleDateFormat variavel_data = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data = Date.from(Instant.parse("2019-08-21T18:58:03Z")); // Formato ISO 8601		
		
		System.out.println("Data Compra: " + variavel_data.format(data));
		
		// Acrescentando 10 dias na data
		Calendar cal = Calendar.getInstance();
		cal.setTime(data);
//		cal.add(Calendar.DAY_OF_WEEK, 10); // Adicionando dia
//		cal.add(Calendar.HOUR_OF_DAY, 5); // Adicionando hora
//		cal.add(Calendar.MONTH, 3); // Adicionando mes
//		cal.add(Calendar.MINUTE, 2); // Adicionando minutos
//		data = cal.getTime(); // Atribuindo data atualizada para data
		
		// Capturando minutos e mes
		int minutos = cal.get(Calendar.MINUTE);
		// 1 pois mes comeca do 0 pois e um array
		int mes = 1 + cal.get(Calendar.MONTH);
		System.out.println("Data Entrega: " + variavel_data.format(data));
		System.out.println("Minutos: " + minutos + "\nMes: " + mes);
		
	}
}
