package myjava.day24inheritancepolymorphism;

public class Volvo extends Car{
	
	public void secure() {
		System.out.println("Volvo is the most secure car in the world...");
	}
	
	@Override
	public void move() { ////Bu bir annotation'dir. @Override annotation'i Override kurallarini kontrol eder.
		//super.move(); //parent'dakini kullanmak icin. parent'dakini kullan sonra ek yap.Ikisini beraber gormek icin
		System.out.println("Volvo moves...");
	}
}
