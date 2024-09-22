package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

/*Scrivere un'applicazione che letta una sequenza di frazioni, stampi la minore e la maggiore*/
public class Es6 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Frazione f = new Frazione(in.readInt("Numeratore: "), in.readInt("Denominatore: "));
        String continuare = "S";
        Frazione minima = f, massima = f;
        while(continuare.equals("S") || continuare.equals("s")) {
            f = new Frazione(in.readInt("Numeratore: "), in.readInt("Denominatore: "));
            if(f.isMinore(minima)) minima = f;
            if(f.isMaggiore(massima)) massima = f;
            continuare = in.readLine("Continuare? S/N ");
        }
        System.out.println("Frazione minima: " + minima);
        System.out.println("Frazione massima: " + massima);
    }
}
