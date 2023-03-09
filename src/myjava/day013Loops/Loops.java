package myjava.day013Loops;

public class Loops {

	public static void main(String[] args) {
		
		//21 den 180 e kadar hem 4 hem de 6 ile bolunebilen tamsayilari console'a yazdiran kodu yaziniz
		
		for(int i=0; i<181; i++) {
			if(i%4==0 && i%6==0) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		
        //Size verilen kucuk harfle yazilmis String'in index'i cift sayi olan character'lerini buyuk harfe donusturunuz
        //miami ==> MiAmI
		String s = "miami";
		for(int i=0; i<s.length(); i++) {
			String ch = s.substring(i, i+1);
			if(i%2==0) {
				System.out.print(ch.toUpperCase());
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		String s1 = "Tahsin";
		for(int i=0; i<s1.length(); i++) {
			String ch = s1.substring(i, i+1);
			if(i%2==0) {
				s1.replace(ch,ch.toUpperCase());
			}
		}
		System.out.println(s1);
		
		
		//Verilen bir string'de ilk 'a' harfinden onceki tum characterleri console'a yazdiriniz
        //Hello Java ==> Hello J
		String t = "Hello Java";
		for(int i=0; i<t.length(); i++) {
			char c = t.charAt(i);
			if(c=='a'){
				break;
			}else {
				System.out.print(c);
			}
		}
		System.out.println();
		
		 //Verilen bir String de son 'a' dan sonraki tum characterleri ters sirada yazdiriniz
        //Tokatci ==> ict
		String u = "Tokatci";
		for(int i=u.length()-1; i>=0; i--) {
			char ch = u.charAt(i);
			if(ch=='a') {
				break;
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		 //Verilen bir String'de kucuk harfleri console'a yazmayiniz
        // "Pwd12?Ab" ==> P12?A
		String a ="Pwd12?Ab";
		for(int i=0; i<a.length(); i++) {
			char ch = a.charAt(i);
			if(ch>='a' && ch<='z') {
				continue;
			}else {
				System.out.print(ch);
			}
		}
		System.out.println();
		
		//Bir String'i ters ceviren kodu yaziniz
        //1.Way
        String d = "Java";
        String ters = "";
        for(int i=d.length()-1; i>=0; i--) {
        	ters = ters + d.substring(i, i+1);
        	
        }
        System.out.println(ters);
        
      //2.Way
        String b = "Java";
        String ters2 = "";
        for(int i=b.length()-1; i>=0; i--) {
        	ters2 = ters2 + b.charAt(i);
        }
        System.out.println(ters2);
        

        //Bir tamsayinin rakamlarinin toplamini veren kodu yaziniz
        //578 ==> 5+7+8 = 20
        int num = 123;
        int sum1 = 0;
        num = Math.abs(num);
        for(int i=num; i>0; i/=10) {
        	sum1 = sum1 + i%10;
        }
        System.out.println(sum1);
        
        int n = 578;
        String nAsString = String.valueOf(n);
        int sum = 0;
        for(int i=0; i<nAsString.length(); i++) {
 
        	sum = sum + Integer.parseInt(nAsString.substring(i,i+1));	
        }
		System.out.println(sum);
		
		
		int sayi = 12345;
		int top = 0;
		for(int i=sayi; i>0; i--) {
			top += sayi%10;
			sayi = sayi/10;
		}
		System.out.println(top);
		
		
		

	}

}
