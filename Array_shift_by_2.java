package Array_shift_by_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_shift_by_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr1 = new int[arr.length];
		//shifting array right to left by one
		
		//{6,7,1,2,3,4,5}
		
		
		for(int i=0; i<arr.length-2;i++) {
			
			arr1[1] = arr[arr.length-1];
			arr1[0] = arr[arr.length-2];
			
			arr1[i+2] = arr[i];
		}
		
		System.out.print(Arrays.toString(arr1));
		
	
	}
	
	
}

