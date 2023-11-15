package Theory;
import java.util.Scanner;

public class A_5_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number1, number2, sum, substract, mult, div, waste;

        System.out.println("Write two numbers: " );
        number1 = sc.nextFloat();
        number2 = sc.nextFloat();

        sum = number1 + number2;
        substract = number1 - number2;
        mult = number1 * number2;
        div = number1 / number2;
        waste = number1%number2;

        System.out.println("The sum is: " + sum);
        System.out.println("The substract is: " + substract);
        System.out.println("The mult is: " + mult);
        System.out.println("The div is: " + div);
        System.out.println("The waste is: " + waste);

        sc.close();

    }
}
