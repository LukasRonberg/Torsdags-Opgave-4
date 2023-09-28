public class Team{
	private String teamName;
	private int teamRank;
	private String playerNames;

	public Team(String teamName){
this.teamName = teamName;

	}
	public int setRank(int rank){

teamRank = rank;
return rank;
	}
	public String toString(){
		return "Team: " + teamName + " Rank: " + teamRank;
	}
}