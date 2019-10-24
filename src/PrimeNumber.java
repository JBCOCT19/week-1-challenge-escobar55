import java.util.Random;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String [] args){

        //create the scanner object
        Scanner key = new Scanner(System.in);

        //prompt the user for a number
        System.out.print("Please enter a number: ");
        int num = key.nextInt();

        boolean isPrime = true; //Check if number is prime

        //Part 1 ----With user input------------------------------------------------>
        for(int i = 2; i <= num/2; i++){
            if(num % i == 0) {
                System.out.println(num + " is not a prime number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number");
        }

        //Part 2 ---------With a random number---------------------------------------->
        Random r = new Random();
        int x = 1 + r.nextInt(250);

        for(int i = 2; i <= x/2; i++){
            if(x % i == 0) {
                System.out.println("----------------------------"); //Adding a space between the two results
                System.out.println("From our random generator....");
                System.out.println(x + " is not a prime number");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("From our random generator...");
            System.out.println(x + " is a prime number");
        }


    }

}


