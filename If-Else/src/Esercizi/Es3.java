package Esercizi;
/*La lunghezza dela stringa che esprime il numero 12 è 6, pari cioè alla metà del numero stesso.
* Altri numeri come 25 e 6 hanno questa proprietà.
* Scrivere un'applicazione che dato un intero verifichi questa proprietà*/
import prog.io.ConsoleInputManager;
import prog.utili.Intero;

public class Es3 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int i = in.readInt("Numero: ");
        Intero intero = new Intero(i);
        if(intero.toString().length() == i/2)
            System.out.println("La lunghezza della parola " + intero + " e' " + intero.toString().length() + ", uguale alla meta' di " + i);
        else
            System.out.println("La lunghezza della parola " + intero + " e' " + intero.toString().length() + ", mentre la meta' di " + i + " e' " + i/2);
    }
}
