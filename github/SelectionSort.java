import java.io.*;
import java.util.*;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {4, 1, 3, 9, 7,2};
		int n = 6;
		System.out.println(Arrays.toString(arr));
		selection(arr,n);
		System.out.println(Arrays.toString(arr));
	}

	public static void selection(int[]arr, int n){

	    for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }`
	}
}

