package practice;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		
		// Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
		
		int arr[] = {1,2,-3,4,-5,-6};
		int arrNew[] = new int[arr.length];
		int indx = 0;
		
		for(int w : arr) {
			arrNew[indx] = w*-1;
			indx++;
		}
		System.out.println(Arrays.toString(arrNew));
		
		
		
		

	}

}
