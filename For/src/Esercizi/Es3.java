package Esercizi;

import prog.io.ConsoleInputManager;

/*Scrivre un'applicazione che legga una sequenza di stringhe e visualizza, la lessicograficamente minima e massima, la stringa più corta e la più lunga.
Nel caso ci siano più stringhe della stessa lunghezza, è indifferente quale sia visualizzata*/
public class Es3 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String corta = "", lunga = "", minima = "", massima = "";
        String input = in.readLine("Inserisci una sequenza di stringhe: ");
        while(!input.isEmpty()) {
            if(corta.isEmpty() || input.length() < corta.length()) corta = input;
            if(lunga.isEmpty() || input.length() > lunga.length()) lunga = input;
            if(minima.isEmpty() || input.compareTo(minima) < 0) minima = input;
            if(massima.isEmpty() || input.compareTo(massima) > 0) massima = input;
            input = in.readLine();
        }
        System.out.println("Stringa corta: " + corta);
        System.out.println("Stringa lunga: " + lunga);
        System.out.println("Stringa minima: " + minima);
        System.out.println("Stringa massima: " + massima);
    }
}
