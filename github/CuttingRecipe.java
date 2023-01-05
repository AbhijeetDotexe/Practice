import java.io.*;
import java.util.*;

public class CuttingRecipe {
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
			String[] strs = br.readLine().split(" ");
			int n = Integer.parseInt(strs[0]);
			int[] arr = new int[n];
			int min = 1001;
			for (int i=1;i<=n ;i++ ) {
				arr[i-1] = Integer.parseInt(strs[i]);
				if(arr[i-1]<min) min=arr[i-1];
			}

			for (int j=min;j>0 ;j-- ) {
				boolean flag = true;
				for (int k=0;k<n ;k++ ) {
					if (arr[k]%j!=0) {
						flag = false;
						break;
					}
				}
				if(flag){
					min=j;
					break;
				}
			}
			for(int i=0;i<n;i++) System.out.print(arr[i]/min+" ");
		    System.out.println();
		}
	}
}
