import java.io.*;
import java.util.*;

public class RemoveDuplicates {
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
			// int[] nums = {0,0,1,1,1,2,2,3,3,4};
			int[] nums = {1,1,2};
			int ans = removeDuplicates(nums);
			System.out.println(ans);

		}
	}

	public static int removeDuplicates(int[] nums) {
        int n = nums.length;
    	int[] ans = Arrays.copyOfRange(nums,0,n);
    	int j=0;
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int i=0;i<n;i++) {
        	if (hs.contains(ans[i])) {
        		continue;
        	}else {
        		hs.add(ans[i]);
        		nums[j] = ans[i];
        		j++;
        	}
        }
        // System.out.println(Arrays.toString(nums));
        return hs.size();
    }
}
