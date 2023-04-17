import java.io.*;
import java.util.*;

public class fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n = sc.nextInt();
		Double ans = factorialNumber(n);
		System.out.println(ans);
				
	
	}

	static Double factorialNumber(int n){
		if (n==0) {
			return 1.0;
		}
		return n*factorialNumber(n-1);
	}
}