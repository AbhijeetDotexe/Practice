import java.io.*;
import java.util.*;

public class BinaryExponentiation {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int ans = Power(a,n);
		System.out.println(ans);
	}

	public static int Power(int a, int n){
		int res=1;
		while(n>0){
			if(n%2!=0){
				res*=a;
				// System.out.println(n);
				n-=1;
			}else if(n%2==0){
				a*=a;
				n/=2;
			}
		}
		return res;
	}
}
