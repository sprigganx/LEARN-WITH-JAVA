package Excercises;
import java.util.Scanner;

/* 
 * Ejercicio 1: Hacer un programa que calcule e imprima la suma de tres calificaciones.
 */

public class A_1_Sum3Notes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int note1, note2, note3, sum;

        System.out.println("Give a three notes: ");
        note1 = sc.nextInt();
        note2 = sc.nextInt();
        note3 = sc.nextInt();

        sum = note1 + note2 + note3;

        System.out.println("The final note is: " + sum);
        sc.close();
    }
}