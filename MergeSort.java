package SelectionMerge;

	public class MergeSort {
	    public static void main(String[] args) {
	    	
	        System.out.println("\t \t>Merge Sort <");

	        int[] arr = {64,25,12,22,11,66,65,67,80,123,321};
	        
	        System.out.println(">Unsorted array:");
	        printArray(arr);
	        
	        mergeSort(arr);
	        
	        System.out.println(">Sorted array:");
	        printArray(arr);
	    }
	    
	    public static void mergeSort(int[] arr) {
	        if (arr.length < 2) {
	            return;
	        }
	        
	        int mid = arr.length / 2;
	        int[] left = new int[mid];
	        int[] right = new int[arr.length - mid];
	        
	        // Populate left and right arrays
	        for (int i = 0; i < mid; i++) {
	            left[i] = arr[i];
	        }
	        for (int i = mid; i < arr.length; i++) {
	            right[i - mid] = arr[i];
	        }
	        
	        mergeSort(left);  // Recursively sort the left subarray
	        mergeSort(right); // Recursively sort the right subarray
	        merge(left, right, arr); // Merge the two sorted subarrays
	    }
	    
	    public static void merge(int[] left, int[] right, int[] arr) {
	        int i = 0, j = 0, k = 0;
	        
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }
	        
	        while (i < left.length) {
	            arr[k++] = left[i++];
	        }
	        
	        while (j < right.length) {
	            arr[k++] = right[j++];
	        }
	    }
	    
	    public static void printArray(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	        System.out.println();
	    }
	}


