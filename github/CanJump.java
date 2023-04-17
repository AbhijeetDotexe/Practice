import java.io.*;
import java.util.*;

public class CanJump {
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
			int[] nums = {3,2,1,0,4};
			boolean ans = canJump(nums);
			System.out.println(ans);
		}
	}

	public static boolean canJump(int[] nums){
		int n = nums.length;
		if(n==1) return true;
		int max=0;
		for (int i=0;i<n-1&&max>=i;i++) {
			if (max<i+nums[i]) {
				max=i+nums[i];
			}
			if (max>=n-1) {
				return true;
			}
		}
		return false;
	}
}
