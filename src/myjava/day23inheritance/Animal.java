package myjava.day23inheritance;

public class Animal {
	
	 /*
    1)eat(){} method'u gibi bircok class'in kullanmasi gereken method'lari her class'a ayri ayri yazarsak;
       i)Tekrar yapmis oluruz, tekrar ideal code'da olmamalidir.
       ii)Ayni method'u tekrar tekrar yazmak zaman kaybidir.
       ii)Tekrar tekrar yazilan method'un tamiri cok zaman alir.
       iv)Tekrar tekrar yazilan method'un gelistirilmesi cok zaman alir.
       v)Method'u tekrar tekrar yazmak "atomic yapi" ya terstir.
     2)private class member'lar child class'lar tarafindan kullanilamaz.
       public class member'lar child class'lar tarafindan kullanilabilir.
       default class member'lar ayni package'de child class'lar tarafindan kullanilabilirler.
       protected class member'lar farkli package'de de olsalar child class'lar tarafindan kullanilabilir.
     3)Java'da bir class'in sadece 1 tane parent'i olabilir.
       Coklu parent'a "Multiple Inheritance" derler, tekli parent'a "Single Inheritance" derler.
       Java "Multiple Inheritance" i desteklemez, Java "Single Inheritance" kullanir.
     4)Apartman seklindeki inheritance yapisina "Multilevel Inheritance" denir.
       Java "Multilevel Inheritance" i destekler.
*/
	protected void eat() {
		System.out.println("Animals eat...");
	}
	
	public void drink() {
		System.out.println("Animals drink...");
	}
	
	

}

