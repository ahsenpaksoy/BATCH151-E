package myjava.day015;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		 //Array'leri kisa yoldan nasil olusturabiliriz?
		int grades[] = {67, 98, 100, 34, 76};
		System.out.println(Arrays.toString(grades));
		
		//grades array'indeki en kucuk ve en buyuk grade'in toplamini ekrana yazdiran kodu yaziniz
		Arrays.sort(grades);
		System.out.println(Arrays.toString(grades));
		System.out.println(grades[0] + grades[grades.length-1]);

		
		 //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleri console'a yazdiriniz
		String stdNames[] = new String[5];
		stdNames[0] = "Ayda";
		stdNames[1] = "Cuneyt";
		stdNames[2] = "Tom";
		stdNames[3] = "Ayhan";
		stdNames[4] = "Filiz";
		
		for(String w : stdNames) {
			
			if(w.length()<5) {
				System.out.println(w);
			}
		}
		
		

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri console'a yazdiriniz
		Arrays.sort(stdNames);
		System.out.println(Arrays.toString(stdNames));
		
		for(String w : stdNames) {
			if(w.startsWith("F")) {
				break;
			}
			System.out.println(w);
		}
		//sort() method'u sayilari kucukten buyuge, Stringleri alfabetik olarak siralar.
		
		
		 //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isimlerden onceki isimleri ve "F" ile baslayanlari console'a yazdiriniz
		Arrays.sort(stdNames);
		System.out.println(Arrays.toString(stdNames));
		
		for (String w : stdNames) {
			System.out.println(w);
			if(w.startsWith("F")) {
				break;
			}
		}
		
		
		//Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz
		Arrays.sort(stdNames);
		System.out.println(Arrays.toString(stdNames));
		
		for(String w : stdNames) {
			if(w.startsWith("F")) {
				continue;
			}else {
				System.out.println(w);
			}
		}
		
		
		
		
		
		

	}

}
