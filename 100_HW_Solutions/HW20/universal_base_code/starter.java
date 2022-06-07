import java.util.*;


class starter {
    public static void bubbleSort(ArrayList<Integer> arr) {
        for (int outer = 0; outer < arr.size()-1; outer++) {
            for (int inner = 0; inner < arr.size()-outer-1; inner++) {
                if (arr.get(inner) > arr.get(inner+1)) {
                    int temp = arr.get(inner);
                    arr.set(inner, arr.get(inner+1));
                    arr.set(inner+1, temp);
                }
            }
        }
    }
    
    public static void selectionSort(ArrayList<Integer> arr) {
    	int outer, inner, min_index;
    	
        for (outer = 0; outer < arr.size(); outer++) {
            min_index = outer;
            for (inner = outer+1; inner < arr.size(); inner++) {
                if (arr.get(inner) < arr.get(min_index)) {
                    min_index = inner;
                }
            }
            int temp = arr.get(outer);
			arr.set(outer, arr.get(min_index));
			arr.set(min_index, temp);
        }
    }
    
    public static void insertionSort(ArrayList<Integer> arr) {
    	int outer, inner, key;

        for (outer = 1; outer < arr.size(); outer++) {
            key = arr.get(outer);
            inner = outer-1;
            
            while (inner >= 0 && arr.get(inner) > key) {
                arr.set(inner+1, arr.get(inner));
                inner = inner-1;
            }
            arr.set(inner+1, key);
        }
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
	
	
	public static void main(String args[]) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		addValuesInt(arr1, 100);
		System.out.println("Array 1");
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		addValuesInt(arr2, 100);
		System.out.println("Array 2");
		printValuesInt(arr2);
		System.out.println();
		System.out.println();
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		addValuesInt(arr3, 140);
		System.out.println("Array 3");
		printValuesInt(arr3);
		System.out.println();
		System.out.println();
		
		System.out.print("Array 1 - Bubble Sort.   ");
		bubbleSort(arr1);
		System.out.println("Median - " + arr1.get(50));
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		System.out.print("Array 2 - Selection Sort.   ");
		selectionSort(arr2);
		System.out.println("Median - " + arr2.get(50));
		printValuesInt(arr2);
		System.out.println();
		System.out.println();
		System.out.print("Array 3 - Insertion Sort.   ");
		insertionSort(arr3);
		System.out.println("Median - " + arr3.get(50));
		printValuesInt(arr3);
		System.out.println();
		System.out.println();
		}
}
