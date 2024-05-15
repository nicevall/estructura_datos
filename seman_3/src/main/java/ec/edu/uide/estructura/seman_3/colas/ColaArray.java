/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.seman_3.colas;

import java.util.NoSuchElementException;

/**
 *
 * @author desarrollo
 */
// Implementación de ColaTDA usando un array
public class ColaArray<T> implements ColaTDA<T> {
    private T[] cola;            // Array para almacenar los elementos de la cola
    private int frente;          // Índice que representa el frente de la cola
    private int fin;             // Índice que representa el final de la cola
    private int tamano;          // Tamaño actual de la cola
    private static final int CAPACIDAD_POR_DEFECTO = 10; // Capacidad inicial del array

    // Constructor
    @SuppressWarnings("unchecked")
    public ColaArray() {
        cola = (T[]) new Object[CAPACIDAD_POR_DEFECTO]; // Inicialización del array genérico
        frente = 0; // Inicialización del índice del frente
        fin = -1;   // Inicialización del índice del final
        tamano = 0; // Inicialización del tamaño
    }

    @Override
    public void encolar(T elemento) {
        if (tamano == cola.length) {
            expandirCapacidad(); // Expande la capacidad si el array está lleno
        }
        fin = (fin + 1) % cola.length; // Mueve el índice de fin en un array circular
        cola[fin] = elemento; // Agrega el elemento al final de la cola
        tamano++;
    }

    @Override
    public T desencolar() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        T resultado = cola[frente]; // Obtiene el elemento del frente de la cola
        cola[frente] = null; // Elimina la referencia al elemento para evitar fugas de memoria
        frente = (frente + 1) % cola.length; // Mueve el índice de frente en un array circular
        tamano--;
        return resultado;
    }

    @Override
    public T frente() {
        if (estaVacia()) {
            throw new NoSuchElementException("La cola está vacía");
        }
        return cola[frente]; // Devuelve el elemento en el frente de la cola sin eliminarlo
    }

    @Override
    public boolean estaVacia() {
        return tamano == 0; // Devuelve true si la cola está vacía
    }

    @Override
    public int tamano() {
        return tamano; // Devuelve el número de elementos en la cola
    }

    @SuppressWarnings("unchecked")
    private void expandirCapacidad() {
        T[] mayor = (T[]) new Object[cola.length * 2]; // Crea un array con el doble de capacidad
        for (int i = 0; i < tamano; i++) {
            mayor[i] = cola[(frente + i) % cola.length]; // Copia los elementos en el nuevo array
        }
        cola = mayor; // Reemplaza el array original por el nuevo array
        frente = 0; // Restablece el frente
        fin = tamano - 1; // Actualiza el índice de fin
    }
}
