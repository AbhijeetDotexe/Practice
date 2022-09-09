import java.io.*;
import java.util.*;

public class QuickSorting {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){

        int[] arr = {5,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
	}
}
	public static void quickSort(int[] nums, int low, int high){

		if (low>=high) {
			return ;
		}
		int s = low;
		int e = high;
		int m = s+(e-s)/2;
		int pivot = nums[m];
		while(s<=e){
			while(nums[s]<pivot){
				s++;
			}
			while(nums[e]>pivot){
				e--;
			}
		if (s<=e) {
			int temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s++;
			e--;
		}
	}
	quickSort(nums,low,e);
	quickSort(nums,s,high);
	}
}
