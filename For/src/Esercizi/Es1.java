package Esercizi;
//Applicazione che legge una sequenza di stringhe e comunichi quella più piccola in ordine lessicografico
import prog.io.*;
public class Es1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String s = in.readLine("Prossima stringa: ");
        String minima = null;
        while(!s.isEmpty()) {
            if((minima == null) || (s.compareTo(minima) < 0)) {
                minima = s;
            }
            s = in.readLine("Prossima stringa: ");
        }
        if(minima == null)
            System.out.println("Non sono state inserite stringhe");
        else
            System.out.println("La stringa lessicograficamente minima e' " + minima);
    }
}
