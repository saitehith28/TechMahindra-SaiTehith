import java.util.Scanner;
import java.util.ArrayList;
public class Solution extends Associate{
	public static Associate[] associatesForGivenTechnology(Associate[] associates,String searchTechnology) {
		ArrayList<Associate> result = new ArrayList<>();
		for(Associate associate:associates) {
			if(associate.getTechnology().equalsIgnoreCase(searchTechnology) && associate.getExperienceInYears()%5==0) {
				result.add(associate);
			}
		}
		return result.toArray(new Associate[result.size()]);

	}
	public static void main(String args[]) {
		Associate[] associates=new Associate[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("Enter Details:");
			int id=sc.nextInt();
			String name=sc.next();
			String technology=sc.next();
			int exp=sc.nextInt();
			associates[i]=new Associate(id,name,technology,exp);
		}
		String searchTechnology=sc.next();
		Associate[] result=associatesForGivenTechnology(associates, searchTechnology);
		for(Associate associate:result) {
			System.out.println(associate.getId());
		}
		
	}
}
