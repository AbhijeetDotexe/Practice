import java.io.*;
import java.util.*;

public class FactorialNumbers {
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
		Long n = Long.parseLong(st.nextToken());	
		ArrayList<Long> a = new ArrayList<>();
		a = factorialNumbers(n);
		System.out.println(a);
		}
	}
		public static ArrayList<Long> factorialNumbers(long N){
        // code here
			ArrayList<Long> ans = new ArrayList<>();
			if (N==1) {
				ans.add(N);
				return ans;
			}
			for (int i=1;i<=N ;i++ ) {
				if (fact(i)>N) {
					return ans;
				}
				ans.add(fact(i));
			}
			return ans;
    	}

    	public static long fact(int n){
    		if (n<=2) {
    			return n;
    		}
    		return n*fact(n-1);
    	}
}
