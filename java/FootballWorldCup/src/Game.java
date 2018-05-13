

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
                        myTeams.get(i).setNoOfGoals(random.nextInt(5));
//                        myTeams.get(i).player1.setGoals(Math.abs(myTeams.get(i).noOfGoals));
//                        myTeams.get(i).player2.setGoals(Math.abs((myTeams.get(i).noOfGoals) - (myTeams.get(i).player1.getGoals())));

                        myTeams.get(j).setNoOfGoals(random.nextInt(5));
//                        int gOne=myTeams.get(j).noOfGoals;
//                        myTeams.get(j).player1.setGoals(random.nextInt((gOne)));
//                        myTeams.get(j).player1.setGoals(Math.abs(random.nextInt(myTeams.get(j).noOfGoals)));
//                        myTeams.get(j).player2.setGoals(Math.abs((myTeams.get(j).noOfGoals)) - (myTeams.get(j).player1.getGoals()));

                        //checking for games Won
                        if (myTeams.get(i).getNoOfGoals() > myTeams.get(j).getNoOfGoals()) {
                            myTeams.get(i).setGamesWon(1);
                            myTeams.get(i).setOverallPoints(3);

                        } else {
                            myTeams.get(i).setGamesWon(0);
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
                        myTeams.get(i).setYellowCard(random.nextInt(4));
                        myTeams.get(i).setRedCard(random.nextInt(1));
                        myTeams.get(j).setYellowCard(random.nextInt(4));
                        myTeams.get(j).setRedCard(random.nextInt(1));

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
    *  Goals scored are counted for Golden Boot Award
    *
    *
    */
    private static void penaltyShootOut(Team t1,Team t2) {
        try {
            t1.setNoOfGoals(new Random().nextInt(6));
            t2.setNoOfGoals(new Random().nextInt(6));

            if (t1.noOfGoals > t2.noOfGoals) {
                System.out.println("Team : " + t1.getName() + " wins in a penalty shoot out " + t1.noOfGoals + " goals");
            } else if (t2.noOfGoals > t1.noOfGoals) {
                System.out.println("Team : " + t2.getName() + " wins in a penalty shoot out " + t2.noOfGoals + " goals");
            } else if (t1.noOfGoals == t2.noOfGoals) {
                penaltyShootOut(t1, t2);
            }
        }catch (Exception e){
            System.out.println(e);
        }
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
        System.out.println("\t\tPlayed\t\tWon\t\tLost\t\tDrawn\t\tGoals\t\tPoints\t\tFair Play Score");

        int arrDisplayPoints[]=new int[4];
        for(int j=0;j<myTeams.size();j++){
            arrDisplayPoints[j]=myTeams.get(j).overallPoints;
        }
        Arrays.sort(arrDisplayPoints);

        for(int k=arrDisplayPoints.length-1;k>=0;k--) {
            for (int l = 0;l<myTeams.size(); l++){
                if (arrDisplayPoints[k] == myTeams.get(l).overallPoints) {
                    System.out.println(myTeams.get(l).getName()+"\t\t"+
                            myTeams.get(l).noOfGamesPlayed+"\t\t"+
                            myTeams.get(l).gamesWon+"\t\t"+
                            myTeams.get(l).gamesLost+"\t\t"+
                            myTeams.get(l).noOfGamesDrawn+"\t\t"+
                            myTeams.get(l).totalGoals+"\t\t"+
                            myTeams.get(l).overallPoints+"\t\t"+
                            myTeams.get(l).fairPlayScore);

                }
            }
        }
    }


    public void setPlayers(){
        System.out.println("Please input two players in each team or X to exit");

        for(int i=0;i<myTeams.size();i++) {


            System.out.println("Team : " + myTeams.get(i).getName());

            String playerOneName = scanner.next();
            if (playerOneName.equals("X")){
                System.exit(0);
            }
            if (playerOneName.length() < 2) {
                System.out.println("Player1's name should have a minimum of two aplhabetical characters.\nTry again");
                playerOneName = scanner.next();
                if(playerOneName.length()<2){
                    System.out.println("INVALID AGAIN!!!");
                    myTeams.get(i).player1.setName("Player-1-" + myTeams.get(i).getName());
                    System.out.println("Player one's name will be -> (" + myTeams.get(i).player1.name + ")");
                }else {
                    myTeams.get(i).player1.setName(playerOneName);
                    System.out.println("1. "+myTeams.get(i).player1.name);
                }

            } else {
                if (playerOneName.startsWith("-") || playerOneName.endsWith("-")) {
                    System.out.println("Player's name should not start or end with a hyphen !!!\nTry another name");

                    String secondTrial1 = scanner.next();
                    if (secondTrial1.startsWith("-") || secondTrial1.endsWith("-")) {
                        System.out.println("INVALID AGAIN!!!");
                        myTeams.get(i).player1.setName("Player-1-" + myTeams.get(i).getName());
                        System.out.println("Player one's name will be -> (" + myTeams.get(i).player1.name + ")");
                    } else {
                        myTeams.get(i).player1.setName(secondTrial1);
                        System.out.println("1. "+myTeams.get(i).player1.name);
                    }
                } else {
                    myTeams.get(i).player1.setName(playerOneName);
                    System.out.println("1. "+myTeams.get(i).player1.name);
                }
            }


            String playerTwoName = scanner.next();
            if (playerTwoName.equals("X")){
                System.exit(0);
            }
            if (playerTwoName.length() < 2) {
                System.out.println("Player2's name should have a minimum of two aplhabetical characters.\nTry again");
                playerTwoName = scanner.next();
                if (playerTwoName.length() < 2) {
                    System.out.println("INVALID AGAIN!!!");
                    myTeams.get(i).player2.setName("Player-2-" + myTeams.get(i).getName());
                    System.out.println("Player two's name will be -> (" + myTeams.get(i).player2.name + ")");
                }else {
                    myTeams.get(i).player2.setName(playerOneName);
                    System.out.println("2. "+myTeams.get(i).player2.name);
                }
            } else {
                if (playerTwoName.startsWith("-") || playerTwoName.endsWith("-")) {
                    System.out.println("Player's name should not start or end with a hyphen !!!\nTry another name");

                    String secondTrial2 = scanner.next();
                    if (secondTrial2.startsWith("-") || secondTrial2.endsWith("-")) {
                        System.out.println("INVALID AGAIN!!!");
                        myTeams.get(i).player2.setName("Player-2-" + myTeams.get(i).getName());
                        System.out.println("Player one's name will be -> (" + myTeams.get(i).player2.name + ")");
                    } else {
                        myTeams.get(i).player2.setName(secondTrial2);
                        System.out.println("2. "+myTeams.get(i).player2.name);
                    }
                } else {
                    myTeams.get(i).player2.setName(playerTwoName);
                    System.out.println("2. "+myTeams.get(i).player2.name);
                }

            }
        }
    }
    public void displayPlayers(){
        for(int i=0;i<myTeams.size();i++){
            System.out.println(myTeams.get(i).player1.getName()+" ("+myTeams.get(i).getName()+")-"+myTeams.get(i).player1.goals);
            System.out.println(myTeams.get(i).player2.getName()+" ("+myTeams.get(i).getName()+")-"+myTeams.get(i).player2.goals);
        }

    }

    public void playFinal(){
        try {
            Team t1 = null;
            Team t2 = null;
            Random random = new Random();
            int myArr[] = new int[4];
            int myGoals[] = new int[4];
            for (int i = 0; i < myTeams.size(); i++) {
                myArr[i] = myTeams.get(i).overallPoints;
                myGoals[i] = myTeams.get(i).totalGoals;
            }
            Arrays.sort(myArr);
            int team2 = myArr[2];
            int team1 = myArr[3];

            Arrays.sort(myGoals);
            int gteam2 = myGoals[2];
            int gteam1 = myGoals[3];


            String firstTeam = "";
            String secondTeam = "";
            StringBuilder stringBuilder = new StringBuilder("");
            for (int j = 0; j < myTeams.size(); j++) {
                if (team1 == myTeams.get(j).overallPoints && myTeams.get(j).totalGoals >= gteam2) {
                    myTeams.get(j).setNoOfGoals(random.nextInt(5));
                    t1 = myTeams.get(j);
                    firstTeam = String.valueOf(myTeams.get(j).getName() + " " + myTeams.get(j).getNoOfGoals());

                }
                if (team2 == myTeams.get(j).overallPoints && myTeams.get(j).totalGoals >= gteam2) {
                    myTeams.get(j).setNoOfGoals(random.nextInt(5));
                    t2 = myTeams.get(j);
                    secondTeam = String.valueOf(myTeams.get(j).getName() + " " + myTeams.get(j).getNoOfGoals());

                }

            }
            System.out.println(stringBuilder.append("\nFinal Game result " + firstTeam + " vs. " + secondTeam));
            if (t1.noOfGoals == t2.noOfGoals) {
                penaltyShootOut(t1, t2);
            }
        }catch (Exception e){
            System.out.println(e);
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

        setMyTeams(teams);
        Menu menu = new Menu();
        menu.displayMenu();

        System.out.println();
        for(int i=0;i<teams.size();i++){
            System.out.println(teams.get(i).getName());
        }
    }
}

