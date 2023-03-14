package myjava.day17multidimensionalarraypassbyvalue;

public class PassByValue {

	public static void main(String[] args) {
		
		/*
		 *       Pas by Value:
        1)Java "Pass by Value" kullanir.
        2)Yani; Java method'larin orjinal degeri degistirmesine musaade etmez
        3)Java method'lara deger yollarken orjinal degerin kopyasini olusturur ve o kopyayi method'a yollar.
          Method kopya deger uzerinde degisiklik yapar, boylece orjinal deger korunmus olur.
        4)Java esnek bir dil'dir. Istersek yazdigimiz kod ile orjinal degerin degismesini de temin edebiliriz.
        Bakiniz line 39

      Pass by Reference:
        1)Pass by Reference da method'a reference yollanir.
        2)Reference adres demektir. Adres yollaninca method adresi kullanarak orjinal degere ulasir ve
          orjinal degeri degistirir.
          Bu yuzden "C#" gibi Pass by Reference kullanan dillerde method variable'in orjinal degerini degistirir.
		 */
		
		int shirtPrice = 200;
		
		System.out.println(discount("student", shirtPrice));
		System.out.println(shirtPrice);
		
		shirtPrice = discount("veteran", shirtPrice);
		System.out.println(shirtPrice);
		
		

	}
	
	public static int discount(String type, int price) {
		switch (type) {
		
		case "student":
			price = price-20;
			break;
		case "veteran":
			price = price-40;
			break;
		case "senior":
			price = price-30;
			break;
		default:
			price = price;
		
		}
		return price;
		
		
	}

}
