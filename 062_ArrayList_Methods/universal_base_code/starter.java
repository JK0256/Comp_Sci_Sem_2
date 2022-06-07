import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void printArrayList(ArrayList<Integer> arr) {
		for (int loop = 0; loop < arr.size(); loop++) {
			System.out.print(arr.get(loop));
		}
		return;
	}
	public static int getArrayListAverage(ArrayList<Integer> arr) {
		int total = 0;
		int average;
		for (int loop = 0; loop < arr.size(); loop++) {
			total += arr.get(loop);
		}
		average = total/arr.size();
		return average;
	}
	public static int getArrayListMax(ArrayList<Integer> arr) {
		int max = arr.get(0);
		for (int loop = 0; loop < arr.size(); loop++) {
			if (arr.get(loop) > max) {
				max = arr.get(loop);
			}
		}
		return max;
	}
	public static int getArrayListMin(ArrayList<Integer> arr) {
		int min = arr.get(0);
		for (int loop = 0; loop < arr.size(); loop++) {
			if (arr.get(loop) < min) {
				min = arr.get(loop);
			}
		}
		return min;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = 0;
		System.out.println("Enter desired length of ArrayList, BETWEEN 1-100");
		length = sc.nextInt();
		ArrayList <Integer> arr = new ArrayList<Integer>(length);
		for(int i = 0; i < length; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
		System.out.print("Max: " + getArrayListMax(arr) + " Min: " + getArrayListMin(arr));
	}
}
