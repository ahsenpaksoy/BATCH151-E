package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		/*
		 * Get the first name, middle name, last name, SSN from user then print them like the following
		 * Ali Mert Can
		 * 123456789
		 */
		Scanner input = new Scanner(System.in);
		
		//1. yol
		System.out.println("Ilk isminizi giriniz...");
		String firstName = input.next(); //next method u kullanicidan String data si almak icin kullanilir
		
		System.out.println("Orta isminizi giriniz...");
		String middleName = input.next();
		
		System.out.println("Soy isminizi giriniz...");
		String lastName = input.next();
		
		System.out.println("Kimlik numaranizi giriniz...");
		String idNumber = input.next();
		
		System.out.println(firstName + " " + middleName + " " + lastName);
		System.out.println(idNumber);
		
		
		//2. yol
		System.out.println("Ilk, orta, soyisminizi ve kimlik numaranizi giriniz...");
		String ilk = input.next();
		String orta = input.next();
		String soy = input.next();
		String kimlik = input.next();
		
		System.out.println(ilk + " " + orta + " " + soy);
		System.out.println(kimlik);
		
		/*
		 * next() ile nextLine() in farki nedir?
		 * next() method u kullanicidan gelen String in tamamini alir.
		 * nextLine() method u kullanicidan gelen String in tamamini alir.
		 */
		
		//3. yol
		System.out.println("Ilk, orta, soyisminizi giriniz");
		String tamIsim = input.nextLine();
		System.out.println(tamIsim);
		
		System.out.println("Kimlik numaranizi giriniz");
		String kimlikNumarasi = input.next();
		System.out.println(kimlikNumarasi);
		
		
		
		
		
		

	}

}
