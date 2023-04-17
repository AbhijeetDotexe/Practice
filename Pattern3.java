import java.io.*;
import java.util.*;

public class Pattern3 {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int space = t/2;
		int star = 1;
		for (int i=1;i<=t ;i++ ) {
			// System.out.println(space+" "+star);
			for (int j=1;j<=space ;j++ ) {
				System.out.print("\t");
			}
			for (int j=1;j<=star ;j++ ) {
				System.out.print("*\t");
			}
			System.out.println();
			if (i<=t/2) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
		}

	}
}
