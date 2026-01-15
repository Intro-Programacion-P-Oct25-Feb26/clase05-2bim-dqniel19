/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete02.DatoPersonal;
import paquete03.DatosUbicacion;
import paquete04.DatoAcademico;
import paquete05.DatoFinal;
import paquete06.*;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        String nombre;
        String ciudad;
        String apellidoRetornado;
        
        double[] misNotas;
        double promedio;
        
        nombre = DatoPersonal.obtenerNombre();
        apellidoRetornado = DatoPersonal.obtenerApellido();
        ciudad = DatosUbicacion.obtenerCiudad();
        misNotas = DatoAcademico.obtenerNotas(4);
        promedio = DatoFinal.obtenerPromedio(misNotas);
        Reporte.imprimir(nombre, apellidoRetornado, ciudad, misNotas, promedio);
        
    }
}

// Crear una solución donde existan funciones que pidan por teclado y devuelva cada uno
// de los siguientes datos: nombre, apellido, ciudad, notas y promedio de notas, para el 
// promedio, se necesitan primero que la funcion para almacenar las 4 notas devuelva un 
// arreglo unidimensional y con ello calcularlo. Todas las funciones deben ser llamadas 
// desde el metodo main en la clase Principal y para finalizar, deben ser impresas en un reporte.