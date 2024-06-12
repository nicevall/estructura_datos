/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.richardarmijos;

/**
 *
 * @author desarrollo
 */
public class BusquedaBinariaRecursiva {
    
    // Búsqueda Binaria Recursiva
    public static int binarySearch(int[] arr, int left, int right, int x) {
        if (right >= left) {
            int mid = left + (right - left) / 2;

            // Si el elemento está presente en el medio
            if (arr[mid] == x) {
                return mid;
            }

            // Si el elemento es más pequeño que el del medio, sólo puede estar en la mitad izquierda
            if (arr[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }

            // De lo contrario, el elemento sólo puede estar en la mitad derecha
            return binarySearch(arr, mid + 1, right, x);
        }

        // El elemento no está presente en el arreglo
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int x = 10;

        // Llamada a la búsqueda binaria recursiva
        int result = binarySearch(arr, 0, arr.length - 1, x);
        if (result == -1) {
            System.out.println("Elemento no encontrado en el arreglo");
        } else {
            System.out.println("Elemento encontrado en el índice " + result);
        }
    }
    
}
