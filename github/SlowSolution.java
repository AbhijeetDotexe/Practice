import java.io.*;
import java.util.*;

public class SlowSolution {
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
			int maxT = Integer.parseInt(st.nextToken()); 
			int N = Integer.parseInt(st.nextToken()); 
			int sumN = Integer.parseInt(st.nextToken()); 

			int T = sumN/N;
			int remaining = sumN%N;
			int ans = 0;
			if (T<=maxT) {
				ans = T*(int)(Math.pow(N,2));
			}else {
				ans = maxT*(int)(Math.pow(N,2));
			}

			if (maxT-T>=1) {
				ans+=(int)(Math.pow(remaining,2));
			}
			System.out.println(ans);
		}
	}
}
