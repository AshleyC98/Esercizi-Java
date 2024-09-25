package Esercizi;

import prog.io.ConsoleInputManager;
import java.util.Random;
/*Utilizzando il metodo nextBoolean della classe Random, scrivere un'applicazione che simuli una sequenza di lanci di moneta,
dove il numero di lanci viene inserito preliminariamente dall'utente. Calcolaree via via la percentuale di lanci che forniscono
come risultato testa e quella che danno croce*/
public class Es11 {
    public static void main(String[] args) {
        Random r = new Random();
        ConsoleInputManager in = new ConsoleInputManager();
        int numLanci = in.readInt("Numero di lanci: "), testa = 0, croce = 0;
        for(int i = 1; i <= numLanci; i++) {
            boolean ris = r.nextBoolean();
            if(ris) testa++;
            else croce++;
            int percTesta = (int) ((double) testa / i * 100);
            int percCroce = (int) ((double) croce / i * 100);
            System.out.printf("Lancio %d: Testa = %d%%, Croce = %d%%\n", i, percTesta, percCroce);
        }
    }
}
