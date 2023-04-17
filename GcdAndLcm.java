import java.io.*;
import java.util.*;

public class GcdAndLcm {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int prod = n1*n2;
		while(n1%n2!=0){
			int rem = n1%n2;
			n1 = n2;
			n2 = rem;
		}

		int gcd = n2;
		int lcm = prod/gcd;

		System.out.println("Gcd: "+gcd);
		System.out.println("Lcm: "+lcm);
	}
}
