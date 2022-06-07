import pkg.*;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter desired number of cookies :D");
		int cookieNum = sc.nextInt();
		if (cookieNum == 0) {
			System.out.println("...Monster");
		}
		if (cookieNum > 100) {
			System.out.println("AGH! IT'S THE COOKIE MONSTER!");
		}
		ArrayList <String> arr = new ArrayList<String>(cookieNum);
		for (int loop = 0; loop < cookieNum; loop++) {
			arr.add(loop, "COOKIE");
			System.out.print(arr.get(loop));
		}
	}
}
