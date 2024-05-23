/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.uide.estructura.semana_3.lista;

/**
 *
 * @author desarrollo
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] data = {10, 23, 31, 44, 54, 62, 71, 84, 95};
        int searchKey = 54;
        boolean found = linearSearch(data, searchKey);
        if (found) {
            System.out.println(searchKey + " was found in the array.");
        } else {
            System.out.println(searchKey + " was not found in the array.");
        }
    }

    public static boolean linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return true;
            }
        }
        return false;
    }
}
