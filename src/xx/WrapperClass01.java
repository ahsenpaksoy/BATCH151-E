package xx;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		/*
		 * java primitive lere method lar ekleyerek yeni bir yapi olusturdu, bu yapiya Wrapper Class denir
		 * Primitive          Wrapper
		 *   byte       ==>     Byte
		 *   short      ==>     Short
		 *   int                Integer
		 *   long               Long
		 *   float              Float
		 *   double             Double
		 *   boolean            Boolean
		 *   char               Char
		 */
		byte primitiveByte = 12; 
		//primitiveByte yazip nokta koydugunuzda hic method gormezsiniz, cunku primitive ler method icermez sadece deger icerir
		
		Byte wrapperByte = 12;
		//wrapperByte yazip nokta koydugunuzda bir cok mrthod gorursunuz, cunku wrapper lar method icerir
		
		//Example 1 : byte data type nin en kucuk ve en buyuk degerlerini ekrana yazdirin.
		System.out.println(Byte.MIN_VALUE); //-128
		System.out.println(Byte.MAX_VALUE); //127
		
		//Example 2 : short, int, long data type larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//primitive ler nasil wrapper lara cevrilir.(Autoboxing)
		float f1 = 13.99F;
		Float wrapperF1 = f1;
		
		//wrapper lar nasil primitive lere cevrilir.(Unboxing)
		Character w1 = 's';
		char primitiveW1 = w1;
		
		//Autoboxing ve unboxing Java tarafindan otomatik olarak yapilir.
		
		
		
		
		
		

	}

}
