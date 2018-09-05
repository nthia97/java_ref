
public class Team {
    private String name;  //The name of the country the team is representing
    private int ranking;      //The teams strength (1-4)


    public Player player1=new Player();
    public Player player2=new Player();

    //default constructor
    public Team(){

    }

    //contructor that accepts values
    public Team(String name){
        this.name=name;
    }


        //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setRanking(int ranking){
        this.ranking=ranking;
    }



    //getters
    public String getName(){
        return this.name;
    }

    public String getRanking(){
        return String.valueOf(this.ranking);
    }

    public String getPlayer1(){
        return player1.name;
    }

    public String getPlayer2(){
        return player2.name;
    }

    /*
    * Yellow card and red card for determining a teams fair play
    * */
    public int yellowCard;
    public int redCard;

    public int noOfGamesDrawn=0;
    public int noOfGamesPlayed=0;  //The number of games the team has played in the cup
    public int gamesWon=0;
    public int gamesLost=0;
    public int noOfGoals;
    public int overallPoints=0;
    public int totalGoals=0;
    public int fairPlayScore=0;

    //setters
    public void setPlayer1(Player player1){
        this.player1=player1;
    }

    public void setPlayer2(Player player2){
        this.player2=player2;
    }

    public void setNoOfGamesDrawn(int noOfGamesDrawn){
        this.noOfGamesDrawn+=noOfGamesDrawn;
    }
    public void setYellowCard(int yellowCard){

        this.yellowCard=yellowCard;
        if (yellowCard>0)
            fairPlayScore+=1;
    }

    public void setRedCard(int redCard){

        this.redCard=redCard;
        if(redCard>0)
            fairPlayScore+=2;
    }

    public void setNoOfGamesPlayed(int noOfGamesPlayed){
        this.noOfGamesPlayed+=noOfGamesPlayed;
    }

    public void setGamesWon(int gamesWon){
        this.gamesWon+=gamesWon;
    }

    public void setGamesLost(int gamesLost) {
        this.gamesLost+= gamesLost;
    }
    public void setNoOfGoals(int goals){
        this.noOfGoals=goals;
        this.totalGoals+=goals;
    }
    public void setOverallPoints(int overallPoints){
        this.overallPoints+=overallPoints;
    }

    //gettters
    public int getNoOfGoals(){
        return noOfGoals;
    }


}
