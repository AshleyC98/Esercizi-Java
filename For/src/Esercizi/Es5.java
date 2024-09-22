package Esercizi;
/*Scrivere un'applicazione che legga due interi a e b e stampi tutti i numeri compreso tra a e b per cui la lunghezza
della stringa di caratteri che esprime il numero è pari alla metà del numero stesso*/
import prog.io.ConsoleInputManager;
import prog.utili.Intero;

public class Es5 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int a = (in.readInt("Estremo inferiore: "));
        int b = (in.readInt("Estremo superiore: "));
        for(int i = a; i < b; i++) {
            Intero numeri = new Intero(i);
            if(numeri.toString().length() == (numeri.intValue())/2)
                System.out.println(i);
        }
    }
}
