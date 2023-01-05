import java.util.*;
import java.io.*;
public class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number you want to reverse: ");
		int num = sc.nextInt();
		int newNumber = 0;
		while(num!=0){
			newNumber = newNumber*10;
			newNumber += num%10;
			num = num/10;
		}
		System.out.println("Reverse of the given Number is : " +newNumber);
	}