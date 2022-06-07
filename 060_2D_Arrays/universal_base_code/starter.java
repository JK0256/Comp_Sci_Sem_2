import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static int rowAv(int r, int a[][]) {
		int total = 0;
		for (int y = 0; y < a[0].length; y++) {
			total += a[r][y];
		}
		int average = total / a.length;
		return average;
	}
	
	public static int totalAv(int a[][]) {
		int total = 0;
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				total += a[x][y];
			}
		}
		int average = total / a.length;
		return average;
	}
	
	public static void printlnArr(int a[][]) {
		for (int x = 0; x < a.length; x++) {
			for (int y = 0; y < a[0].length; y++) {
				System.out.print(a[x][y]);
			}
			System.out.println();
		}
	}

	
	public static void main(String args[]) {
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired width of array");
		int width = sc.nextInt();
		System.out.println("Enter desired height of array");
		int height = sc.nextInt();
		int [][] arr = new int[width][height];
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				arr[x][y] = (int)Math.random()*10;
			}
		}
		int row = 1;
		System.out.println("Average of row " + row + " is: " + rowAv(row, arr));
		totalAv(arr);
		printlnArr(arr);
	}
}
