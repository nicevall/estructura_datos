/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.lista;

/**
 *
 * @author desarrollo
 */
// Definición de la interfaz genérica ListaTDA
public interface ListaTDA<T> {
    void insertar(int indice, T elemento); // Método para insertar un elemento en una posición específica
    T eliminar(int indice);                // Método para eliminar y devolver un elemento en una posición específica
    T obtener(int indice);                 // Método para obtener un elemento en una posición específica
    boolean estaVacia();                   // Método para comprobar si la lista está vacía
    int tamano();                          // Método para obtener el tamaño de la lista
}
