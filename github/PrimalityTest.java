import java.io.*;
import java.util.*;

public class PrimalityTest {
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
			if (isPrime(n)) {
				System.out.println("yes");
			}else {
				System.out.println("no");
			}
		}
	}

 	public static boolean isPrime(int n){
			if(n==1){
				return false;
			}

			for(int i=2;i*i<=n;i++){
				if(n%i==0){
					return false;
				}
			}
			return true;
		}
}
