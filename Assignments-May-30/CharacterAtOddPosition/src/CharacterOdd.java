import java.util.Scanner;

public class CharacterOdd {
	public static void main(String args[]) {
		String s;
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			if(i%2!=0) {
				res=res+s.charAt(i);
			}
		}
		System.out.println("Result= " + res);
	}
}
