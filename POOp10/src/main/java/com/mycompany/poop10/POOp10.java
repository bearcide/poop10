/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop10;

/**
 *
 * @author emilio
 */
public class POOp10 {

    public static void main(String[] args) throws SaldoInsuficienteException {
        System.out.println("Hola Mundo");       
        try {
        String mensajes[] = {"Primero","Segundo","Tercero"}; 
        for (int i = 0; i<=3; i++) {
                System.out.println(mensajes[i]);
        }
        
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Error:  apuntador fuera del rango del arreglo.");
            
        }
        System.out.println("Hola Mundo 2");
        
        try {
            double x; 
            x= 1000/0; 
            System.out.println(x); 
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error: división entre cero. ");
        }
        
        try {
            double x; 
            x= 1000/0;
            System.out.println(x); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            System.out.println("Error: división entre cero. ");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error: división entre cero. ");
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
        
        try {
            double x; 
            x= 0/0; 
            System.out.println(x); 
        
        } catch (ArithmeticException e){
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Hola Mundo 3");
        
        try {
        double division = division(4f,6.0); 
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
   }

    private static double division(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operación no soportada. "); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
