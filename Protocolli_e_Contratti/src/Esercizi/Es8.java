package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Importo;

//Scrivere un'applicazione che legga due prezzi espressi in euro e comunichi la loro somma in euto e in lire
public class Es8 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Importo euro = new Importo(in.readInt("Selezionare euri: "), in.readInt("Selezionare centesimi: "));
        System.out.println("Importo: " + euro);
        System.out.println("Importo in lire: " + euro.toLire());
    }
}
