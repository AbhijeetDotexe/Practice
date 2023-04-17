import java.io.*;
import java.util.*;

public class EqualElements {
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
			for(int i=0;i<n;i++){
				arr[i] = Integer.parseInt(strs[i]);
			}

			int ans = minOperation(arr,n);
			System.out.println(ans);
		}
	}

	 public static int minOperation (int arr[], int n){
       HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
         
        for (int i=0; i<n; i++)
            if(hash.containsKey(arr[i]))
                hash.put(arr[i], hash.get(arr[i])+1);
            else hash.put(arr[i], 1);
         
        int max_count = 0;
        Set<Integer> s = hash.keySet();
         
        for (int i : s)
            if (max_count < hash.get(i))
                max_count = hash.get(i);
        return (n - max_count);
    }
}
