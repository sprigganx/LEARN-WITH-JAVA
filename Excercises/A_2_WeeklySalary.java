package Excercises;
import java.util.Scanner;

/* 
 * Ejercicio 1: Hacer un programa que calcule e imprima el salario
 * semanal de un empleado a partir de sus horas semanales trabajadas
 * y de su salario por hora
 */

public class A_2_WeeklySalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float salary, weeklyhours, weeklysalary;

        System.out.println("Enter your weekly hours: " );
        weeklyhours = sc.nextFloat();
        System.out.println("Enter your salary: ");
        salary = sc.nextFloat();

        weeklysalary = weeklyhours * salary;

        System.out.println("The weekly salary is: " + weeklysalary);
        sc.close();

    }
}
