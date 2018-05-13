import java.util.Scanner;
import java.util.WeakHashMap;

public class Menu {
    public void displayMenu() {
        System.out.println("A. Play Preliminary Stage\n" +
                "B. Play Final\n" +
                "C. Display Teams\n" +
                "D. Display Players\n" +
                "E. Display Cup Result\n" +
                "X. Close\n");

        System.out.println("Procede with a selection");

        String selection;
        while ((selection=scanner.next())!="X"){
            switch (selection){
                case "A":
                    new Game().playGame();
                    break;
                case "B":
                    new Game().playFinal();
                    break;
                case "C":
                    new Game().displayTeams();
                    break;
                case "D":
                    new Game().displayPlayers();
                    break;
                case "E":
                    new Game().displayCupResult();
                    break;
                case "X":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Oops ! You might have made an incorrect choice there !");

            }

            System.out.println("\nA. Play Preliminary Stage\n" +
                    "B. Play Final\n" +
                    "C. Display Teams\n" +
                    "D. Display Players\n" +
                    "E. Display Cup Result\n" +
                    "X. Close\n");
        }

    }
    public Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu();
    }
}
