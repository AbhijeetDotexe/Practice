import java.io.*;
import java.util.*;

public class div33 {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int x = -1;
			for (int i = 1; i < 1000; i++) {
                if ((a ^ i) < (b ^ i) && (b ^ i) < (c ^ i)) {
                    x = i;
                    break;
                }
            }
            System.out.println(x);
		}
	}
}
