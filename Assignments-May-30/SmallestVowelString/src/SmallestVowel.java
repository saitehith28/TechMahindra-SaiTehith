import java.util.Scanner;

public class SmallestVowel {
	public static void main(String[] args) {
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		s=sc.next();
		String vowel="aeiou";
		char ch='z';
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(vowel.indexOf(c)!=-1) {
				if(c<ch) {
					ch=c;
				}
			}
		}
		System.out.println("Smallest Vowel=" + ch);
	}
}
