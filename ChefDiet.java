import java.io.*;
import java.util.*;

public class ChefDiet {
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
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int[] arr = new int[n];
			int sum=0,index=0;
			boolean flag = true;
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(strs[i]);
				sum+=arr[i];
				sum-=k;
				if(sum<k){
					flag = false;
					index = i;
					break;
				}
			}
			if(flag){
				System.out.println("YES");	
			}else{
				System.out.println("NO" + index);
			}
		}
	}
}
