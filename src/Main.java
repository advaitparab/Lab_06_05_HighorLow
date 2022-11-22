import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String [] args)
    {
        Scanner kb = new Scanner(System.in);

        Random rand = new Random();
        int num;

        int guess = 0;
        int guesses = 0;
        char yorn;
        String in;
        for(int i=1;i<=1;i++)
        {
            num = rand.nextInt(10) + 1;
            guesses = 0;
            for(int j=1; j<=1;j++)
            {
                System.out.println("Guess what number I have (1-10)? ");
                guess = kb.nextInt();
                guesses ++;

                if(guess > num) {
                    System.out.println("Too high, try again. The number is:"+num);
                } else if(guess< num) {
                    System.out.println("Too low, try again. The number is:"+num);
                } else {
                    System.out.println("You're right, the number is " + num);

                }
            }

        }
    }
}