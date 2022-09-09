import java.io.*;
import java.util.*;

public class MaxConsecutiveOnes {
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
			int[] nums = {1,1,0,1,1,1};
			int ans = findMaxConsecutiveOnes(nums);
			System.out.println(ans);
		}
	}
	 public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count=0, max=0;
        for (int i=0;i<n;i++ ) {
        	if (nums[i] == 0) {
        		count = 0;
        	}else {
        		count+=1;
        		if(count > max){
        			max = count;
        		}
        	}
        }
        return max;
    }
}
