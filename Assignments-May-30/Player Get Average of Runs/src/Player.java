
public class Player {
	int id;
	String name;
	int iccRank;
	int matchesPlayed;
	int runsScored;
	Player(){};
	public Player(int id,String name,int iccRank,int matchesPlayed,int runsScored) {
		this.id=id;
		this.name=name;
		this.iccRank=iccRank;
		this.matchesPlayed=matchesPlayed;
		this.runsScored=runsScored;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getIccRank() {
		return iccRank;
	}
	public int getMatchesPlayed() {
		return matchesPlayed;
	}
	public int getRunsScored() {
		return runsScored;
	}
}
