package JavaBasics;

import java.io.*;

import java.util.*;

public class noXor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		long sum = 0, xor;
		
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
			//as the problem statement array should be considered as 1 index
			// so N - i should be Size - (i+1) here
			xor = (size - (i + 1)) ^ arr[i];
			//adding all xor values
			sum+=xor;
		}
		System.out.println("Output sum: " + sum);
	}

}
