package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Data {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat data1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat data2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat data3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		data3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); // Data horario atual
		Date x2 = new Date(System.currentTimeMillis()); // Cria a hora a parti do SO
		Date x3 = new Date(0L); // Pega a hora 1 de janeiro de 1970
		Date x4 = new Date(1000L * 60 * 60 * 5);
		
		Date y1 = data1.parse("21/08/2019");
		Date y2 = data2.parse("22/09/2019 18:47:11");
		Date y3 = Date.from(Instant.parse("2019-08-25T18:58:03Z")); // Formato ISO 8601
		
		System.out.println("------------------------");
		System.out.println("Nao formatado x1: " + (x1));
		System.out.println("Nao formatado x2: " + (x2));
		System.out.println("Nao formatado x3: " + (x3));
		System.out.println("Nao formatado x4: " + (x4));
		System.out.println("Nao formatado y1: " + (y1));
		System.out.println("Nao formatado y2: " + (y2));
		System.out.println("Nao formatado y3: " + (y3));
		System.out.println("------------------------");
		System.out.println("BR x1: " + data2.format(x1));
		System.out.println("BR x2: " + data2.format(x2));
		System.out.println("BR x3: " + data2.format(x3));
		System.out.println("BR x4: " + data2.format(x4));
		System.out.println("BR y1: " + data2.format(y1));
		System.out.println("BR y2: " + data2.format(y2));
		System.out.println("BR y3: " + data2.format(y3));
		System.out.println("------------------------");
		System.out.println("UTC x1: " + data3.format(x1));
		System.out.println("UTC x2: " + data3.format(x2));
		System.out.println("UTC x3: " + data3.format(x3));
		System.out.println("UTC x4: " + data3.format(x4));
		System.out.println("UTC y1: " + data3.format(y1));
		System.out.println("UTC y2: " + data3.format(y2));
		System.out.println("UTC y3: " + data3.format(y3));
		
	}

}
