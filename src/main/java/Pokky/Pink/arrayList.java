package Pokky.Pink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] nums = {6, 1, 2, 3};
		System.out.println(lowToHigh(nums) );

	}
	
	public static ArrayList lowToHigh(Integer[] abcd) {
		List<Integer> nums = new ArrayList<>(Arrays.asList(abcd));
		int temp;
		
		for(int i = 0; i < nums.size(); i ++) {
			if(abcd[i] < abcd[i+1]  ) {
				temp = abcd[i];
				nums.add(temp);
			}
		}
		
	}
	
	
	

}
