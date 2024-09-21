package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Importo;

//Scrivere un'applicazione che legga due importi e ne visualizzi la somma, media e la differenza tra maggiore e minore
public class Es4 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Importo a = new Importo(in.readInt("Euri: "), in.readInt("Cent: "));
        Importo b = new Importo(in.readInt("Euri: "), in.readInt("Cent: "));
        System.out.println(a + " + " + b + " = " + a.piu(b));
        System.out.println("Media: " + Importo.fromLire((a.toLire() + b.toLire())/2));
        if(a.isMaggiore(b))
            System.out.println(a + " - " + b + " = " + a.meno(b));
        else
            System.out.println(b + " - " + a + " = " + b.meno(a));
    }
}
