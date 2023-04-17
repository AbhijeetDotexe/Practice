import java.io.*;
import java.util.*;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = new int[100];
		int[] arr1 = {5,1,2,3,4};
		int a=100;
		for(int i=0;i<arr.length;i++){
			arr[i]=a;
			a--;
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println("Arry after sorting");
		bubble(arr1);
		System.out.println(Arrays.toString(arr1));
	}

	static void bubble(int[] arr){
		boolean swapped;
		for (int i=0;i<arr.length ;i++ ) {
			swapped=false;
			for (int j=1;j<arr.length-i ;j++ ) {
				if (arr[j]<arr[j-1]) {
					//swap
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swapped=true;
				}
			}
			if (swapped==false) {
			break;
		}
		}
		
	}
}