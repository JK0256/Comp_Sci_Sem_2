import pkg.*;
import java.util.*;

class starter {
	public static int recurPower(int base, int n){
		if (n < 2) {	//Power of 1 = base num. PRE-CONDITION
			return base;
		}
		if (n == 2) {	//Power of 2+. BASE CASE
			return base*base;
		}
		return base * recurPower(base, n-1);
	}	

	public static void main(String args[]) {
		System.out.println(recurPower(3, 5));
		System.out.println(recurPower(5, 3));
		System.out.println(recurPower(10, 3));
	}
}
