package Esercizi;

import prog.utili.Frazione;
import java.util.Scanner;
//Come Es3 ma con frazioni

public class Es4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Frazione somma = null;
        while (true) {
            System.out.print("Numeratore: ");
            String num = sc.nextLine();
            System.out.print("Denominatore: ");
            String den = sc.nextLine();
            Frazione f = new Frazione(Integer.parseInt(num), Integer.parseInt(den));
            if (sb.isEmpty()) sb.append(f);
            else sb.append(" ").append(f);
            if (somma == null) somma = f;
            else somma = somma.piu(f);
            System.out.print("Continuare? (S/N): ");
            String continuare = sc.nextLine();
            if (continuare.equalsIgnoreCase("N")) break;
        }
        System.out.println("Sequenza di frazioni: " + sb);
        System.out.println("Somma delle frazioni: " + somma);
    }
}
