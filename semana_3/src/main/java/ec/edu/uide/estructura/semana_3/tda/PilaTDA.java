/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.tda;

/**
 *
 * @author desarrollo
 * Primitivo, compuesto o definido por el usuario
 */
// Interfaz para la Pila (Stack)
public interface PilaTDA<T> {

    void apilar(T elemento); // Método para agregar un elemento a la pila

    T desapilar();           // Método para quitar y devolver el elemento superior de la pila

    T cima();                // Método para devolver el elemento superior sin quitarlo

    boolean estaVacia();     // Método para comprobar si la pila está vacía

    int tamano();            // Método para obtener el tamaño de la pila
}
