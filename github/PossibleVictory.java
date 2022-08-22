import java.io.*;
import java.util.*;

public class PossibleVictory {
	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int o = sc.nextInt();
		int s = sc.nextInt();
		int p = (20-o)*36;
		if (r<s+p) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
