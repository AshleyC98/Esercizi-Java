package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, distinguere i pari dai dispari
public class Es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        StringBuilder pari = new StringBuilder(), dispari = new StringBuilder();
        String input = sc.nextLine();
        while (!input.isEmpty()) {
                int number = Integer.parseInt(input);
                if (number % 2 == 0) {
                    if (pari.isEmpty()) {
                        pari.append(number);
                    } else {
                        pari.append(" ").append(number);
                    }
                } else {
                    if (dispari.isEmpty()) {
                        dispari.append(number);
                    } else {
                        dispari.append(" ").append(number);
                    }
                }
            input = sc.nextLine();
        }

        System.out.println("Numeri pari: " + pari);
        System.out.println("Numeri dispari: " + dispari);
    }
}
