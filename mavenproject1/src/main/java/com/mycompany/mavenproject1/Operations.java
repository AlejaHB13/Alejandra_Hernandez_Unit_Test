/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Ingenieria
 */
public class Operations {
    
    public static int NextNumber(int userNumber){
        return userNumber+1;
    }
    
    public static boolean IsDivisible (int firstNumber, int secondNumber){
       int moduleResult = secondNumber% firstNumber;
       return moduleResult==0;
    }

    public static double ConvertirCentimetrosAYardas(int cm) {
        double inches = cm / 2.54;
        double feet = inches / 12;
        double yards = feet / 3;
        return yards;
    }

    public static double ConvertirCentimetrosAMetros(int cm) {
        return cm / 100;
    }

    public static double ConvertirCentimetrosAPies(int cm) {
        double inches = cm / 2.54;
        double feet = inches / 12;
        return feet;
    }

    public static double ConvertirCentimetrosAPulgadas(int cm) {
        return cm / 2.54;
    }
    
    public static double CalcularPorcentajeHombres(int totalHombres, int totalMujeres) {
        double porcentajeHombres = (double) totalHombres / (totalHombres + totalMujeres) * 100;
        return porcentajeHombres;
    }
    
     public static double CalcularPorcentajeMujeres(int totalHombres, int totalMujeres) {
        double porcentajeMujeres = (double) totalMujeres / (totalHombres + totalMujeres) * 100;
        return porcentajeMujeres;
    }
    
}
