/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.seman_3.colas;

/**
 *
 * @author desarrollo
 */
public class Ejecutar {
     public static void main(String[] args) {
        // Crear una cola de enteros
        ColaTDA<Integer> colaEnteros = new ColaArray<>();
        
        // Encolar elementos en la cola
        colaEnteros.encolar(10);
        colaEnteros.encolar(20);
        colaEnteros.encolar(30);

        // Mostrar el elemento en el frente
        System.out.println("Frente de la cola: " + colaEnteros.frente()); // Debe imprimir 10

        // Desencolar elementos de la cola
        System.out.println("Elemento desencolado: " + colaEnteros.desencolar()); // Debe imprimir 10
        System.out.println("Frente de la cola después de desencolar: " + colaEnteros.frente()); // Debe imprimir 20

        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + colaEnteros.estaVacia()); // Debe imprimir false

        // Obtener el tamaño de la cola
        System.out.println("Tamaño de la cola: " + colaEnteros.tamano()); // Debe imprimir 2
    }
}
