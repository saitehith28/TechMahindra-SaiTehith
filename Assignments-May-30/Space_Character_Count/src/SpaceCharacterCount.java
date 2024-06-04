import java.util.Scanner;

public class SpaceCharacterCount {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.nextLine();
		int space=0, charac=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch==' ') {
				space++;
			}else {
				if(Character.isLetter(ch)){
					charac++;
				}
			}
		}
		System.out.println("No of Spaces=" + space);
		System.out.println("No of Characters=" + charac);
	}
}
