import java.io.*;
import java.util.*;

public class SumOfDivisors {
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
			long sum = sumOfDivisors(n);
			System.out.println(sum);
		}
	}

	static long sumOfDivisors(int N){
        long sum = 0;
        // for (int i=1;i<=N;i++ ) {
        // 	for (int j=1;j<=i;j++) {
        // 		if (i%j==0) {
        // 			sum+=i/j;
        // 		}
        // 	}
        // }

        for (int i=1;i<=N ;i++ ) {
        	sum+=(N/i)*i;
        }
        return sum;
    }
}
