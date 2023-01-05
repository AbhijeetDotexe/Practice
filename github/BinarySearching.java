import java.io.*;
import java.util.*;

public class BinarySearching {
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
			int[] nums = {-1,0,3,5,9,12};
			int target = 9;
			int ans = search(nums, target);
			System.out.println(ans);
		}
	}
	 public static int search(int[] arr, int target) {
        int start=0, end=arr.length-1;
        while(start<=end){
        	int mid=start+(end-start)/2;
        	if (arr[mid]==target) {
        		return mid;
        	}else if(arr[mid]<target){
        		start=mid+1;
        	}else if(arr[mid]>target) {
        		end=mid-1;
        	}
        }
        return -1;
    }
}
