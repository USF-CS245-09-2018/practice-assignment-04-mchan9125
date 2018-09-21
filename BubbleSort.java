
public class BubbleSort implements SortingAlgorithm{
	
	
	private void swap(int a, int b, int[] arr) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public void sort(int[] arr) {
		
		for(int j = 0; j < arr.length - 1; j++) {
			for(int i = 0; i <arr.length - 1 - j; i++) {
				if(arr[i] > arr[i+1]) {
					swap(i, 1+i, arr);
				}
			}
		}
	}
}
