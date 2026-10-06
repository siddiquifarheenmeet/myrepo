package Find_Missing_N_number_In_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Find_Missing_N_number_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1,2,3,5,7};
		int[] arr1 = new int[arr.length+2];
		//Find 2 missing number in array
		
		// arr1 = {1,2,3,4,5,6,7}
		
		for(int i=0; i<arr.length+2; i++) {
			
			arr1[i]=i+1;
			
		}
		
		System.out.print(Arrays.toString(arr1));
		
		
		for(int j=0; j<arr1.length; j++) {
			
			int count =0;
			
			for (int i=0; i<arr.length; i++) {
				
				if(arr[i]==arr1[j]) {
					
					count++;
					break;
					
				}
				
			}
			
			if(count==0) {
				
				System.out.print(arr1[j] + " , ");
			}
			
			
		}

	
	}
	
	
}
