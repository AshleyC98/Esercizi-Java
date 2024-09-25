package Esercizi;

import prog.io.ConsoleInputManager;
/*Dati due char c,d, esprimere se contengono lo stesso carattere, se nella codifica Unicode c precede d
e se c precede immediatamente d */
public class Es1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        char c = in.readChar("Primo char: ");
        char d = in.readChar("Secondo char: ");
        if(c == d) System.out.println("I due char contengono lo stesso carattere: " + c);
        else System.out.println("I due char non contengono lo stesso carattere: " + c + ", " + d);
        if(c < d) {
            System.out.println(c + " precede " + d);
            if(c+1 == d) System.out.println(c + " precede immediatamente " + d);

        }
        else if (c > d)System.out.println(c + " e' successivo a " + d);
    }
}
