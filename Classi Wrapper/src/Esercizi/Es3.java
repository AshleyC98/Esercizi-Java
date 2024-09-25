package Esercizi;
/*Sommare una sequenza di numeri separati da uno spazio, tramite StringTokenizer*/

import java.util.Scanner;
import java.util.StringTokenizer;

public class Es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sequenza = new StringBuilder();
        System.out.println("Inserire una sequenza di numeri:");
        String num = sc.nextLine();
        while(!num.isEmpty()) {
            if(sequenza.isEmpty()) sequenza.append(num);
            else sequenza.append(" ").append(num);
            num = sc.nextLine();
        }
        StringTokenizer st = new StringTokenizer(sequenza.toString(), " ");
        int somma = 0;
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            somma += Integer.parseInt(token);
        }
        System.out.println(sequenza);
        System.out.println("Somma: " + somma);
    }
}
