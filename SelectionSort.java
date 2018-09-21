
public class SelectionSort implements SortingAlgorithm{
	
	private void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	
	private int findMin (int from, int [] arr) {
		int min = from;
		for(int k = from + 1; k < arr.length; k++) {
			if(arr[k] < arr[min]) {
				min = k;
			}
		}
		return min;
	}
	

	public void sort(int [] arr) {
		
		for(int i = 0; i < arr.length; i ++) {
			int min = findMin(i, arr);
			swap(i,min, arr);
		}
		
	}
	

}
