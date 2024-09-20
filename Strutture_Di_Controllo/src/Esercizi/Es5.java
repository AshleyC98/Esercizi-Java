package Esercizi;

import java.util.Scanner;
//Dato in input due numeri dall'utente, calcolare la somma dei numeri pari e la somma dei numeri dispari
public class Es5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        int sommaP = 0, sommaD = 0;
        StringBuilder numP = new StringBuilder(), numD = new StringBuilder();
        String input = sc.nextLine();
        while(!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if(number % 2 == 0) {
                if(numP.isEmpty()) {
                    numP.append(input);
                } else {
                    numP.append(" + ").append(input);
                }
                sommaP += number;
            }
            else {
                if (numD.isEmpty()) {
                    numD.append(input);
                } else {
                    numD.append(" + ").append(input);
                }
                sommaD += number;
            }
            input = sc.nextLine();
        }
        numP.append(" = ").append(sommaP);
        numD.append(" = ").append(sommaD);
        System.out.println(numP);
        System.out.println(numD);
    }
}
