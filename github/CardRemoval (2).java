import java.io.*;
import java.util.*;

public class CardRemoval {
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
			int[] arr = new int[n];
			String line = br.readLine();
			String[] strs = line.trim().split("\\s+");
			int max = 1;
			HashMap<Integer,Integer> hm = new HashMap<>();
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(strs[i]);
				if(hm.containsKey(arr[i])){
					int of = hm.get(arr[i]);
					int nf = of+1;
					hm.put(arr[i],nf);
					if(max<nf){
						max = nf;
					}
				}else{
					hm.put(arr[i],1);
				}
			}

			System.out.println(n-max);
		}
	}
}
