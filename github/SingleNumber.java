import java.io.*;
import java.util.*;

public class SingleNumber {
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
		  int[] nums = {4,1,2,1,2};
		  int ans = singleNumber(nums);
		  System.out.println(ans);
		}
	}
	public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int i=0;i<nums.length ;i++ ) {
        	ans^= nums[i];
        }
        return ans;
    }
}
