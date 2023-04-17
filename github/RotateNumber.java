import java.io.*;
import java.util.*;

public class RotateNumber {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int temp = n;
		int nod = 0;
		while(temp>0){
			temp = temp/10;
			nod++;
		}
		k = k%nod;
		if(k<0){
			k = k + nod;
		}

		int div=1;
		int mult=1;
		for (int i=1;i<=nod ;i++ ) {
			if(i<=k){
				div = div*10;
			}else {
				mult = mult*10;
			}
		}

		int q = n/div;
		int r = n%div;

		int ans = r*mult + q;
		System.out.println(ans);
	}
}
