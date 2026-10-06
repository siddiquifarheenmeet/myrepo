package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {3,44,21,435,5654,2,2,4,0,1};
		
		Arrays.sort(arr);
		
		System.out.print(Arrays.toString(arr));
		
		
		
		
		
		for (int i =0; i<arr.length; i++) {
			for(int j= i+1; j<arr.length; j++) {
				
				
				
				if(arr[i] > arr[j]) {
					
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j] = temp;
					
					
				}
				
			}
		}
		
		
		System.out.print(Arrays.toString(arr));

		
	}
	
	
}
