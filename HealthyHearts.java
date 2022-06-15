import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your age?");

        String age = input.next();

        while(true){ // Check user input is a valid integer using parsing
            try {
                Integer.parseInt(age);
                break;
            }catch(Exception e){
                System.out.println("That is not a number, please try again");
                age = input.next();
            }
        }
        int ageInt = Integer.parseInt(age); // Calculations
        int maxRate = 220 - ageInt;
        int rangeLow = (int)(Math.round(maxRate*0.5));
        int rangeHigh = (int)(Math.round(maxRate*0.85));
        System.out.println("Your maximum heart rate should be "+maxRate+" beats per minute");
        System.out.println("Your target HR zone is "+rangeLow+" - "+rangeHigh+" beats per minute");
    }
}
