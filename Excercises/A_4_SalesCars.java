package Excercises;
import java.util.Scanner;

/* 
 * Ejercicio 3: 
 * Una compañía de ventas de carros usados, paga a su personal de ventas
 * un salario de $1000 mensuales, mas una comisión de $150 por cada carro vendido,
 * más el 5% del valor de la venta por carro. Cada mes el capturista de la empresa
 * ingresa en la computadora los datos pertinentes.
 
 * Hacer un programa que calcule e imprima el salario mensual de un vendedor dado.
 */

public class A_4_SalesCars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarymonth = 1000.00, comission = 150.00, carsvalue = 0.05, salary;
        int carsquantity;
        String name;
        // salevalue = 0.05; 
        
        System.out.println("Enter the name of the employeed: ");
        name = sc.nextLine();
        System.out.println("Enter the quantity of cars solds: ");
        carsquantity = sc.nextInt();

        salary = salarymonth + (carsquantity * comission) + (carsvalue * comission * carsquantity);

        System.out.println("The employeed " + name + " has a salary of: " + salary + " monthly");

        sc.close();
    }
}
