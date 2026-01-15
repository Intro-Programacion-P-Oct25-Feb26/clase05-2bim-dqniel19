/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author UTPL
 */
public class Reporte {
    public static void imprimir (String a, String b, String c, double[] notas, 
            double promedio) {
        String msj = "";
        for (int i = 0; i < notas.length; i++) {
            msj = String.format("%s%.1f\t", msj, notas[i]);
        }
        msj = String.format("Los datos ingresados son:\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Ciudad: %s\n"
                + "Notas: %s\n"
                + "Promedio: %.2f\n",
                a,
                b,
                c,
                msj, 
                promedio);
        
        System.out.printf(msj);
    
    }
}
