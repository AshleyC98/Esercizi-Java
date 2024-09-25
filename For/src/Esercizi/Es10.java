package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Intero;

import java.util.Random;
/*Servendosi della classe Intero, modificare Es9 in modo da visualizzare i numeri generati e la loro somma in lettere*/
public class Es10 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Random r = new Random();
        int i = in.readInt("Quanti numeri devono essere generati? "), num = 0, x = in.readInt("x: "), somma = 0;
        while(num < i) {
            int numRandom = r.nextInt(0,x);
            somma += numRandom;
            System.out.println(num+1 + ") " + new Intero(numRandom));
            num++;
        }
        System.out.println("Somma totale: " + new Intero(somma));
    }
}
