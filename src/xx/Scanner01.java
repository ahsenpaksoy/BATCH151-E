package xx;

import java.util.Scanner;

public class Scanner01 {
	
	//Scanner kullanicidan data almaya yarar, Scanner kullanici ile etkilesim kurmamizi saglar
	//Scanner Java Class idir, bu Class i kullanabilmek icin inport etmek gerekir.
	//Scanner Class i Java nin util kutuphanesindedir.

	public static void main(String[] args) {
		
		//Kullanicidan data almak icin yapilmasi gerekenler
		
		//1. Adim: Scanner Class indan object olusturun
		Scanner input = new Scanner(System.in);
		
		//2. Adim: Kullaniciya ne yapacagini soyle
		System.out.println("Hey kullanici yasini gir...");
		
		//Kulanicidan aldiginiz data yi bir variable in icine koyun
		byte age = input.nextByte();
		
		System.out.println("Hey kullanici senin yasin " + age);

	}

}
