package myjava.day18constructorsstatickeyword;

import java.time.LocalDate;

public class StaticNonStaticBlocks {

	//static variable'lar "static block" kullanilmadan da "initialize" edilebilirler.
	public static double pi = 3.14;
	

    //static variable'lar "static block" kullanilarak da "initialize" edilebilirler.
    //Asagidaki gibi "static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
	public static double price;
	
	public static void main(String[] args) {
		
		System.out.println("Hey I am a constructor");
	}
	
	static {
		System.out.println("Hey I am a static block 2");
	}
	
	static {
		System.out.println("Hey I am a static block 1");
		LocalDate d = LocalDate.now();
		if(d.getMonthValue()==3) {
			price = 1000;
		}else {
			price = 1200;
		}
	}
	
	
	
	
	
	
	
	
	
}
