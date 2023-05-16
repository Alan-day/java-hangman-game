public class Main {
    public static void main(String[] args) {

        Words word = new Words();
        DisplayResults results = new DisplayResults("Word");
        UserInput newInput = new UserInput();

       // results.getRemainingLives() != 0
        results.getRemainingLives();

        while (results.getRemainingLives() > 0) {


            System.out.println(word.getWord());
            results.takeawayLives();
            System.out.println(results.getRemainingLives());
        }



        System.out.println(word.getWord());

    }





    //while loop (while lives != 0)
    // input always in uppercase ( toUpper() )
    // import java.util.Scanner;
    // Scanner myObj = new Scanner(System.in)
    // userInput = myObj.nextLine();
    // class DisplayResults
    // class storeUserInput
    // class Game (Main)
    // class random word selection
    // transform word to underscore
    // 	boolean find(userInput)
    //  class random wordSelect
    //  index[Random]
}
