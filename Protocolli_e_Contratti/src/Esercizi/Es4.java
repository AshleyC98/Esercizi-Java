package Esercizi;
//Scrivere un'applicazione che lagga due interi e ne calcoli la somma, l'aapplicazione deve restituire la somma
//dovr'a scrivere l'operazione in cifre e in lettere
import prog.io.*;
import prog.utili.Intero;

public class Es4 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        Intero a = new Intero(in.readInt("Primo addendo: "));
        Intero b = new Intero(in.readInt("Secondo addendo: "));
        Intero somma = new Intero(a.intValue()+b.intValue());
        out.println(a.intValue() + " + " + b.intValue() + " = " + somma.intValue());
        out.println(a + " + " + b + " = " + somma);
    }
}
