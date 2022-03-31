package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class pair_em_up {

	public static void main(String[] args) {
		Scanner inputTaker = new Scanner(System.in);
		System.out.print("Enter even length for array size:  ");
		int size = inputTaker.nextInt();
		int[] arr = new int[size];
		for(int i = 0; i < size; i++) {
			arr[i] = inputTaker.nextInt();
		}
		//Sorting array so that we may locate the maximum pair easily 
		Arrays.sort(arr);
		/*System.out.println("Sorted Array: ");
		 for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}*/
		int max = 0;
		for (int i = 0; i < size; i++) {
			//pairing first and last element, second and second last and so on
			int temp = arr[i] + arr[size-i-1];
			if (max < temp) { //if max is less than pairing, temp should max
				max = temp; 
			}
		}
		System.out.println("Maximum Possible pair: ");
		System.out.println(max);
	}

}
