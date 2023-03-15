package myjava.day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Miami");
		cities.add("Giresun");
		cities.add("Yozgat");
		cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]
		
        
       //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
       //cities.remove("Miami");
       System.out.println(cities.remove("Miami"));//true
       System.out.println(cities);//[Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]
       
       //ArrayList'te bir eleman index'i kullanilarak nasil silinir?
       System.out.println(cities.remove(2));//Barcelona
       System.out.println(cities);//[Giresun, Yozgat, Miami, Giresun, Giresun, Yozgat]
       
       //ArrayList olustururken en basa ArrayList yerine List de yazabilirsiniz.Sebebini  Collections konusunda gorecegiz
       List<Integer> ages = new ArrayList<>();
       ages.add(23);
       ages.add(12);
       ages.add(7);
       ages.add(4);
       
       
      //Ex 1: 12 elemanini ages List'ten siliniz.
	  ages.remove((Integer)12);
	  System.err.println(ages);//[23, 7, 4]
		
		//primitive int olur,primitive int method icinde kullanilinca Java onu index zanneder.12'nin index
	    // olmadigini soylemek icin primitive yerine wrapper class integer kullanmaliyiz.
	  
	  
	//Bir ArrayList'teki bir elemanin tum gorunumlerini nasil sileriz?
	  ArrayList<String> citiesToRemove = new ArrayList<>();
	  citiesToRemove.add("Giresun");
	  citiesToRemove.add("Yozgat");
	  System.out.println(cities.removeAll(citiesToRemove));//true
	  System.out.println(cities);//[Miami]
	  
	//Kisa yoldan bir List olusturmak icin List.of() method'u kullanilabilir.
	  List<Character> initials = List.of('a', 'k', 'c', 'd', 'k');
	  System.out.println(initials);
	  
	  List<Character> letters = List.of('a', 'c', 'k', 'd', 'k');
	  System.out.println(letters);
		
	//Iki ArrayList'in birbirine esit olup olmadigini nasil anlariz?
      //equals() method'u ayni elemanlar ayni index'te oldugu surece true verir.
	  boolean r1 = initials.equals(letters);
	  System.out.println(r1);//false
	  
	  //indexOf() elemanin ilk gorunumunun index'ini verir
	  int r2 = initials.indexOf('k');
	  System.out.println(r2);
	  
	//lastIndexOf('k') yazarsaniz k'nin son gorunumunun index'ini verir
	  int r3 = initials.lastIndexOf('k');
	  System.out.println(r3);
	  
	  
	//Ex : Bir List'teki tekrarsiz elemanlari console'a yazdiran kodu yaziniz
	  List<Double> prices = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
	  for(double w : prices) {
		  if(prices.indexOf(w) == prices.lastIndexOf(w)) {
			  System.out.print(w + " ");
		  }
	  }
	  

		
	//Ex 2: Bir List'te tekrarli eleman olup olmadigini gosteren kodu yaziniz.
	  List<Double> heights = List.of(2.5, 1.25, 2.5, 3.75, 1.25, 4.0);
	  int counter = 0;
	  for(double w : heights) {
		  if(heights.indexOf(w) != heights.lastIndexOf(w)) {
			  counter++;
		  }
	  }
	  if(counter == 0) {
		  System.out.println("All elements are unique in the list");
	  }else {
		  System.out.println("At least one element is not unique in the list");
	  }
	  
	  
	  
	  for(double w : heights) {
		  if(heights.indexOf(w) != heights.lastIndexOf(w)) {
			  System.out.println("At least one element is not unique in the list");
		  }else {
			  System.out.println("All elements are unique in the list");
		  }
	  }
		
	  
	  

	}

}
