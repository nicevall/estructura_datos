/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.lista;

/**
 *
 * @author desarrollo
 */
// Implementación de ListaTDA usando una lista enlazada simple
public class ListaEnlazada<T> implements ListaTDA<T> {
   

    private Nodo cabeza; // Referencia al primer nodo de la lista
    private int tamano;  // Tamaño de la lista

    // Constructor
    public ListaEnlazada() {
        cabeza = null;
        tamano = 0;
    }

    @Override
    public void insertar(int indice, T elemento) {
        if (indice < 0 || indice > tamano) {
            throw new IndexOutOfBoundsException(); // Lanza una excepción si el índice está fuera de los límites
        }
        Nodo nuevoNodo = new Nodo(elemento); // Crea un nuevo nodo con el elemento
        if (indice == 0) {
            nuevoNodo.siguiente = cabeza; // Inserta al principio
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            for (int i = 0; i < indice - 1; i++) {
                actual = actual.siguiente;
            }
            nuevoNodo.siguiente = actual.siguiente; // Inserta en la posición específica
            actual.siguiente = nuevoNodo;
        }
        tamano++;
    }

    @Override
    public T eliminar(int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException(); // Lanza una excepción si el índice está fuera de los límites
        }
        Nodo actual = cabeza;
        if (indice == 0) {
            cabeza = cabeza.siguiente; // Elimina el primer nodo
        } else {
            Nodo anterior = null;
            for (int i = 0; i < indice; i++) {
                anterior = actual;
                actual = actual.siguiente;
            }
            anterior.siguiente = actual.siguiente; // Elimina el nodo en la posición específica
        }
        tamano--;
        return (T) actual.dato; // Devuelve el dato del nodo eliminado
    }

    @Override
    public T obtener(int indice) {
        if (indice < 0 || indice >= tamano) {
            throw new IndexOutOfBoundsException(); // Lanza una excepción si el índice está fuera de los límites
        }
        Nodo actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return (T) actual.dato; // Devuelve el dato del nodo en la posición específica
    }

    @Override
    public boolean estaVacia() {
        return tamano == 0; // Devuelve true si la lista está vacía
    }

    @Override
    public int tamano() {
        return tamano; // Devuelve el número de elementos en la lista
    }
}

