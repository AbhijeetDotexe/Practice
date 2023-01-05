import java.io.*;
import java.util.*;

public class Carvans {
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
			// int count=1;
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(strs[i]);
			}
  			int count=0;
		    int min=Integer.MAX_VALUE;
		    int minarr[]=new int[n];
		    for(int i=0;i<n;i++){
		        if(arr[i]<min){
		            min=arr[i];
		        }
		        minarr[i]=min;
		    }
		    for(int i=0;i<n;i++){
		        if(arr[i]>minarr[i]){
		            count++;
		        }
		    }
		    System.out.println(n-count);
		}
	}
}
