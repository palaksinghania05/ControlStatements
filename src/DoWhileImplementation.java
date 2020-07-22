/*Create an application called Magical Number.
This application will ask user to enter a number and you will
match that number with your selected magical number,
if it matches then user wins,otherwise
user will try again. Moreover,user have the option to exit by pressing 0.
 */
import java.util.Scanner;

public class DoWhileImplementation {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Welcome to Magical Number Game.");
        int magicalNumber = 51;
        int number;
        //use of loop
        do{
            System.out.println("Enter a Positive Integer.Press 0 to exit.");
            number = object.nextInt();
            //control statement
            if(number == magicalNumber){
                System.out.println("You won the game.");
                break;
            }
            else if(number != 0){
                System.out.println("Try Again");
            }
        }while(number != 0);
        System.out.println("Thanks for playing.");
        object.close();
    }
}
