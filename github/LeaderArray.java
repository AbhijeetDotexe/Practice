import java.io.*;
import java.util.*;

public class LeaderArray {
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
			int[] arr = {16,17,4,3,5,2};
			ArrayList<Integer> ans = new ArrayList<>();
			ans = leaders(arr,6);
			System.out.println(ans);
		}
	}
	public static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n-1];
        ans.add(max);
        for (int i=n-2;i>=0 ;i-- ) {
        	if (arr[i]>max) {
        		ans.add(arr[i]);
        		max = arr[i];
        	}
        }
        Collections.reverse(ans);
        return ans;
    }
}
