package JavaBasics;

import java.io.*;

import java.util.Scanner;

public class maxdiffarray_fast {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter size of array:");
		int size = input.nextInt(); //Taking input for size of an array
		int[] arr = new int[size]; // initializing array 
		for(int i = 0; i < size; i++) {
			//System.out.print("Enter value:");
			arr[i] = input.nextInt(); //Taking elements input
		}
		
		//Creating a minimum element array
		
		int[] leftMin = new int[size];
		leftMin[0] = arr[0]; //assign first element as first value
		//System.out.println("\n" + "LeftMin array:");
		//System.out.print(leftMin[0] + " ");
		for (int i = 1; i < size; i++) {//Find values for other element
			//should find minimum element, comparing each element with initial value
			leftMin[i] = Math.min(arr[i], leftMin[i-1]);
			//System.out.print(leftMin[i] + " ");
		}
		
		int[] rightMax = new int[size];
		rightMax[size-1] = arr [size-1];
		for (int i = size - 2; i >=0; i--) {
			rightMax[i] = Math.max(arr[i], rightMax[i+1]);
		}
		/*System.out.println("\n" + "RightMax array:");
		for(int i = 0; i < size; i++) {
			System.out.print(rightMax[i] + " ");
		}*/
		
		int i = 0, j = 0, maxDiff = -1; 
		while(i < size && j < size) {
			if (leftMin[i] < rightMax[j]) { // checking values for difference
				maxDiff = Math.max(maxDiff,j-i); //finding max diff array index
				j = j + 1;
			}
			else {
				i = i + 1;
			}
		}
		System.out.println("\n" + "Maxdiffrence: " + maxDiff);
	}

}
