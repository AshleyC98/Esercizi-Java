package Esercizi;

import prog.io.ConsoleInputManager;
/*Scrivere un'applicazione che letta una stringa, la visualizzi in maiuscolo, sottolineata (- pari alla  sua lunghezza)
e il numero complessivo di lettere minuscole*/
public class Es3 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String s = in.readLine("Inserire una stringa: ");
        int numLowerCase = 0;
        System.out.println(s.toUpperCase());
        for(int i = 0; i < s.length(); i++) {
            System.out.print("-");
            if(Character.isLowerCase(s.charAt(i))) numLowerCase++;
        }
        System.out.println("\n" + numLowerCase);
    }
}
