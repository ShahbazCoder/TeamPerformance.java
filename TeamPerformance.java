public class TeamPerformance {

	private String name;
	private int gamesPlayed;
	private int gamesWon;
	private int gamesDrawn;
	private int goalsScored;
	private int goalsConceded;
	
    public TeamPerformance() {
    	this.name="";
    	this.gamesPlayed=0;
    	this.gamesWon=0;
    	this.gamesDrawn=0;
    	this.goalsScored=0;
    	this.gamesPlayed=0;
    }
       
    public TeamPerformance(String name,int gamesPlayed,int gamesWon,int gamesDrawn,int goalsConceded){
    	this.name=name;
    	this.gamesPlayed=gamesPlayed;
    	
    	if(gamesPlayed<gamesWon)
    		throw new IllegalArgumentException("Games played is less than games won");
    	this.gamesWon=gamesWon;
    	
    	if(gamesPlayed-gamesWon < gamesDrawn)
    		throw new IllegalArgumentException("The difference between games played and games won is less than games drawn");
    	this.gamesDrawn=gamesDrawn;
    	
    	this.goalsConceded=goalsConceded;
    }
    
}


class Team{
	public static void main (String[] args) {
		try{
			TeamPerformance T = new TeamPerformance("CodeStar",10,20,14,10);
			System.out.println ("Program is successfully executed.");
		}
		catch(IllegalArgumentException e){
			System.out.println (e.getMessage());
		}
}
}