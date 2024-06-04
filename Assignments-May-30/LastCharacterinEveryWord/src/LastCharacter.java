import java.util.*;

public class LastCharacter {
	public static void main(String args[]) {
		String s;
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String[] words=s.split("\\s+");
		String result="";
		for(String word:words) {
			char ch=word.charAt(word.length()-1);
			if(Character.isLetter(ch)) {
				result=result+ch;
			}
		}
		System.out.println("Result= " + result);
	}
}
