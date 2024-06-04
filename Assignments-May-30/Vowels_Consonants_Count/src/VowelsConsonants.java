import java.util.Scanner;

public class VowelsConsonants {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.nextLine();
		
		int vowelcount=0,constcount=0;
		String vowels="aeiouAEIOU";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(Character.isLetter(ch)) {
				if(vowels.indexOf(ch)!=-1) {
					vowelcount++;
				}else {
					constcount++;
				}
			}
		}
		System.out.println("Vowel Count=" + vowelcount);
		System.out.println("Consonant Count=" + constcount);
	}
}