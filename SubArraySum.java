import java.io.*;
import java.util.*;

public class SubArraySum {
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
			int[] nums = {1,1,1};
			int k = 2;
			int ans = subarraySum(nums,k);
			System.out.println(ans);
		}
	}

	 public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count=0, sum=0;
        map.put(0,1);
        for (int i=0;i<nums.length;i++ ) {
        	sum+=nums[i];
        	if (map.containsKey(sum-k)) {
        		count+=map.get(sum-k);
        	}
        	map.put(sum,map.getOrDefault(sum,0)+1);
        	// System.out.println(map.put(sum,map.getOrDefault(sum,0)+1));
        }
        return count;
    }
}
