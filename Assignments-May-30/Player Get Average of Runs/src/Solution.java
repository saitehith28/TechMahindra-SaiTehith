import java.util.ArrayList;
import java.util.Scanner;

public class Solution extends Player{
	public static double[] findAverageOfRuns(Player[] players,int target) {
		ArrayList<Double> averages=new ArrayList<>();
		for(Player player:players) {
			if(player.getMatchesPlayed()>=target) {
				double average=(double)player.getRunsScored()/player.matchesPlayed;
				averages.add(average);
			}
		}
		double[] result=new double[averages.size()];
		for(int i=0;i<averages.size();i++) {
			result[i]=averages.get(i);
		}
		return result;
	}
	public static void main(String args[]) {
		Player[] players=new Player[4];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.println("Enter Details:");
			int id=sc.nextInt();
			String name=sc.next();
			int iccRank=sc.nextInt();
			int matchesPlayed=sc.nextInt();
			int runsScored=sc.nextInt();
			players[i]=new Player(id,name,iccRank,matchesPlayed,runsScored);
		}
		int target=sc.nextInt();
		double[] averages=findAverageOfRuns(players,target);
		for(double average:averages) {
			if(average>=80 && average<=100) {
				System.out.println("Grade A");
			}else if(average>=50 && average<=79) {
				System.out.println("Grade B");
			}else {
				System.out.println("Grade C");
			}
		}
	}
}
