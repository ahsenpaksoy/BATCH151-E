package myjava.day016;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		
		//Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
		String names[] = {"K","C","R","A","S"};
		String el = "R";
		
		//1.Way:
		int counter = 0;
		for(String w : names) {
			if(w.equals(el)) {
				counter++;
				break;
			}
		}
		if(counter>0) {
			System.out.println("Array has " + el);
		}else {
			System.out.println("Array does not have " + el);
		}
		
		//2.Way: binarySearch() method hizli arama yapar
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		int result = Arrays.binarySearch(names, el);
		System.out.println(result);
		
		if(result>0) {
			System.out.println("Array has " + el);
		}else {
			System.out.println("Array does not have " + el);
		}
		
		
		
		

	}

}
