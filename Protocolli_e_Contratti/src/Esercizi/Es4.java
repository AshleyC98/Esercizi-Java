package Esercizi;

import prog.io.*;
import prog.utili.Intero;

public class Es4 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        ConsoleOutputManager out = new ConsoleOutputManager();
        Intero a = new Intero(in.readInt("Primo addendo: "));
        Intero b = new Intero(in.readInt("Secondo addendo: "));
        Intero somma = new Intero(a.intValue()+b.intValue());
        System.out.println(a.intValue() + " + " + b.intValue() + " = " + somma.intValue());
        System.out.println(a + " + " + b + " = " + somma);
    }
}
