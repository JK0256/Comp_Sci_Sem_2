import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int [][] arr = new int[2][3];
		arr[0][0] = 812983;
		arr[0][1] = 1;
		arr[0][2] = 0;
		arr[1][0] = 2;
		arr[1][1] = 3;
		arr[1][2] = 45;
		int total = 0;
		for (int x = 0; x < arr.length; x++) {
			for (int y = 0; y < arr[0].length; y++) {
				total += arr[x][y];
			}
		}
		int average = total / arr.length;
		System.out.print("Average of 2d array is: " + average);
	}
}
