package Esercizi;

import prog.io.ConsoleInputManager;
/*Scrivere un'applicazione che date due stringhe, indichi il numero totale di caratteri nelle stringhe, la stringa più lunga
e il numero complessivo di lettere maiuscole nella prima stringa*/
public class Es2 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        String a = in.readLine("Prima stringa: "), aNoSpaces = a.replace(" ", "");
        String b = in.readLine("Seconda stringa: "), bNoSpaces = b.replace(" ", "");
        int numUpperCaseA = 0;
        int numCharA = aNoSpaces.length(), numCharB = bNoSpaces.length();
        System.out.println(a + " ha " + numCharA + " lettere");
        System.out.println(b + " ha " + numCharB + " lettere");
        System.out.println("Lettere totali: " + (numCharA + numCharB));
        if(numCharA > numCharB) System.out.println(a + " e' più lunga di " + b);
        else System.out.println(b + " e' più lunga di " + b);
        for(int i = 0; i < numCharA; i++) {
            if(Character.isUpperCase(a.charAt(i))) numUpperCaseA++;
        }
        if(numUpperCaseA > 0)  System.out.println(a+ " ha " + numUpperCaseA + " lettere maiuscole");
    }
}
