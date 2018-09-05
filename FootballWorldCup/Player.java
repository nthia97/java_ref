public class Player {


    public String name; // should allow use of a hyphen but shoul not start or end with a hyphen
    public int goals;// Determine top goal scorer (Golden boot)

    public Player(){  //The default contructor

    }

    public Player(String name){ //constructor that accepts values for the fields as parameter
        this.name=name;

    }


    //Setters
    public void setName(String name){
        this.name=name;
    }

    public void setGoals(int goals){
        this.goals+=goals;
    }

    //getters
    public String getName(){
        return this.name;
    }

    public int getGoals(){
        return this.goals;
    }
}