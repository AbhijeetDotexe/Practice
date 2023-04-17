import java.io.*;
import java.util.*;

public class WilsonTheorem {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count = 0;
		for (int i=1;i<t ;i++ ) {
			if (isPrime(i)==1) {
				System.out.println(i);
				count++;
			}
			
		}
		System.out.println(count);
		// long ans = isPrime(t);
		// System.out.println(ans);
	}

	// public static long fact(int p){
	// 	if (p<=1) {
	// 		return 1;
	// 	}
	// 	return p * fact(p-1);
	// }

	// public static long isPrime(int p){
	// 	if (p==4) {
	// 		return 0;
	// 	}
	// 	// return (fact(p>>1)%p);
	// 	// return (fact(p-1) % p == (p-1) ? 1 : 0); // check if (p-1)! ≡ -1 (mod p)
	// 	return (fact * (p - 1) % p == p - 1) ? 1 : 0;
	// }

	public static long isPrime(int p) {
    if (p == 2 || p == 3) {
        return 1; // handle base cases for primes
    } else if (p < 2 || p % 2 == 0 || p % 3 == 0) {
        return 0; // handle base cases for non-primes
    }
    long fact = fact(p - 1);
    return (fact * (p - 1) % p == p - 1) ? 1 : 0; // check if (p-1)! ≡ -1 (mod p)
}
}
