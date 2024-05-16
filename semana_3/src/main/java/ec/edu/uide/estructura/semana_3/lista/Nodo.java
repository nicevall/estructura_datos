/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.lista;

/**
 *
 * @author desarrollo
 */
public class Nodo<T> {

    T dato;
    Nodo siguiente;

    // Constructor
    Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
