import java.io.*;
import java.util.*;

public class Tablet {
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
			int n = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			String line = br.readLine();
			int area = 0;
			int Area = 0;
			for (int i=0;i<n ;i++ ) {
				StringTokenizer s = new StringTokenizer(br.readLine());
				int w = Integer.parseInt(s.nextToken());
				int h = Integer.parseInt(s.nextToken());
				int p = Integer.parseInt(s.nextToken());

				if (b>=p) {
					Area = w*h;
					if (area<Area) {
						area = Area;
					}
				}
			}

			if (area == 0) {
				System.out.println("no tablet");
			}else {
				System.out.println(area);
			}
		}
	}
}
