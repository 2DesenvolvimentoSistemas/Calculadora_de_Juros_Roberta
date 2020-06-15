/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;
import model.design.CalcularJuros;

/**
 *
 * @author Roberta
 */
public class TesteCalculdora {
    public static void main(String[] args) {
        CalcularJuros cal = new CalcularJuros();
        System.out.println("\n\t\t\t CALCULADORA DE JUROS \n");
        System.out.printf("%.2f..........R$ \n", cal.calJuros(1000.0));
        
    }
}
