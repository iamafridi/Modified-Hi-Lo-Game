
import java.util.Scanner;

public class HiLo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.print("Enter a number : ");
        int guess = input.nextInt();
        while (guess != number) {
            if (guess > number) {
                System.out.println("Too High");
            } else {
                System.out.println("Too Low");
            }
            System.out.println("Enter a number : ");
            guess = input.nextInt();
        }
        System.out.println("You are correct!!!");
    }
}
