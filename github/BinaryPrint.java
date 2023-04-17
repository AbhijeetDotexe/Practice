import java.io.*;
import java.util.*;

public class BinaryPrint {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=1;i<=t ;i++ ) {
			printBinary(i);	
		}
		char A = 'A';
		int a = A | (1<<5);
		System.out.println((char)a);
		System.out.println((char)('D'|' '));//For converting any Uppercase to lowercase
		System.out.println((char)('d'&'_'));//For converting any lowercase to uppercase
		int n = 32;
		int x=4, y=6;
		System.out.println(Integer.toBinaryString(n));
		System.out.println(Integer.toBinaryString(n-1));
		System.out.println(Integer.toBinaryString(n>>1));
		System.out.println(Integer.toBinaryString(n>>2));
		System.out.println(Integer.toBinaryString(n>>3));
		System.out.println(n);
		System.out.println(n>>1);
		System.out.println(n>>2);
		System.out.println(n>>3);
		System.out.println("Number Swap");
		x = x^y;
		System.out.println(x);
		y = y^x;
		System.out.println(y);
		x= x^y;
		System.out.println(x);
		System.out.println(1<<2);
		System.out.println(1<<3);
		System.out.println(1<<4);
		
	}

	static void printBinary(int n){
		for (int i=4;i>=0 ;--i ) {
			System.out.print((n>>i)&1);
		}
		System.out.println();
	}
}
