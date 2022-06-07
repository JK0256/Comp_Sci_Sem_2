import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void printArrayList(ArrayList<String> a) {
		for (int loop = 0; loop < a.size(); loop++) {
			System.out.print(a.get(loop));
		}
		return;
	}
	public static void addValuesArrayList(int n, ArrayList<String> a) {
		for (int loop = 0; loop < n; loop++) {
			a.add("Heh ");
		}
		return;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = 0;
		if ((length < 1) || (length >100)) {
			System.out.println("Enter desired length of ArrayList, BETWEEN 1-100");
			length = sc.nextInt();
		}
		ArrayList <String> arr = new ArrayList<String>(length);
		addValuesArrayList(20, arr);
		printArrayList(arr);
	}
}
