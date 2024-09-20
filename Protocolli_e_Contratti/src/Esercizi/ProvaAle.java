package Esercizi;
//Dato un array di interi, scrivere un algoritmo che restituisca true se l'array contiene doppioni, altrimenti false.

import java.util.Arrays;

public class ProvaAle {
    public static void main(String[] args) {
        int[] arrayOfNumbers = {8746, 846, 6465, 645, 4575, 496, 9845, 985, 88, 74874, 45574, 48645};
        System.out.println(ProvaAle.hasDuplicated(arrayOfNumbers));
    }
    private static boolean hasDuplicated(int[] arrayOfNumbers) {
        Arrays.sort(arrayOfNumbers);
        for(int i = 1; i < arrayOfNumbers.length-1; i++) {
            if(arrayOfNumbers[i-1] == arrayOfNumbers[i] || arrayOfNumbers[i+1] == arrayOfNumbers[i])
                return true;
        }
        return false;
    }
}
