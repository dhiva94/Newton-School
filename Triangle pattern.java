import java.io;

import java.util.*;

public class pattern {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter triangle line: ");
		int n = scn.nextInt();
		int num = 1;
		for (int i = 1; i <=n; i++) {
			int k = 0;
			for (int j = 1; j<=num; j++) {
				if(j <=i) {
					k = k + 1;
				}
				else {
					k = k - 1;
				}
				System.out.print(k + " ");
			}
			System.out.println(" ");
			num+=2;
		}
		for (int i = n; i>=1; i--) {
			int k = 0;
			for (int j = num-3; j >1; j--) {
				if(i <= j) {
					k = k + 1;
				}
				else {
					k = k - 1;
				}
				System.out.print(k + " ");
			}
			System.out.println(" ");
			num-=2;
			}
		}
	}
