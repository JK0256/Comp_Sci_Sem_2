import java.util.*;

class starter {
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		printValuesInt(arr1);
		removeDup(arr1);		//Create this method.
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		printValuesInt(arr1);
		
	}

	public static void addValuesInt(ArrayList<Integer> arr, int num){
		for(int i = 0; i < num; i++){
			arr.add(new Integer((int)(Math.random()*100)));
		}
	}

	public static void printValuesInt(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size(); i++){
			System.out.print(arr.get(i) + ", ");
		}
	}
	
	public static void removeDup(ArrayList<Integer> arr){
		//Efficient (sorta copied)
		for(int x = arr.size()-1; x > 0; x--){
			for(int y = x-1; y >= 0; y--){
				if(arr.get(x) == arr.get(y)){
					arr.remove(x);
				}
			}
		}
		
		//My original
		int maxNum = 0;
		for(int i = 0; i < arr.size()-1; i++){
			if (arr.get(i) > maxNum) {
				maxNum = arr.get(i);
			}
		}
		for(int loop = 0; loop < arr.size()-1; loop++){
			for(int i = 0; i < maxNum; i++){
				int check = 0;
				if (arr.get(i) == i) {
					check = arr.get(i);
					i++;
				}
				if (arr.get(i) == check) {
					arr.remove(i);
				}
			}
		}
	}
}
