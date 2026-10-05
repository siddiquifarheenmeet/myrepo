package RoughWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RoughWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,4,5,6,7};
		int[] arr1 = new int[arr.length];
		//shifting array Left to Right by one
		
		//{3,4,5,6,7,1,2}
		
		
		for(int i=2; i<arr.length;i++) {
			
			 arr1[arr.length-1] = arr[1];
			arr1[arr.length-2] = arr[0];
			
			arr1[i-2] = arr[i];
		}
		
		System.out.print(Arrays.toString(arr1));
		
	
	}
	
	
}
