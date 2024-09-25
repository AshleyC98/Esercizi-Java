package Esercizi;

import prog.io.ConsoleInputManager;

import java.util.Random;

/*Modificare Es8 in modo che richieda all'utente quanti numeri devono essere generati e un numero x. L'applicazione deve generare
numeri non negativi minori di x*/
public class Es9 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Random r = new Random();
        int i = in.readInt("Quanti numeri devono essere generati? "), num = 0, x = in.readInt("x: "), somma = 0;
        while(num < i) {
            int numRandom = r.nextInt(0,x);
            somma += numRandom;
            System.out.println(num+1 + ") " + numRandom);
            num++;
        }
        System.out.println("Somma totale: " + somma);
    }
}
