import java.io.*;
import java.util.*;

public class SortColors {
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
		int[] arr = {2,0,2,1,1,0};
        // quickS(arr,0, arr.length-1);
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
		}
	}

	public static void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        quickS(nums,low,high);
    }

    public static void quickS(int[] arr, int low, int high){
    	if (low>=high) {
    		return ;
    	}
    	int s=low, e=high, m=s+(e-s)/2;
    	int pivot = arr[m];
    	while(s<=e){
    		while(arr[s]<pivot){
    			s++;
    		}
    		while(arr[e]>pivot){
    			e--;
    		}

    		if (s<=e) {
    			int temp = arr[s];
    			arr[s] = arr[e];
    			arr[e] = temp;
    			s++;
    			e--;
    		}
    	}
    	quickS(arr,low,e);
    	quickS(arr,s,high);
    }
}
