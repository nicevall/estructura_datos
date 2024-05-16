/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.lista;

/**
 *
 * @author desarrollo
 */
public class Ejecutar {
    public static void main(String[] args) {
        // Crear una lista de enteros
        ListaTDA<Integer> listaEnteros = new ListaEnlazada<>();

        // Insertar elementos en la lista
        listaEnteros.insertar(0, 10);
        listaEnteros.insertar(1, 20);
        listaEnteros.insertar(2, 30);
        listaEnteros.insertar(1, 15); // Insertar 15 en la posición 1
        listaEnteros.insertar(3, 15); // Insertar 15 en la posición 1

        System.out.println("--------- ");
        // Mostrar elementos de la lista
        for (int i = 0; i < listaEnteros.tamano(); i++) {
            System.out.print("\t" + i + ": " + listaEnteros.obtener(i));
        }

        // Eliminar un elemento de la lista
        System.out.println("\nElemento eliminado en la posición 2: " + listaEnteros.eliminar(2));

        
        System.out.println("--------- ");
        // Mostrar elementos de la lista después de la eliminación
        for (int i = 0; i < listaEnteros.tamano(); i++) {
            System.out.print("\t" + i + ": " + listaEnteros.obtener(i));
        }

        // Verificar si la lista está vacía
        System.out.println("\n¿La lista está vacía? " + listaEnteros.estaVacia());

        // Obtener el tamaño de la lista
        System.out.println("Tamaño de la lista: " + listaEnteros.tamano());
    }
}
