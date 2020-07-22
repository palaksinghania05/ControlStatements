/*Accept a number from user and check whether the given
number is even or odd.
 */
import java.util.Scanner;

public class IfElseImplementation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer");
        int number = sc.nextInt();
        //control statement
        if(number %2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
        sc.close();
    }
}
