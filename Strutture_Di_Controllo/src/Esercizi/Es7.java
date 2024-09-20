package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, calcolare la media dei numeri
public class Es7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String output = "";
        double media = 0;
        int numeri = 0;
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        String input = sc.nextLine();
        while(!input.isEmpty()) {
            int num = Integer.parseInt(input);
            numeri++;
            if(output.isEmpty()) {
                output += "(" + num;
            }
            else
                output += " + " + num;
            media += num;
            input = sc.nextLine();
        }
        media /= numeri;
        output += ")/" + numeri + " = " + media;
        System.out.println(output);
    }
}
