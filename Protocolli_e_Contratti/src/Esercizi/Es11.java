package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Importo;
import prog.utili.Intero;

//Modificare Es10 in modo tale che il prezzo sia visualizzato anche in lettere nel formato utilizzato per gli assegni
public class Es11 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int lire = in.readInt("Importo in lire: ");
        System.out.println("Importo in euro: " + Importo.fromLire(lire));
        System.out.println("Importo per assegni: " + new Intero(Importo.fromLire(lire).getEuro()) + "/" + Importo.fromLire(lire).getCent());
    }
}
