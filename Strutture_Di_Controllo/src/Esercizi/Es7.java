package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, calcolare la media dei numeri
public class Es7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder output = new StringBuilder();
        double media = 0;
        int numeri = 0;
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        String input = sc.nextLine();
        while(!input.isEmpty()) {
            int num = Integer.parseInt(input);
            numeri++;
            if(output.isEmpty()) {
                output.append("(").append(num);
            }
            else
                output.append(" + ").append(num);
            media += num;
            input = sc.nextLine();
        }
        media /= numeri;
        output.append(")/").append(numeri).append(" = ").append(media);
        System.out.println(output);
    }
}
