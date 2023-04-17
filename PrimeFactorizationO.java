import java.io.*;
import java.util.*;

public class PrimeFactorizationO {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		primeFact(n);
	}


	public static void primeFact(int n){
		for (int i=2;i*i<=n ;i++ ) {
			if (n%i==0) {
				int count=0;
				while(n%i==0){
					count++;
					n/=i;
				}
				System.out.println(i+"^"+count);
			}
			}if (n>1) {
				System.out.println(n+"^"+1);
			}
	}
}
