import java.io.*;
import java.util.*;

public class LongestConsequtiveSubsequence {
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
			int[] nums = {100,4,200,1,3,2};
			int ans = longestConsecutive(nums);
			System.out.println(ans);
		}
	}

	public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
        	set.add(num);
        }
        int maxConsecutive = 1;
        for(int n:nums){
        	if(!set.contains(n-1)){
        		int currentNum = n;
        		int currentSeq = 1;

        		while(set.contains(currentNum+1)){
        			currentNum+=1;
        			currentSeq+=1;
        		}
        		maxConsecutive = Math.max(maxConsecutive,currentSeq);
        	}

        }
        return maxConsecutive;
    }
}
