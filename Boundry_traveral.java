package JavaBasics;

import java.util.*;

public class Boundry_traveral {

	public static void main(String[] args) {
		Scanner inputTaker = new Scanner(System.in);
		int rows = inputTaker.nextInt();
		int columns = inputTaker.nextInt();
		int[][] arr = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = inputTaker.nextInt();
			}
		}
		boundary(arr, rows, columns);
	}

	public static void boundary(int[][] arr, int rows, int columns) {
		
		//if a row is only 1 there will be one single column
		//So printing the whole column
		
		if(rows == 1){
			for(int j = 0;j < columns; j++){
				System.out.print(arr[0][j] + " ");
			}
		}
		
		//if a column is only 1 there will be one single row
		//So printing the whole row
		
		else if( columns == 1){
			for(int i = 0;i <rows; i++){
				System.out.print(arr[i][0] + " ");
			}
		}
		
		//if rows and column are not same
		else{
			//Printing First row by printing column value
			for(int j = 0; j<columns; j++){
				System.out.print(arr[0][j] + " ");
			}
			//Printing Last column except first row last element
			for(int i = 1;i<rows;i++){
				System.out.print(arr[i][columns-1] + " ");
			}
			
			//Printing Last row except last row last element

			for(int j = columns-2;j>=0;j--){
				System.out.print(arr[rows-1][j] + " ");
			}
			//Printing first column except first row's first and last element
			for(int i = rows-2;i>0; i--){
				System.out.print(arr[i][0] + " ");
			}
		}
	}
}
