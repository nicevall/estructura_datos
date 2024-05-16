/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.colas;

/**
 *
 * @author desarrollo
 */
// Definición de la interfaz genérica ColaTDA
public interface ColaTDA<T> {

    void encolar(T elemento);  // Método para agregar un elemento a la cola

    T desencolar();            // Método para quitar y devolver el elemento del frente de la cola

    T frente();                // Método para devolver el elemento del frente sin quitarlo

    boolean estaVacia();       // Método para comprobar si la cola está vacía

    int tamano();              // Método para obtener el tamaño de la cola
}
