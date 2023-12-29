package calculadora;

import vista.Interfaz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculadora {
    
    
    public static void main(String[] args) {
        Interfaz form = new Interfaz();
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        
    }
    
    public double sumar(double valorActual, double nuevoNum){
        return valorActual + nuevoNum;
    }
    
    public double restar(double valorActual, double nuevoNum){
        return valorActual - nuevoNum;
    }
    
    public double multiplicar(double valorActual, double nuevoNum){
        return valorActual * nuevoNum;
    }
    
    public double dividir(double valorActual, double nuevoNum){
        Interfaz form = new Interfaz();
        double resultado = 0;
        try{
            if(nuevoNum == 0){
                throw new ArithmeticException("Oops; no se puede dividir por cero.");
            }else{
                resultado = valorActual / nuevoNum;
            } 
        }catch (ArithmeticException e) {
            form.mostrarAdvertencia(form, "Oops; no se puede dividir por cero.");
        }finally{
            return resultado;
        }
    }
    
}
