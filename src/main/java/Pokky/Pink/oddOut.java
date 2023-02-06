package Pokky.Pink;

import java.util.Arrays;

public class oddOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3, 24, 39, 43, 50};
		int[] newArr = new int[5];
		int new_ptr = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) {
				newArr[new_ptr] = arr[i];
				new_ptr++;	
				System.out.println( "Here" + newArr[i]);
			}
		}
		System.out.println(Arrays.toString(newArr));

	}

}
