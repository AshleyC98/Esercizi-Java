package Esercizi;
//Modificare Es1 in modo da visualizzare la stringa di lunghezza pari, lessicograficamente minima
import prog.io.ConsoleInputManager;

public class Es2 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String s = in.readLine("Prossima stringa: ");
        String minima = null;
        while(!s.isEmpty()) {
            if(((minima == null) || (s.compareTo(minima) < 0)) && s.length()%2 == 0) {
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
