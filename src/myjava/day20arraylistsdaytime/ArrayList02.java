package myjava.day20arraylistsdaytime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		
		 /*
        Example 1: Bir Integer List'teki birbirine en yakin iki elemani bulunuz
        [12, 23, 10, 19] ==> 12 and 10
        */
		
		List<Integer> nums = new ArrayList<>();
		nums.add(13);
		nums.add(23);
		nums.add(14);
		nums.add(10);
		System.out.println(nums);
		
		Collections.sort(nums);
		System.out.println(nums);
		
		int minDiff = nums.get(1) - nums.get(0);
		
		for(int i=1; i<nums.size(); i++) {
			minDiff = Math.min(minDiff, nums.get(i) - nums.get(i-1));
		}
		System.out.println(minDiff);
		
		for(int i=1; i<nums.size(); i++) {
			if(nums.get(i) - nums.get(i-1) == minDiff) {
				System.out.println(nums.get(i-1) + " and" + nums.get(i));
			}
		}
		
		
		

	}

}
