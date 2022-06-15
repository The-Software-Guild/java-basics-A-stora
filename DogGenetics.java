import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your dog's name? ");
        String name = input.next();
        System.out.println("Well then, I have this highly reliable report on "+name+"'s prestigious background right here.\n");
        System.out.println(name+" is:\n");

        double total;
        double b1 = Math.random(); // Generate 5 random numbers
        double b2 = Math.random();
        double b3 = Math.random();
        double b4 = Math.random();
        double b5 = Math.random();

        total = b1+b2+b3+b4+b5;
        b1 = Math.round((b1/total*100));
        b2 = Math.round((b2/total*100)); // Round them as they need to be whole numbers
        b3 = Math.round((b3/total*100)); // Results may not be perfectly random
        b4 = Math.round((b4/total*100));
        total = b1+b2+b3+b4;
        b5 = 100 - total; // 5th value gets corrected based on rounding errors to sum to 100%
        total = b1+b2+b3+b4+b5;


        System.out.println(b1 + "% St. Bernard");
        System.out.println(b2 + "% Chiuahua");
        System.out.println(b3 + "% Dramatic RedNosed Asian Pug");
        System.out.println(b4 + "% Common Cur");
        System.out.println(b5 + "% King Doberman");
        System.out.println("totals "+total+"%");
        System.out.println("Wow! that's quite a dog!");
    }
}
