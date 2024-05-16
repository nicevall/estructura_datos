/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ec.edu.uide.estructura.semana_3;

import java.util.Random;

/**
 *
 * @author desarrollo
 */
public class Seman_3 {
    
    /**
     * Método que genera un arreglo aleatorio de una cantidad específica de elementos.
     * @param tamaño El número de elementos del arreglo.
     * @return El arreglo aleatorio generado.
     */
    public int[] generarArregloAleatorio(int tamaño) {
        Random random = new Random();
        int[] arreglo = new int[tamaño];
        // Llena el arreglo con números aleatorios
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = random.nextInt(10000);
        }
        return arreglo;
    }

    public static void main(String[] args) {
        Seman_3 sem3= new Seman_3();
        
        TipoOrdenamiento io = new TipoOrdenamiento();
        
        int cantidadElementos = 100;
        
        // 1. ordenamiento Burbuja
        long tiempoInicio = System.nanoTime();
        io.ordenamientoBurbuja(sem3.generarArregloAleatorio(cantidadElementos));
        long tiempoFin = System.nanoTime();
        long tiempoTotal = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo de ordenamiento Burbuja: " + tiempoTotal / 1_000_000 + " ms\n");
             
        // 2. ordenamiento Seleccion
        tiempoInicio = System.nanoTime();
        io.ordenamientoSeleccion(sem3.generarArregloAleatorio(cantidadElementos));
        tiempoFin = System.nanoTime();
        tiempoTotal = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo de ordenamiento Seleccion: " + tiempoTotal / 1_000_000 + " ms\n");
        
        // 3. ordenamiento Insercion
        tiempoInicio = System.nanoTime();
        io.ordenamientoInsercion(sem3.generarArregloAleatorio(cantidadElementos));
        tiempoFin = System.nanoTime();
        tiempoTotal = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo de ordenamiento Insercion: " + tiempoTotal / 1_000_000 + " ms\n");
        
        // 4. ordenamiento Shell
        tiempoInicio = System.nanoTime();
        io.ordenamientoShell(sem3.generarArregloAleatorio(cantidadElementos));
        tiempoFin = System.nanoTime();
        tiempoTotal = tiempoFin - tiempoInicio;
        
        System.out.println("Tiempo de ordenamiento Shell: " + tiempoTotal / 1_000_000 + " ms\n");
        
    }
    
    
    
}
