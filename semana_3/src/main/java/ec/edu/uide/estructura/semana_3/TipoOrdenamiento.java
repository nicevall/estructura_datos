/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3;

/**
 *
 * @author desarrollo
 */
public class TipoOrdenamiento {
    
    /**
     * Método que ordena un arreglo usando el método de la burbuja.
     * @param arreglo El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public int[] ordenamientoBurbuja(int[] arreglo) {
        int[] arreglo_interno = arreglo;
        int n = arreglo_interno.length;
        int operaciones = 0; // Contador de operaciones
        int intercambios = 0; // Contador de intercambios

        // Recorre el arreglo varias veces
        for (int i = 0; i < n - 1; i++) {
            
            for (int j = 0; j < n - 1 - i; j++) {
                operaciones++; // Cuenta la operación de comparación
                if (arreglo_interno[j] > arreglo_interno[j + 1]) {
                    // Intercambia los elementos si están en el orden incorrecto
                    int temp = arreglo_interno[j];
                    arreglo_interno[j] = arreglo_interno[j + 1];
                    arreglo_interno[j + 1] = temp;
                    intercambios++; // Cuenta el intercambio
                }
            }
        }

        // Imprime el número de operaciones y de intercambios realizados
        System.out.println("Operaciones: " + operaciones);
        System.out.println("Intercambios: " + intercambios);

        return arreglo_interno;
    }
    
    /**
     * Método que ordena un arreglo usando el método de selección.
     * @param arreglo El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public int[] ordenamientoSeleccion(int[] arreglo_interno) {
        int [] arreglo = arreglo_interno;
        int n = arreglo.length;
        int operaciones = 0; // Contador de operaciones
        int intercambios = 0; // Contador de intercambios

        // Recorre el arreglo varias veces
        for (int i = 0; i < n - 1; i++) {
            // Encuentra el índice del elemento mínimo en el subarreglo no ordenado
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                operaciones++; // Cuenta la operación de comparación
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambia el elemento mínimo encontrado con el primer elemento no ordenado
            if (indiceMinimo != i) {
                int temp = arreglo[indiceMinimo];
                arreglo[indiceMinimo] = arreglo[i];
                arreglo[i] = temp;
                intercambios++; // Cuenta el intercambio
            }
        }

        // Imprime el número de operaciones y de intercambios realizados
        System.out.println("Operaciones: " + operaciones);
        System.out.println("Intercambios: " + intercambios);

        return arreglo;
    }
    
    
    /**
     * Método que ordena un arreglo usando el método de inserción.
     * @param arreglo El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public int[] ordenamientoInsercion(int[] arreglo) {
        int n = arreglo.length;
        int operaciones = 0; // Contador de operaciones
        int intercambios = 0; // Contador de intercambios

        // Recorre el arreglo desde el segundo elemento hasta el final
        for (int i = 1; i < n; i++) {
            int clave = arreglo[i];
            int j = i - 1;

            // Desplaza los elementos del arreglo que son mayores que la clave
            // a una posición adelante de su posición actual
            while (j >= 0 && arreglo[j] > clave) {
                operaciones++; // Cuenta la operación de comparación
                arreglo[j + 1] = arreglo[j];
                j--;
                intercambios++; // Cuenta el intercambio
            }
            operaciones++; // Cuenta la última comparación que falla
            arreglo[j + 1] = clave;
        }

        // Imprime el número de operaciones y de intercambios realizados
        System.out.println("Operaciones: " + operaciones);
        System.out.println("Intercambios: " + intercambios);

        return arreglo;
    }
    
    
    /**
     * Método que ordena un arreglo usando el método de Shell.
     * @param arreglo El arreglo a ordenar.
     * @return El arreglo ordenado.
     */
    public int[] ordenamientoShell(int[] arreglo) {
        int n = arreglo.length;
        int operaciones = 0; // Contador de operaciones
        int intercambios = 0; // Contador de intercambios

        // Calcula el intervalo inicial
        for (int intervalo = n / 2; intervalo > 0; intervalo /= 2) {
            for (int i = intervalo; i < n; i++) {
                int temp = arreglo[i];
                int j;
                for (j = i; j >= intervalo && arreglo[j - intervalo] > temp; j -= intervalo) {
                    operaciones++; // Cuenta la operación de comparación
                    arreglo[j] = arreglo[j - intervalo];
                    intercambios++; // Cuenta el intercambio
                }
                arreglo[j] = temp;
                operaciones++; // Cuenta la operación de asignación
            }
        }

        // Imprime el número de operaciones y de intercambios realizados
        System.out.println("Operaciones: " + operaciones);
        System.out.println("Intercambios: " + intercambios);

        return arreglo;
    }
    
    /**
     * Método que imprime un arreglo.
     * @param arreglo El arreglo a imprimir.
     */
    public void imprimirArreglo(int[] arreglo) {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
