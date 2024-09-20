package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Intero;

//Scrivere un'applicazione che lagga una Frazione e la riscriva in lettere, con denominatore in maiuscolo
public class Es6 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int num = in.readInt("Numeratore: "), den = in.readInt("Denominatore: ");
        Frazione f = new Frazione(num, den);
        Intero numString = new Intero(num);
        Intero denString = new Intero(den);
        System.out.println("Frazione: " + numString + "/" + denString.toString().toUpperCase());
    }
}
