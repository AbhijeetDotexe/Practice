import java.io.*;
import java.util.*;

public class ChefAndTablet {
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
            String line = br.readLine();
            String[] strs = line.trim().split("\\s+");
            int n = Integer.parseInt(strs[0]);
            int b = Integer.parseInt(strs[1]);
            int area=0, Area=0;
            for(int i=0;i<n;i++){
                String[] s = br.readLine().split(" ");
                int w = Integer.parseInt(s[0]);
                int h = Integer.parseInt(s[1]);
                int p = Integer.parseInt(s[2]);
                if(b<p){
                    area = w*h;
                    if(Area<area){
                        Area = area;
                    }
                }   
            }
            if(Area==0){
                System.out.println("no tablet");
            }else{
                System.out.println(Area);
            }
        }
    }
}
