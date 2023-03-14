package myjava.day016;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {
		
		 //Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
		 String s = "Java is easy. Learn java earn money.";
		 String words[] = s.split(" ");
		 System.out.println(Arrays.toString(words));
		 System.out.println(words.length);
		
		 
		 //Size verilen bir cumlede kac harf oldugunu gosteren kodu yaziniz.
		 String letters[] = s.replaceAll("[^a-zA-Z]", "").split("");
		 System.out.println(Arrays.toString(letters));
		 System.out.println(letters.length);
		 
		 
		 

	}

}
