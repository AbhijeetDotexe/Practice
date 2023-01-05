import java.io.*;
import java.util.*;

public class WeightBalance {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
		while(t-->0){;
   			// StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[5];
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
            int change = arr[1] - arr[0];
            if (change >= (arr[2] * arr[4]) && change <= (arr[3] * arr[4])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
		}
	}
}
	