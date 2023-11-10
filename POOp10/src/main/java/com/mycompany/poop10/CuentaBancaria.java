package com.mycompany.poop10;


import com.mycompany.poop10.SaldoInsuficienteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author emilio
 */
public class CuentaBancaria {     
    private double saldo; 
    
    public CuentaBancaria(){
        saldo=0;
    }
    /**
     * Es un metodo para depositar dinero
     * @param monto la cantidad de dinero la cual se va a depositar
     */
    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    /**
     * Es un metodo para retirar dienro
     * @param monto La cantidad que se va a retirar
     * @throws SaldoInsuficienteException Una excepcion si no se tiene suficiente dinero en cuenta
     */
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
   
}
