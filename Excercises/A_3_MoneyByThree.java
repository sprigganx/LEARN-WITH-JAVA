package Excercises;
import java.util.Scanner;

/* 
 * Ejercicio 3: Guillermo tiene N dolares. 
 * Luis tiene la mitad de lo que posee Guillermo. 
 * Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. 
 * Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */

public class A_3_MoneyByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float luis, juan, gillermo, total;

        System.out.println("Enter the amount of money that Gillermo has: ");
        gillermo = sc.nextFloat();

        luis = gillermo / 2;
        juan = (luis + gillermo) / 2;

        total = luis + juan + gillermo;

        System.out.println("Gillermo has: " + gillermo + " of money" + "\nLuis has: " + luis + " of money" + "\nJuan has: " + juan + " of money");
        System.out.println("The amount of money they have between the three of them is: " + total);
        sc.close();
    }
}
