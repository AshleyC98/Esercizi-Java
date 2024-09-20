package Esercizi;
//Scrivere un'applicazione che legga due frazioni e ne visualizzi la somma, differenza, prodotto e quoziente
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numeratore della prima frazione: ");
        int num1 = sc.nextInt();
        System.out.print("Denominatore della prima frazione: ");
        int den1 = sc.nextInt();
        Frazione a = new Frazione(num1, den1);
        System.out.print("Numeratore della seconda frazione: ");
        int num2 = sc.nextInt();
        System.out.print("Denominatore della seconda frazione: ");
        int den2 = sc.nextInt();
        Frazione b = new Frazione(num2, den2);
        System.out.println(a + " + " + b + " = " + a.piu(b));
        System.out.println(a + " - " + b + " = " + a.meno(b));
        System.out.println(a + " * " + b + " = " + a.per(b));
        System.out.println(a + " : " + b + " = " + a.diviso(b));
    }
}
