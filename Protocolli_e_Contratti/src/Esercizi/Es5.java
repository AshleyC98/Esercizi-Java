package Esercizi;
//Scrivere un'applicazione che lagga una stringa, ne comunichi la lunghezza in cifre e in lettere
import prog.io.*;
import prog.utili.Intero;

public class Es5 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String input = in.readLine("Inserischi una stringa: ");
        Intero i = new Intero(input.length());
        System.out.println("La lunghezza della stringa " + input + " e' " + input.length() + " (" + i + ")" );
    }
}
