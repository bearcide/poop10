package com.mycompany.poop10;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emilio
 */
public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){
        super("No se tiene saldo suficiente");
    }
}
