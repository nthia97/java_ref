

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public Scanner scanner=new Scanner(System.in);
    public static ArrayList<Team> myTeams = new ArrayList<Team>();


    public static void setMyTeams(ArrayList<Team> myTeams) {
        Game.myTeams = myTeams;
    }

    public static ArrayList<Team> getMyTeams() {
        return myTeams;
    }

    /*
                    * Simulates the playing of a game between two teams
                    *
                    * Higher ranked team:
                    * a goal range of 0 to (5 + a random upset (a random numberbetween 0 and 2))
                    *
                    * Lower ranked team:
                    * a goal range of 0 to ((5 – difference in team rank) + a randomupset (a random number between 0 and 2))
                    */
    public void playGame() {

        Random random=new Random();
        setPlayers();

        try {

            for (int i = 0; i < myTeams.size(); i++) {
                for (int j = 0; j < myTeams.size(); j++) {
                    if (i != j) {
                        System.out.println("\nNext game is : "+myTeams.get(i).getName()+" vs."+myTeams.get(j).getName());


                        //The first game
                        myTeams.get(i).setNoOfGoals(Math.abs(random.nextInt(5) ));
                        myTeams.get(i).player1.setGoals(Math.abs(random.nextInt(3)));
                        myTeams.get(i).player2.setGoals(Math.abs((myTeams.get(i).noOfGoals) - (myTeams.get(i).player1.getGoals())));

                        myTeams.get(j).setNoOfGoals(Math.abs(random.nextInt(5)));
                        myTeams.get(j).player1.setGoals(Math.abs(random.nextInt(myTeams.get(j).noOfGoals)));
                        myTeams.get(j).player2.setGoals(Math.abs((myTeams.get(j).noOfGoals)) - (myTeams.get(j).player1.getGoals()));

                        //checking for games Won
                        if (myTeams.get(i).getNoOfGoals() > myTeams.get(j).getNoOfGoals()) {
                            myTeams.get(i).setGamesWon(1);
                            myTeams.get(i).setOverallPoints(3);

                        } else {
                            myTeams.get(i).setGamesWon(0);
                            myTeams.get(i).setOverallPoints(0);
                        }

                        if (myTeams.get(j).getNoOfGoals() > myTeams.get(i).getNoOfGoals()) {
                            myTeams.get(j).setGamesWon(1);
                            myTeams.get(j).setOverallPoints(3);
                        } else {
                            myTeams.get(j).setGamesWon(0);
                        }

                        //checking for games lost
                        if (myTeams.get(i).getNoOfGoals() < myTeams.get(j).getNoOfGoals()) {
                            myTeams.get(i).setGamesLost(1);
                            myTeams.get(i).setOverallPoints(0);
                        } else {
                            myTeams.get(i).setGamesLost(0);
                        }

                        if (myTeams.get(j).getNoOfGoals() < myTeams.get(i).getNoOfGoals()) {
                            myTeams.get(j).setGamesLost(1);
                            myTeams.get(j).setOverallPoints(0);
                        } else {
                            myTeams.get(j).setGamesLost(0);
                        }

                        //checking for games drawn
                        if (myTeams.get(i).getNoOfGoals() == myTeams.get(j).getNoOfGoals()) {
                            myTeams.get(i).setNoOfGamesDrawn(1);
                            myTeams.get(i).setOverallPoints(1);
                        } else {
                            myTeams.get(i).setNoOfGamesDrawn(0);
                        }

                        if (myTeams.get(j).getNoOfGoals() == myTeams.get(i).getNoOfGoals()) {
                            myTeams.get(j).setNoOfGamesDrawn(1);
                            myTeams.get(j).setOverallPoints(1);
                        } else {
                            myTeams.get(j).setNoOfGamesDrawn(0);
                        }

                        //cards awarded
                        myTeams.get(i).setYellowCard(Math.abs(random.nextInt(4) + 0));
                        myTeams.get(i).setRedCard(Math.abs(random.nextInt(1) + 0));
                        myTeams.get(j).setYellowCard(Math.abs(random.nextInt(4) + 0));
                        myTeams.get(j).setRedCard(Math.abs(random.nextInt(1) + 0));

                        myTeams.get(i).setNoOfGamesPlayed(1);
                        myTeams.get(j).setNoOfGamesPlayed(1);
                        displayGameResult(i, j);
                    }
                }
            }
        }catch (Exception e){
            System.out.println("\nStart prelimanary again");
        }
    }

    /*
    * Method smulates the playing of a penalty shoot out if  finals game ends as draw
    * one play in a team has 5 shots at a goal
    * if scores equal,each player has a another shot
    *  Goals scored are counted for Gowwlden Boot Award
    *
    *
    */
    private static void penaltyShootOut() {

    }

    /*
    * Displays the result of the end game on the screen
    */
    private static void displayGameResult(int i,int j) {
        System.out.println("\nGame result: "+myTeams.get(i).getName()+" "+myTeams.get(i).getNoOfGoals()+" vs. "
        +myTeams.get(j).getName()+" "+myTeams.get(j).getNoOfGoals());

        if(myTeams.get(i).redCard>0 ||myTeams.get(j).redCard>0 || myTeams.get(i).yellowCard>0 || myTeams.get(j).yellowCard>0){
            System.out.print("Cards awarded:\n");
            if(myTeams.get(i).redCard>0) {
                System.out.println("\t\t->"+myTeams.get(i).getName()+" "+myTeams.get(i).redCard+"-red card");
            }
            if(myTeams.get(i).yellowCard>0) {
                System.out.println("\t\t->"+myTeams.get(i).getName()+" "+myTeams.get(i).yellowCard+"-yellow card");
            }
            if(myTeams.get(j).redCard>0) {
                System.out.println("\t\t->"+myTeams.get(j).getName()+" "+myTeams.get(j).redCard+"-red card");
            }
            if(myTeams.get(j).yellowCard>0) {
                System.out.println("\t\t->"+myTeams.get(j).getName()+" "+myTeams.get(j).yellowCard+"-yellow card");
            }
        }

    }

    public void displayTeams(){
        System.out.println("\t\tPlayed\tWon\tLost\tDrawn\tGoals\tPoints\tFair Play Score");

        for (int i=0;i<myTeams.size();i++){
            System.out.println(myTeams.get(i).getName()+"\t\t"+
                    myTeams.get(i).noOfGamesPlayed+"\t\t"+
                    myTeams.get(i).gamesWon+"\t\t"+
                    myTeams.get(i).gamesLost+"\t\t"+
                    myTeams.get(i).noOfGamesDrawn+"\t\t"+
                    myTeams.get(i).totalGoals+"\t\t"+
                    myTeams.get(i).overallPoints+"\t\t"+
                    myTeams.get(i).fairPlayScore);

        }
    }

    public void setPlayers(){
        System.out.println("Please input two players in each team");
        for(int i=0;i<myTeams.size();i++){
            System.out.println("Team : "+myTeams.get(i).getName());
            myTeams.get(i).player1.setName(scanner.next());
            myTeams.get(i).player2.setName(scanner.next());
        }
    }
    public void displayPlayers(){
        for(int i=0;i<myTeams.size();i++){
            System.out.println(myTeams.get(i).player1.getName()+" ("+myTeams.get(i).getName()+")-"+myTeams.get(i).player1.goals);
            System.out.println(myTeams.get(i).player2.getName()+" ("+myTeams.get(i).getName()+")-"+myTeams.get(i).player2.goals);
        }

    }

    public void playFinal(){
        Random random=new Random();
        int myArr[]=new int[4];
        int myGoals[]=new int[4];
        for(int i=0;i<myTeams.size();i++){
            myArr[i]=myTeams.get(i).overallPoints;
        }
        Arrays.sort(myArr);
        int team2=myArr[2];
        int team1=myArr[3];



        for(int j=0;j<myTeams.size();j++){
            if(team1==myTeams.get(j).overallPoints ){
                myTeams.get(j).setNoOfGoals(random.nextInt(5));
                System.out.print(myTeams.get(j).getName()+" "+myTeams.get(j).getNoOfGoals());

            }
            if(team2==myTeams.get(j).overallPoints ){
                myTeams.get(j).setNoOfGoals(random.nextInt(5));
                System.out.println(myTeams.get(j).getName()+" "+myTeams.get(j).getNoOfGoals());

            }


        }
    }

    public void displayCupResult(){
        int arr[]=new int[4];

        for(int i=0;i<myTeams.size();i++){
            arr[i]=myTeams.get(i).overallPoints;
        }
        Arrays.sort(arr);
        int winner=arr[3];

        for (int j=0;j<myTeams.size();j++){
            if(winner==myTeams.get(j).overallPoints){
                System.out.println("The winning team is: "+myTeams.get(j).getName());
            }
        }
    }





    public static void main(String[] args) {
        ArrayList<Team> teams=new ArrayList<Team>();
        teams.add(new Team("France"));
        teams.add(new Team("Kenya"));
        teams.add(new Team("Spain"));
        teams.add(new Team("Ghana"));

        teams.get(0).setPlayer1(new Player("Paul"));
        setMyTeams(teams);
//        Game game=new GaAme();
//        game.playGame();
//        game.displayTeams();
        Menu menu = new Menu();
        menu.displayMenu();



        System.out.println();
        for(int i=0;i<teams.size();i++){
            System.out.println(teams.get(i).getName());
        }

    }



}

