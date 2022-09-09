import java.io.*;
import java.util.*;

public class ZeroToEnd {
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
			int[] nums = {0,1,0,3,12};
			moveZeroes(nums);
			System.out.println(Arrays.toString(nums));
		}
	}

	public static void moveZeroes(int[] nums) {
		int n = nums.length, k=0;
        int[] temp = Arrays.copyOfRange(nums,0,n);
        for (int i=0;i<n;i++) {
        	if (temp[i]!=0) {
        		nums[k] = temp[i];
        		k++;
        	}
        }
        while(k<n){
        	nums[k] = 0;
        	k++;
        }
    }
}
