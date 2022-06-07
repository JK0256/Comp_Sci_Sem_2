import java.util.*;


class starter {
    public static void bubbleSort(int[] arr) {
        for (int outer = 0; outer < arr.length-1; outer++) {
            for (int inner = 0; inner < arr.length-outer-1; inner++) {
                if (arr[inner] > arr[inner+1]) {
                    int temp = arr[inner];
                    arr[inner] = arr[inner+1];
                    arr[inner+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int[] arr) {
    	int outer, inner, min_index;
    	
        for (outer = 0; outer < arr.length; outer++) {
            min_index = outer;
            for (inner = outer+1; inner < arr.length; inner++) {
                if (arr[inner] < arr[min_index]) {
                    min_index = inner;
                }
            }
            int temp = arr[outer];
            arr[outer] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    
    public static void insertionSort(int[] arr) {
    	int outer, inner, key;

        for (outer = 1; outer < arr.length; outer++) {
            key = arr[outer];
            inner = outer-1;
            
            while (inner >= 0 && arr[inner] > key) {
                arr[inner+1] = arr[inner];
                inner = inner-1;
            }
            arr[inner+1] = key;
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
		
		System.out.println("Array 1 - Sorted");
		bubbleSort(arr1);
		printValuesInt(arr1);
		System.out.println();
		System.out.println();
		System.out.println("Array 2 - Sorted");
		selectionSort(arr2);
		printValuesInt(arr2);
		System.out.println();
		System.out.println();
		System.out.println("Array 3 - Sorted");
		insertionSort(arr3);
		printValuesInt(arr3);
		System.out.println();
		System.out.println();
		}
}
