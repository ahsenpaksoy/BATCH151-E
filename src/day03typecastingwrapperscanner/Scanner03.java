package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

	public static void main(String[] args) {
		
		//Example 1: Kullanicidan bir dikdortgenin en ve boyunu alip alan ve cevresini hesaplayan kodu giriniz.
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Dikdortgenin kisa kenarini giriniz");
		int shortSide = input.nextInt();
		
		System.out.println("Dikdortgenin uzun kenarini giriniz");
		int longSide = input.nextInt();
		
		System.out.println("Alan " + shortSide*longSide);
		System.out.println("Cevre " + 2*(shortSide+longSide));
		
		

	}

}
