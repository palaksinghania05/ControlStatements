/*Accept a number from user and check if the given number is greater than 50 &
inform the user if the number is greater than 50.
 */
import java.util.Scanner;

public class IfImplementation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = obj.nextInt();
        //control statement
        if(number > 50){
            System.out.println("You have entered a number greater than 50");
        }
        obj.close();
    }
}
