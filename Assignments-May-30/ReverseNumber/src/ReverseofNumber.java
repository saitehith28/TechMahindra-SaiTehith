import java.util.Scanner;

public class ReverseofNumber {
	public static void main(String args[]) {
		int n;
		System.out.println("Enter the Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int rev=0,rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println("Reversed Number=" + rev);
	}
}
