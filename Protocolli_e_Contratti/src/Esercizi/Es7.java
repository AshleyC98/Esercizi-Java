package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Frazione;
import prog.utili.Intero;

//Scrivere un'applicazione che lagga due Frazioni, ne calcoli una nuova il cui il valore sia la media di quelle lette
//comunicando il risultato prima in cifre poi in lettere
public class Es7 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int num1 = in.readInt("Numeratore prima frazione: "), den1 = in.readInt("Denominatore prima frazione: ");
        Frazione a = new Frazione(num1, den1);
        int num2 = in.readInt("Numeratore seconda frazione: "), den2 = in.readInt("Denominatore seconda frazione: ");
        Frazione b = new Frazione(num2, den2);
        Frazione media = (a.diviso(b)).diviso(new Frazione(2));
        System.out.println(media);
        Intero num = new Intero(media.getNumeratore());
        Intero den = new Intero(media.getDenominatore());
        System.out.println(num + "/" + den);
    }
}
