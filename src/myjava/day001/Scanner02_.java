package myjava.day001;

import java.util.Scanner;

public class Scanner02_ {

	public static void main(String[] args) {
	    
		//Example 1: Kullanicidan ilk ve soy ismini aliniz, ilk ve soy isminin ilk harflerini ekrana yazdiriniz
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ilk isminizi giriniz...");
		char ilk = input.next().charAt(0);
		
		System.out.println("Soy isminizi giriniz...");
		char son = input.next().charAt(0);
		
		System.out.println("" + ilk + son);

	}

}
