import java.io.*;
import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		 int[] arr = {5,6,2,3,1,8,7,9,4};
        int[] arr1 = {1,2,3,4,5,6,7,-21,-32,-4,-15,0};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
	}

	public static void bubble(int[] arr){
		boolean swapped ;
		int n = arr.length;
		for (int i=0;i<n ;i++ ) {
			swapped = false;
			for (int j=1;j<n ;j++ ) {
				if (arr[j]<arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					swapped = true;
				}
			}
			while(!swapped){
				break;
			}
		}
	}
}