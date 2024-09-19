package Esercizi;

import java.util.Scanner;

public class EvenAndOddNumbersInASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeri nella sequenza: ");
        int arraySize = sc.nextInt();
        int numPari = 0;
        int numDispari = 0;
        int[] sequenza = new int[arraySize];
        System.out.println("Inserire " + arraySize + " numeri ");
        for(int i = 0; i<arraySize; i++) {
            sequenza[i] = sc.nextInt();
            if(sequenza[i]%2 == 0)
                numPari++;
            else numDispari++;
        }
        int[] pari = new int[numPari];
        int[] dispari = new int[numDispari];
        int indexP = 0;
        int indexD = 0;
        System.out.println("Sequenza:");
        for(int i = 0; i<arraySize; i++) {
            System.out.print("|" + sequenza[i] + "|");
            if(sequenza[i] % 2 == 0)
                pari[indexP++] = sequenza[i];
            else dispari[indexD++] = sequenza[i];
        }
        System.out.println("");
        System.out.println("Numeri pari nella sequenza:");
        for(int i = 0; i < numPari; i++)
            System.out.print("|" + pari[i] + "|");

        System.out.println("");
        System.out.println("Numeri dispari nella sequenza:");
        for(int i = 0; i < numDispari; i++)
            System.out.print("|" + dispari[i] + "|");
    }
}