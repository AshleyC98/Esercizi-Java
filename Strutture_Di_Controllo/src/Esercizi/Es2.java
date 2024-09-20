package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, calcolare la somma di tutti i numeri
public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        StringBuilder input = new StringBuilder(sc.nextLine());
        StringBuilder output = new StringBuilder();
        int sum = 0;
        while(!input.isEmpty()) {
            int number = Integer.parseInt(String.valueOf(input));
            sum+=number;
            if(output.isEmpty()) {
                output.append(input);
            }
            else {
                output.append(" + ").append(input);
            }
            input = new StringBuilder(sc.nextLine());
        }
        output.append(" = ").append(sum);
        System.out.println(output);
    }
}
