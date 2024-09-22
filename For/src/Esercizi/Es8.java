package Esercizi;
/*Scrivere un'applicazione che generi e visualizzi una sequenza di 20 numeri
interi generati casualmente e li sommi*/
import java.util.Random;

public class Es8 {
    public static void main(String[] args) {
        Random r = new Random();
        int num = 1;
        int somma = 0;
        while(num <= 20) {
            int daSommare = r.nextInt(1, 101);
            System.out.println(num++ + ") " +daSommare);
            somma+= daSommare;
        }
        System.out.println("Somma: " + somma);
    }
}
