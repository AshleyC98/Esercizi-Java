package Esercizi;

import prog.io.ConsoleInputManager;
/*Sia c un char. senza usare !(not), ma && oppure ||, indicare:
1) c contiente una lettera maiuscola
2) c contiente una lettera minuscola
3) c non contiente una lettera maiuscola
4) c non contiente una lettera minuscola
5) c contiene una lettera
6) c non contiene una lettera*/
public class Es1 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        char c = in.readChar("Inserisci un char: ");
        if(Character.isUpperCase(c) && Character.isLetter(c)) {
            System.out.println(c + " contiene una lettera in maiuscolo");
            System.out.println(c + " non contiene una lettera in minuscolo");
        }
        if(Character.isLowerCase(c) && Character.isLetter(c)){
            System.out.println(c + " contiene una lettera in minuscolo");
            System.out.println(c + " non contiene una lettera in maiuscolo");
        }
        if(Character.isDigit(c))System.out.println(c + " non e' una lettera");
    }
}
