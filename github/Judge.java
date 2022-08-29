import java.io.*;
import java.util.*;

public class Judge {
	public static void main(String[] args) throws IOException {
		// try {
		// 	System.setIn(new FileInputStream("input.txt"));
		// 	System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		// } catch (Exception e) {
		// 	System.err.println("Error");
		// }
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		// int t = Integer.parseInt(br.readLine());
		// Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(br.readLine());
		while(t-->0){
			
			// Scanner a = new Scanner(System.in);
			int n = Integer.parseInt(st.nextToken());
			// int n = sc.nextInt();
			int[] alice = new int[n];
			int[] bob = new int[n];
			int sumA=0, sumB=0;

			for (int i=1;i<=n ;i++ ) {
				// StringTokenizer a = new StringTokenizer(br.readLine());
				// Scanner sc = new Scanner(System.in);
				alice[i] = Integer.parseInt(st.nextToken());
				// alice[i] = sc.nextInt();
				sumA+=alice[i];
			}

			for (int j=1;j<=n ;j++ ) {
				// StringTokenizer b = new StringTokenizer(br.readLine());
				// Scanner s = new Scanner(System.in);
				bob[j] = Integer.parseInt(st.nextToken());
				// bob[j] = sc.nextInt();
				sumB+=bob[j];
			}

			if (sumB>sumA) {
				System.out.println("BoB");
			}else if (sumA>sumB) {
				System.out.println("ALice");
			}else {
				System.out.println("Draw");
			}
		}
	}
}
