package myjava.day015;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		
		 //Array nasil olusturulur?
		String stdNames[] = new String[5];
		 //Array nasil olusturulur?
		System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]
		//Array'e nasil eleman eklenir?
		stdNames[0] = "Ajda";
		stdNames[1] = "Cuneyt";
		stdNames[2] = "Kemal";
		stdNames[3] = "Ayhan";
		stdNames[4] = "Filiz";
		System.out.println(Arrays.toString(stdNames));  //[Ajda, Cuneyt, Kemal, Ayhan, Filiz]
		
		//Example 1: stdNames array'indeki her ismin sonuna yildiz koyarak console'a yazdiriniz

        //1.Way:
		for(int i=0; i<stdNames.length; i++) {
			System.out.println(stdNames[i] + "+");
		}
		
		//2. Way: for-each loop ==> Enhanced(Zenginlestirilmis) Loop. Mumkunse hep for-each loop kullanilir
        //for-each loop array'de calisir
		for (String w : stdNames) {
			System.out.println(w + "*");
		}
		
		
		 //Example 2: Bir Integer Array olusturunuz, 5 eleman ekleyiniz, elemanlarin toplamini bulup console'a yazdiriniz
		int ages[] = new int[5];
		ages[0] = 12;
	    ages[1] = 23;
	    ages[2] = 9;
	    ages[3] = 38;
	    ages[4] = 27;
	    System.out.println(Arrays.toString(ages));
	    
	    int sum = 0;
	    for(int w : ages) {
	    	sum = sum + w;
	    	//System.out.println(sum);
	    }
	    System.out.println(sum);
	    
	    
	    //Example 3: Bir char Array olusturunuz, 3 eleman ekleyiniz, elemanlarin carpmini bulup console'a yazdiriniz
	    char initials[] = new char[3];
	    initials[0] = 'J'; //74
	    initials[1] = 'P'; //80
	    initials[2] = 'A'; //65
	    
	    int carpim = 1;
	    for(char w : initials) {
	    	carpim = carpim * w;
	    }
	    System.out.println(carpim);
	    
		
		
		
		
		
		
		

	}

}
