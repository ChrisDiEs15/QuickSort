/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quicksort;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Programa que sirve para ordenar a traves del metodo de Quick Sort");
        System.out.println("Ingrese el numero de elementos a ordenar");
        int numEl = sc.nextInt();
        /* creates a temporary array to store the return value of NewArray */
        int[] tmpArray = new int[numEl];
        /* Call to create an array */
        tmpArray = NewArray(numEl);
        /* print unordered array */
        System.out.println("El arreglo que ha ingresado es:");
        PrintArray(numEl, tmpArray);
        /* pass the tmpArray to the order function and overwrite tmp with quick sorted */
        QuickSort(tmpArray, 0, numEl - 1);
        System.out.println("El arreglo ordenado es:");
        PrintArray(numEl, tmpArray);
    }
     /* Quick sort algorithm */
    public static void QuickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            QuickSort(array, low, pi - 1);
            QuickSort(array, pi + 1, high);
        }
    }

    /* Helper method to partition the array */
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Swap array[i+1] and array[high] (pivot element)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    /* creates and fills the array */
    public static int[] NewArray(int numEl) {
        int[] newArray = new int[numEl];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numEl; i++) {
            System.out.println("Ingrese el dato en la posicion " + i);
            int nwEl = sc.nextInt();
            newArray[i] = nwEl;
        }
        return newArray;
    }

    /* PrintArray */
    public static void PrintArray(int numEl, int[] arrayToPrint) {
        for (int i = 0; i < numEl; i++) {
            System.out.print(arrayToPrint[i] + " ");
        }
        System.out.println();
    }
    
}
