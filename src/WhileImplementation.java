/*Create an application which accept numbers from user and stop
when gets three even numbers.
 */
import java.util.Scanner;

public class WhileImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //counter for the case
        int count = 0;
        //while loop
        while(count !=3){
            System.out.println("Enter a positive integer");
            int number = sc.nextInt();
            //control statement
            if(number % 2 == 0){
                count++;
            }
        }
        System.out.println("Got 3 even numbers.");
        sc.close();
    }
}
