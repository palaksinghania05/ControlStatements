/*Accept a number and
print its table.
 */
import java.util.Scanner;

public class ForLoopImplementation {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter a positive Integer for getting its table.");
        int number = object.nextInt();
        for(int i=1 ; i<=10 ; i++){
            System.out.println(number + "X" + i + "=" + number*i);
        }
        object.close();
    }
}
