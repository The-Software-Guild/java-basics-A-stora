import java.util.ArrayList;
import java.util.Scanner;
public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) { //main loop
            System.out.println("=======================================================");
            System.out.println("Welcome to my Rock-Paper-Scissors console application!!");
            System.out.println("=======================================================\n");
            System.out.println("How many rounds would you like to play? (1-10)");

            String rounds = in.next();

            while(true){
                try {
                    Integer.parseInt(rounds);
                    break;
                }catch(Exception e){
                    System.out.println("That is not a number, please try again");
                    rounds = in.next();
                }
            }
            int roundsInt = Integer.parseInt(rounds);
            //only get to here once you have a valid integer in rounds

            if (roundsInt > 10 || roundsInt < 1) {
                System.out.println("You either can't read or type, congratulations.");
                return;
            }

            playGame(roundsInt);

            System.out.println("Would you like to play again? y/n");
            String yesNo = in.next();
            if(!yesNo.equals("y")){
                break;
            }
        }
        System.out.println("Thanks for playing!");
    }
    public static void playGame(int rounds){
        Scanner in = new Scanner(System.in);
        int computerChoice, diff,userChoice;
        int wins = 0;
        int ties = 0;
        String userChoiceStr;
        ArrayList<String> options = new ArrayList<>(); // List used to easily display the correct word to user while using numbers in the code
        options.add("Secret 0th option");
        options.add("Paper");
        options.add("Scissors");
        options.add("Rock");


        for(int i = 1; i <= rounds; i++){
            System.out.println("Make your choice Rock (3), Scissors (2), or Paper (1)");
            userChoiceStr = in.next();

            while(true){ // Checking user inputs a valid integer
                try{
                    userChoice = Integer.parseInt(userChoiceStr);
                    if(userChoice <4 && userChoice >0){ // Checking user input is either 1,2,3
                        break;
                    } else{
                        throw new Exception();
                    }
                } catch(Exception e){
                    System.out.println("That's not a valid number, please try again");
                    userChoiceStr = in.next();
                }
            }


            computerChoice = (int)(Math.random()*3)+1;
            System.out.println("You chose " + options.get(userChoice));
            System.out.println("The computer chose " + options.get(computerChoice));
            diff = userChoice - computerChoice;


            if(diff == 0){
                ties++;
                System.out.println("Draw!\n");
            } else if(diff > 0 ^ Math.abs(diff)>1){      //xor of sign and magnitude greater than 1 tells us whether the player wins or loses when done this way round (draw is caught by another if)
                wins++;
                System.out.println("You win!\n");
            } else{
                System.out.println("you lose!\n");
            }
        }

        System.out.println("After " + rounds + " rounds, you have won " + wins + " and tied on " + ties);
        System.out.println("The computer won " + (rounds - wins - ties));

        if(wins > (rounds - wins - ties)){
            System.out.println("You beat the computer by chance!");
        } else if(wins == (rounds - wins - ties)) {
            System.out.println("It's a tie!");
        }else{
            System.out.println("The computer beat you with skill and tactics.");
        }

    }
}
