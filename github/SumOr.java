import java.io.*;
import java.util.*;

public class SumOr {
	static int mod = 1000000007;
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
			long n = Long.parseLong(br.readLine());
			long ans = 0;
        	for (int i=1;i<n ;i++ ) {
        		for (int j=1;j<n;j++) {
        			for (int k=1;k<n ;k++ ) {
        				if((i+j+k==n) && ((i|j|k)==n)){
        					ans++;
        				}
        			}
        		}
        	}
            System.out.println(ans);
		}
	}
}
