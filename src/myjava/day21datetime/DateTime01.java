package myjava.day21datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

	public static void main(String[] args) {
		
		//Anlik zamani nasil aliriz?
		LocalTime myCurrentTime = LocalTime.now();
		System.out.println(myCurrentTime);
		
		//Anlik zamanda bilesenler nasil alinir?
		int hour = myCurrentTime.getHour();
		System.out.println(hour);
		
		int minute = myCurrentTime.getMinute();
		System.out.println(minute);
		
		int second = myCurrentTime.getSecond();
		System.out.println(second);
		
		int nano = myCurrentTime.getNano();
		System.out.println(nano);
		
		//Gelecek ve gecmis zamana nasil gidilir?
		LocalTime next = myCurrentTime.plusMinutes(23).minusSeconds(11);
		System.out.println(next);
		

        //Zaman formati nasil degistirilir?
        //"HH" 24'luk saat sistemini ,  "hh" 12'lik saat sistemini kullanir.("hh:mm a")
        //"hh:mm a" ifadesindeki " a" 12'lik saat sisteminde "AM", "PM" yazilmasini saglar.
        //"HH:mm:ss" "ss" saniyeyi gosterir.
        //"mm" "minute" demektir. "MM" "month2 demektir.
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
		
		String formattedMyCurrentTime = dtf1.format(myCurrentTime);
		System.out.println(formattedMyCurrentTime);
		
		//Date formati nasil degistirilir?
		LocalDate myCurrentDate = LocalDate.of(2022,8,25);
		System.out.println(myCurrentDate);
		
		 //Tarihi Ay/Gun/Yil sekline ceviriniz.
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedmyCurrentDate1 = dtf2.format(myCurrentDate);
		System.out.println(formattedmyCurrentDate1);
		
		//Tarihi Gun/Ay isminin ilk 3 harfi/Yil sekline ceviriniz.
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		String formattedmyCurrentDate2 = dtf3.format(myCurrentDate);
		System.out.println(formattedmyCurrentDate2);
		
		 //Tarihi Gun/Ay ismi/Yil sekline ceviriniz.
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		String formattedmyCurrentDate3 = dtf4.format(myCurrentDate);
		System.out.println(formattedmyCurrentDate3);
		
		 //Baska bir zaman dilimindeki tarih ve zamani nasil aliriz?
		
		 //Tokyo'da ayin kaci?
		LocalDate dateInTokyo = LocalDate.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(dateInTokyo);
		
		//Tashkent'te ayin kaci?
		LocalDate dateInTashkent = LocalDate.now(ZoneId.of("Asia/Tashkent"));
		System.out.println(dateInTashkent);
		
		//Tokyo'da saat kac?
		LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println(timeInTokyo);
		
		//Berlin'de saat kac?
		LocalTime timeInBerlin = LocalTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(timeInBerlin);
		
		
		

	}

}
