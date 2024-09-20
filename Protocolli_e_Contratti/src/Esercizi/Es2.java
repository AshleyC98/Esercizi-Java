package Esercizi;

import java.util.Scanner;

//Scrivere un'applicazione che legga una frazioni e ne restituisca il quadrato
public class Es2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeratore:" );
        int num = sc.nextInt();
        System.out.print("Denominatore: ");
        int den = sc.nextInt();
        Frazione f = new Frazione(num, den);
        System.out.println("Quadrato di " + f + ": " +f.quadrato());
    }
}
