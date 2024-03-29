package myjava.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {

	public static void main(String[] args) {
		
		//ArrayList nasil olusturulur?
		ArrayList<Integer> ages = new ArrayList<>();
		
		//ArrayList concole'a nasil yazdirilir?
		System.out.println(ages);
		
		 //ArrayList'e eleman nasil eklenir?
        //1.Way:
		ages.add(12);
		ages.add(24);
		ages.add(9);
		System.out.println(ages);//[12,24,9]
		
		//2.Way:
		ages.add(1,99);
		System.out.println(ages);//[12,99,24,9]
		
		ArrayList<Integer> price = new ArrayList<>();
		price.add(23);
		price.add(33);
		
		//3.Way:
		ages.addAll(price);
		System.out.println(ages);//[12,99,24,9,23,33]
		
		//4.Way:
		ages.addAll(3, price);
		System.out.println(ages);//[12,99,24,23,33,9,23,33]
		
		//ArrayList'te eleman sayisi nasil bulunur?
		int numOfElement = ages.size();
		System.out.println(numOfElement);//8
		
		//ArrayList'te specific bir elemman nasil alinir?
		int el1 = ages.get(3);
		System.out.println(el1);//23
		
		//ArrayList'te specific bir elemman nasil degistirilir?
		ages.set(6,111);
		System.out.println(ages);//[12, 99, 24, 23, 33, 9, 111, 33]
		
		//ArrayList'te specific bir elemanin var olup olmadigini nasil anlariz?
		boolean r1 = ages.contains(99);
		System.out.println(r1);//true
		
	    //Bir ArrayList'in bos olup olmadigini nasil kontrol ederiz?
		boolean r2 = ages.isEmpty();
		System.out.println(r2);//false
		
		//Bir ArrayList'teki tum elemanlari nasil sileriz?
		ages.clear();
		System.out.println(ages);//[]
		
		boolean r3 = ages.isEmpty();
		System.out.println(r3);
		
		
		//Ex 1: Bir List'in bos olup olmadigini kontrol eden kodu yaziniz.
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ajda");
		names.add("Cuneyt");
		names.add("Angelina");
		names.add("Bradd");
		System.out.println(names);
		
		if(names.isEmpty()) {
			System.out.println("List is empty");
		}else {
			System.out.println("List has at least 1 element");
		}
		
		
		
		
		

	}

}
