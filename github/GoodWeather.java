import java.io.*;
import java.util.*;

public class GoodWeather {
    public static void main(String[] args) {
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (Exception e) {
            System.err.println("Error");
        }
             Scanner sc= new Scanner(System.in);
     int n= sc.nextInt();
     for(int i=1;i<=n;i++){
        int r=0;
        int s=0;
        for(int j=1;j<=7;j++){
            int a= sc.nextInt();
            if(a == 1){
                r=r+1;
            }
            else if(a == 0){
                s=s+1;
            }
        }
        if(r > s){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
        r=0;
        s=0;
        }

    }
}
