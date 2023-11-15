/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Mavenproject1 {

    public static void main(String[] args) {
       System.out.println("Ingrese una opción");
        System.out.println("1, 10, 7, 11");
        Scanner in = new Scanner(System.in);
        String userResult = in.next();
        switch(userResult){
            case "1":
                System.out.println("Type an integer  number");
                String userNumber = in.next();
                int userNumberInt = Integer.parseInt(userNumber);
                int nextResult= Operations.NextNumber(userNumberInt);
                System.out.println(nextResult);
                break;
            case "10":
                System.out.println("Type an integer  number");
                String firstDivisibleNumber = in.next();
                System.out.println("Type a second  number");
                String secondDivisibleNumber = in.next();
                boolean result = Operations.IsDivisible(Integer.parseInt(firstDivisibleNumber ),Integer.parseInt(secondDivisibleNumber));
                if (result) {
                    System.out.println(secondDivisibleNumber + "is divisible into" + firstDivisibleNumber);
                }else{
                    System.out.println(secondDivisibleNumber + "is not divisible into" + firstDivisibleNumber);
                }
                break;
            case "7":
                System.out.println("Ingrese la longitud en centímetros:");
                int cm = in.nextInt();
        double yards = Operations.ConvertirCentimetrosAYardas(cm);
        double meters = Operations.ConvertirCentimetrosAMetros(cm);
        double feet = Operations.ConvertirCentimetrosAPies(cm);
        double inches = Operations.ConvertirCentimetrosAPulgadas(cm);

        System.out.println(cm + " centímetros es igual a:");
        System.out.println(yards + " yardas");
        System.out.println(meters + " metros");
        System.out.println(feet + " pies");
        System.out.println(inches + " pulgadas");
                break;
            case "11":
                 System.out.println("Ingrese el total de hombres:");
    int totalHombres = in.nextInt();
    System.out.println("Ingrese el total de mujeres:");
    int totalMujeres = in.nextInt();
    
    double porcentajeHombres = Operations.CalcularPorcentajeHombres(totalHombres, totalMujeres);
    double porcentajeMujeres = Operations.CalcularPorcentajeMujeres(totalHombres, totalMujeres);

    System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
    System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");         
                break;
            case "12":
                System.out.println("Commit in a new branch");
                break;
            default:
                throw new AssertionError();
        }
    }
}
