import java.util.*;
import java.io.*;


public class start {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("welcome to student management app");
        while(true){
            System.out.println("PRESS 1 to add student");
            System.out.println("PRESS 2 to delete student");
            System.out.println("PRESS 3 to display student");
            System.out.println("PRESS 4 to exit app");
            // c= sc.nextInt();
            // sc.nextLine();//Bhai matt use kiya kar Scanner, BufferedReader use kiya kar next int dikkat kar rha tha
            c = Integer.parseInt(sc.nextLine());// ye doosra method hai upar waali do line ko ek mai hi likhne ke liye
            
            if(c==1){
               System.out.println("enter student name");
               String name=sc.nextLine();
               System.out.println("enter student phone");
               String phone=sc.nextLine();
               System.out.println("enter student city");
               String city=sc.nextLine();
               Student obj=new Student(name,phone,city);
               System.out.println(obj);
            }
            else if(c==2){
                break;
            }
            else if(c==3){
             break;   
            }
            else if(c==4){
                break;
            }
            else{
                System.out.println("enter correct input");
            }
        }
        System.out.println("thanks yous visit again");
    }
}