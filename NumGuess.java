import java.util.Scanner;
public class NumGuess
{
    // fuction which implements the number guessing game
    public static void guessingNumberGame()
    {
        //scanner class
        Scanner sc = new Scanner(System.in);
        //generate the numbers
        int number = 1 + (int)(100*Math.random());
        // number of trials that the user has to guess the number
        int N = 10;
        int i, guess;
        System.out.println("A number is chosen  between 1 to 100."+"Guess the number within 10 trials.");
        //iterate over N trials
        for(i=1; i<N ;i++)
        {
            System.out.println("Guess the number: ");
            // take input for guessing
            guess = sc.nextInt();

            if(guess <= 0 || guess > 100)
            System.out.println("Your Guess Is Invalid");

            // if the number is guessed
            else if(number==guess)
            {
                System.out.println("Congratulations! You won!");
                System.out.println("You guessed the number in "+i+" guesses");
                break;
            }
            else if(number> guess)
            {
                System.out.println("Nope! The number is greater than "+ guess+". Guess Again.");
                
             
            }
            else 
            {
                System.out.println("Nope! The number is less than "+ guess+". Guess Again.");
                
                
            }

        }
        if(i==N)
        {
            System.out.println("You ran out of tries.\nYou lose!");
            System.out.println("The number was "+ number);
        }
    }
    // Driver code
    public static void main(String arg[])
    {
        //function call
        guessingNumberGame();
    }

}
