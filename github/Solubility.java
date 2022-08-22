import java.io.*;
import java.util.*;

public class Solubility {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		for (int i=0;i<t ;i++ ) {
			int x,a,b,ans;
			x = Integer.parseInt(br.readLine());
			a = Integer.parseInt(br.readLine());
			b = Integer.parseInt(br.readLine());

			ans = a+(100-x)*b;
			System.out.println(ans*10);
		}
	}
}
