package xx;

public class TypeCasting01 {
	
	//Type Casting : Bir numeric data type ni diger numeric data type na cevirmek demektir.
	// byte < short < int < long < float < double
	
	//Note 1: Kucuk data type ni buyuk data type na cevirmeye "Auto Widening" denir.
	//Note 2: Buyuk data type ni kucukk data type na cevirmeye "Explicit Narrowing" denir.
	
	public static void main(String[] args) {
		
		byte age = 23;
		int newAge = age;
		
		long population = 1234;
		int newPopulation = (int)population;
		
		//Example 1: short u double a ceviren kodu yaziniz
		short numOfStudents = 235;
		double newNumOfStudents = numOfStudents; //Auto Widening
		
		//  float i byte yapan kodu yazin
		float price = 12.99F;
		byte newPrice = (byte)price;  //Explicit Narrowing
		
		System.out.println(newPrice);
		//java ondalikli sayiyi tam sayiya cevirirken yuvarlama islemi yapmaz.
		//Ondalikli sayiyi tam sayiya cevirirken ondalik kismini siler
		
		int number = 515;
		byte newNumber = (byte)number;
		System.out.println(newNumber); //3 ==> jjava 515 i 265(byte daki sayilarin sayisi) ya boldu kalani return etti.
		
		int num = 510;
		byte newNum = (byte)num;
		System.out.println(newNum); //-2 
		
	}

}
