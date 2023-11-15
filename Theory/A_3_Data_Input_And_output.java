package Theory;
import java.util.Scanner;

public class A_3_Data_Input_And_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.println("Give a number: ");
        number = sc.nextInt();

        System.out.println("The number is: " + number);
        sc.close();
    }
}