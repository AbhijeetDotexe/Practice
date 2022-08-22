import java.io.*;
import java.util.*;

public class VaccineDate {
	public static void main(String[] args) throws IOException{
		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int i=0;i<t ;i++ ) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int D = Integer.parseInt(st.nextToken());
			int L = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());
			if (D>=L && D<=R) {
				System.out.println("Take Second Dose Now");
			}else if (D<L) {
				System.out.println("Too Early");
			}else if(D>L && D>R){
				System.out.println("Too Late");
			}
		}
	}
}


