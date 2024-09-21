package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

//Scrivere un'applicaazione che legga due frazioni e le riscriva in ordine crescente
public class Es1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Frazione a = new Frazione(in.readInt("Numeratore prima frazione: "), in.readInt("Denominatore prima frazione: "));
        Frazione b = new Frazione(in.readInt("Numeratore seconda frazione: "), in.readInt("Denominatore seconda frazione: "));
        if(a.isMinore(b))
            System.out.println(a + " < " + b);
        else
            System.out.println(b + " < " + a);
    }
}
