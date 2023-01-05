import java.io.*;
import java.util.*;

public class UniqueNumber {
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
			int[] nums = {4,1,2,1,2,5,4,3,2,1};
			int[] ans = singleNumber(nums);
			System.out.println(Arrays.toString(ans));
		}
	}
	public static int[] singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int[] ans = new int[nums.length];
        for (int i=0;i<nums.length ;i++ ) {
        	if(set.contains(nums[i])){
        		set.remove(nums[i]);
        	}else {
        		set.add(nums[i]);
        	}
        }
        int k=0;
        for (Integer i: set) {
          ans[k] = i;
          k++;
      }
      return ans;
    }
}
