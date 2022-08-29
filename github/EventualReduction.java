import java.io.*;
import java.util.*;

public class EventualReduction {
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
			String s = br.readLine();
			if (n%2==1) {
				System.out.println("NO");
			}else {
				HashSet<Character> ans = new HashSet<>();
				for (int i=0;i<n ;i++ ) {
					if (ans.contains(s.charAt(i))) {
						ans.remove(s.charAt(i));
					}else {
						ans.add(s.charAt(i));
					}
				}

				if (ans.size()==0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}

		}
	}
}
