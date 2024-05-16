/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.tda;

import java.util.EmptyStackException;

/**
 *
 * @author desarrollo
 */
// Implementación de PilaTDA usando un array
public class PilaArray<T> implements PilaTDA<T> {
    private T[] pila;          // Array para almacenar los elementos de la pila
    private int cima;          // Índice que representa la cima de la pila
    private static final int CAPACIDAD_POR_DEFECTO = 10; // Capacidad inicial del array

    // Constructor
    @SuppressWarnings("unchecked")
    public PilaArray() {
        pila = (T[]) new Object[CAPACIDAD_POR_DEFECTO]; // Inicialización del array genérico
        cima = 0; // Inicialización del índice de la cima
    }

    @Override
    public void apilar(T elemento) {
        if (cima == pila.length) {
            expandirCapacidad(); // Expande la capacidad si el array está lleno
        }
        pila[cima++] = elemento; // Agrega el elemento en la cima y luego incrementa el índice
    }

    @Override
    public T desapilar() {
        if (estaVacia()) {
            throw new EmptyStackException(); // Lanza una excepción si la pila está vacía
        }
        T resultado = pila[--cima]; // Decrementa el índice y obtiene el elemento de la cima
        pila[cima] = null;          // Elimina la referencia al elemento para evitar fugas de memoria
        return resultado;
    }

    @Override
    public T cima() {
        if (estaVacia()) {
            throw new EmptyStackException(); // Lanza una excepción si la pila está vacía
        }
        return pila[cima - 1]; // Devuelve el elemento en la cima sin eliminarlo
    }

    @Override
    public boolean estaVacia() {
        return cima == 0; // Devuelve true si la pila está vacía
    }

    @Override
    public int tamano() {
        return cima; // Devuelve el número de elementos en la pila
    }

    @SuppressWarnings("unchecked")
    private void expandirCapacidad() {
        T[] mayor = (T[]) new Object[pila.length * 2]; // Crea un array con el doble de capacidad
        System.arraycopy(pila, 0, mayor, 0, pila.length); // Copia los elementos en el nuevo array
        pila = mayor; // Reemplaza el array original por el nuevo array
    }
}