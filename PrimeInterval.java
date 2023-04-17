import java.io.*;
import java.util.*;

public class PrimeInterval {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		int r = Integer.parseInt(br.readLine());
		for (int i=l;i<=r ;i++ ) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int l){
		if(l==1){
			return false;
		}
		for (int i=2;i*i<=l ;i++ ) {
			if(l%i==0){
				return false;
			}
		}
		return true;
	}
}
