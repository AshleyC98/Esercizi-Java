package Esercizi;

import prog.io.ConsoleInputManager;

/*Scrivere un'applicazione che lette due stringhe indichi se sono uguali o diverse.
* Se diverse, dovranno essere visualizzare in ordine alfabetico*/
public class Es2 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String a = in.readLine("Prima stringa: ");
        String b = in.readLine("Seconda stringa: ");
        if(a.compareTo(b) == 0)
            System.out.println("Le due stringhe sono uguali");
        else if(a.compareTo(b) < 0) {
            System.out.println("1: " + a);
            System.out.println("2: " + b);
        }
        else {
            System.out.println("1: " + b);
            System.out.println("2: " + a);
        }
    }
}
