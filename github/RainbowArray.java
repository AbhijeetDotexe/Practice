import java.io.*;
import java.util.*;

public class RainbowArray {
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
			int x=1;
			int[] arr = new int[n];
			String line = br.readLine();
			String[] str = line.trim().split("\\s+");
			for (int i=0;i<n ;i++ ) {
				arr[i] = Integer.parseInt(str[i]);
				
			}
			boolean flag=true;
			int count = 0;
			for (int j = 0; j < (arr.length+1)/2; j++) {
				if (arr[j] != arr[arr.length - 1 - j] || arr[j]-count >1) {
						flag=false;
						break;
				}else {
					count=arr[j];

				}
			}
			if(flag && count==7 ) {
				System.out.print("yes" + "\n");
			}else{
				System.out.println("no"+"\n");
			}
			
			}
	}
}
