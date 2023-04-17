import java.io.*;
import java.util.*;

public class PrimeFactorization {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i=2;i*i<=n ;i++ ) {
			while(n%i==0){
				n = n/i;
				System.out.print(i+" ");
			}
		}

		if (n!=1) {
			System.out.println(n);
		}
		System.out.println();
	}
}
