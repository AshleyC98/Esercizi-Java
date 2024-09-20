package Esercizi;

import java.util.Scanner;

//Scrivere un'applicazione che, lette da tastiera due stringhe, visualizzi la lunghezza delle due strighe e
//la media delle loro lunghezze espresse in frazione
public class Es3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire la prima stringa: ");
        String a = sc.nextLine();
        System.out.print("Inserire la seconda stringa: ");
        String b = sc.nextLine();
        int aSize = a.length();
        int bSize = b.length();
        System.out.println("La lunghezza di " + a + "e': " + aSize);
        System.out.println("La lunghezza di " + b + "e': " + bSize);
        Frazione media = new Frazione(aSize+bSize, 2);
        System.out.println("La media delle loro lunghezze e': " + media);
    }
}
