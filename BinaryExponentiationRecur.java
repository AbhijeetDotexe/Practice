import java.io.*;
import java.util.*;

public class BinaryExponentiationRecur {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		long ans = binaryExpoRecur(a,b);
		long ans2 = binaryExpoIter(a,b);
		System.out.println(ans);
		System.out.println(ans2);

	}

	public static long binaryExpoRecur(int a, int b){
		if (b==0) {
			return 1;
		}
		long res = binaryExpoRecur(a,b/2);
		if ((b&1)==1) {
			return a * res*res;
		}else {
			return res*res;
		}
	}

	public static long binaryExpoIter(int a,int b){
		int ans = 1;
		while(b>0){
			if ((b&1)==1) {
				ans = ans*a;
			}
			a = a*a;
			b>>=1;
		}
		return ans;
	}
}
