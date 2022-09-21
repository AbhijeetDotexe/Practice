import java.io.*;
import java.util.*;

public class IsolationCenters {
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
			int q = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			HashMap<Character,Integer> map = new HashMap<>();
			for (int i=0;i<s.length();i++) {
				map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
			}
			for (int j=0;j<q ;j++ ) {
				// int x = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(br.readLine());
				int count = 0;
				for(char k: map.keySet()){
					if (map.get(k)-x>0) {
						count+=map.get(k)-x;
					}
				}
				System.out.println(count);
			}
		}
	}
}
