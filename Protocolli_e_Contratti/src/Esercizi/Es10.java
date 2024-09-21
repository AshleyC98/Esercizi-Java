package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Importo;

//Scrivere un'applicazione che legga un prezzo in lire e visualizzi il prezzo corrispondente in euro
public class Es10 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int lire = in.readInt("Importo in lire: ");
        System.out.println("Importo in euro: " + Importo.fromLire(lire));
    }
}
