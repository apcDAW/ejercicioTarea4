/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {

    public static void main(String[] args) {
        
        CCuenta cuenta1;
        double saldoActual;
        final String propietarioCuenta = "Juan Gutiérrez";

        cuenta1 = new CCuenta(propietarioCuenta,"1300-2665-85-4433221144",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        System.out.println("El propietario es"+ propietarioCuenta );
        opera(cuenta1, 2300, 695);
    }

    private static void opera(CCuenta cuenta1, int cantRetirar, int cantIngresar) {
        try {
            cuenta1.retirar(cantRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
