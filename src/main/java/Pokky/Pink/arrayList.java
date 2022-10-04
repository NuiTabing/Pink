package Pokky.Pink;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] nums = {6, 9, 16, 10, 0, 1, 2, 3};
		System.out.println(lowToHigh(nums));
		

	}
	
	public static List<Integer> lowToHigh(Integer[] abcd) {
		List<Integer> numsOrig = new ArrayList<>(Arrays.asList(abcd));
		List<Integer> numsNew = new ArrayList<>();
		
		for(int i = 0 ; i < numsOrig.size() ; i++) {
			int minVal = Integer.MAX_VALUE;
			for(int j = 0; j < numsOrig.size(); j++) {
				if(numsOrig.get(j) < minVal) {
					if(numsNew.size() == 0 || numsNew.get(numsNew.size()-1) < numsOrig.get(j)) {
						minVal = numsOrig.get(j);
					}
				}
			}
			numsNew.add(minVal);
		}
		
		return numsNew;
		
	}
	
	
	

}
