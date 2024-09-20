package Esercizi;

import java.util.Scanner;
//Dato in input due numeri dall'utente, calcolare il massimo comun divisore
public class Es4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = sc.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = sc.nextInt();
        int resto;
        do {
            resto = num1 % num2;
            if (resto != 0) {
                num1 = num2;
                num2 = resto;
            }
        } while (resto != 0);
        System.out.println("MCD: " + num2);
    }
}
