import java.io.*;
import java.util.*;

public class MinimumSum {

	public static int gcd(int a, int b){
        if (a==0){
            return b;
        }
        return gcd(b%a,a);
    }
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
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		String line = br.readLine();
		String[] strs = line.trim().split("\\s+");
		for (int i=0;i<N ;i++ ) {
			arr[i] = Integer.parseInt(strs[i]);
		}

		int min = 1000000000;
		int ans;
		for (int j=0;j<N-1 ;j++) {
			
			ans = gcd(arr[j],arr[j+1]);
			if (ans<=min) {
				min = ans;
			}
		}
		System.out.println(min*N);
		}
	}
}
