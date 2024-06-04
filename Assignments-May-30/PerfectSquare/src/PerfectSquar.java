import java.util.Scanner;

public class PerfectSquar {
	public static void main(String args[]) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		if(Math.ceil(Math.sqrt(n))==Math.floor(Math.sqrt(n))) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}
