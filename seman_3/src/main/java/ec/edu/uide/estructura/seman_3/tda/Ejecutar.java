/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.seman_3.tda;

/**
 *
 * @author desarrollo
 */
public class Ejecutar {
    public static void main(String[] args) {
        // Crear una pila de enteros
        PilaTDA<Integer> pilaEnteros = new PilaArray<>();
        
        // Apilar elementos en la pila
        pilaEnteros.apilar(10);
        pilaEnteros.apilar(20);
        pilaEnteros.apilar(30);

        // Mostrar el elemento en la cima
        System.out.println("Cima de la pila: " + pilaEnteros.cima()); // Debe imprimir 30

        // Desapilar elementos de la pila
        System.out.println("Elemento desapilado: " + pilaEnteros.desapilar()); // Debe imprimir 30
        System.out.println("Cima de la pila después de desapilar: " + pilaEnteros.cima()); // Debe imprimir 20

        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pilaEnteros.estaVacia()); // Debe imprimir false

        // Obtener el tamaño de la pila
        System.out.println("Tamaño de la pila: " + pilaEnteros.tamano()); // Debe imprimir 2
    }
}
