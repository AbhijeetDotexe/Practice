import java.io.*;
import java.util.*;

public class FirstAndLastPosition {
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
			int[] nums = {5,7,7,8,8,10};
			int target=8;
			int[] ans = searchRange(nums,target);
			System.out.println(Arrays.toString(ans));
		}
	}
	public static int[] searchRange(int[] nums, int target) {
        int start=0, end=nums.length-1;
        ArrayList<Integer> index = new ArrayList<>();
        while(start<=end){
        	int mid=start+(end-start)/2;
        	if (nums[mid]==target) {
        		index.add(mid);
        		start=mid;
        		end=nums.length-1;
        		
        	}else if(nums[mid]>target){
        		end=mid-1;
        	}else {
        		start=mid+1;
        	}
        }
        Integer[] ans = new Integer[index.size()]; 
        ans = index.toArray(ans);
        if (ans.length!=0) {
        	System.out.println(Arrays.toString(ans));
        	return new int[]{ans[0],ans[ans.length-1]};
        }else{
        	return new int[]{-1,-1};
        }
    }
}
