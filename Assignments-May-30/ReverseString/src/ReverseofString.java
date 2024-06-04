import java.util.Scanner;

public class ReverseofString {
	public static void main(String args[]) {
		String s;
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		String s1,res="";
		s1=s.toLowerCase();
		for(int i=0;i<s1.length();i++) {
			res=s1.charAt(i)+res;
		}
		System.out.println("Reversed String=" + res);
	}
}
