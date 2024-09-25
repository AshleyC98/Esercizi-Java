package Esercizi;

import prog.io.ConsoleInputManager;

import java.util.Scanner;

/*Scrivere un'applicazione che legga una sequenza di numeri interi e al termine visualizzi quello più grande e quello più piccolo.
Metodo 1: numeri interi di tipo int
Metodo 2: numeri interi come oggetti della classe Integer*/
public class Es2 {
    public static void main(String[] args) {
        method1();
        System.out.println();
        method2();
    }
    private static void method1() {
        System.out.println("METODO 1");
        Scanner sc = new Scanner(System.in);
        StringBuilder numeri = new StringBuilder();
        System.out.println("Inserire una sequenza di numeri: ");
        String num = sc.nextLine();
        int min = Integer.parseInt(num), max = Integer.parseInt(num);
        while(!num.isEmpty()) {
            int n = Integer.parseInt(num);
            if(numeri.isEmpty()) numeri.append(n);
            else numeri.append(" ").append(n);
            if(n < min) min = n;
            if(n > max) max = n;
            num = sc.nextLine();
        }
        System.out.println("Sequenza inserita: " + numeri);
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }
    private static void method2() {
        System.out.println("METODO 2");
        Scanner sc = new Scanner(System.in);
        StringBuilder numeri = new StringBuilder();
        System.out.println("Inserire una sequenza di numeri: ");
        String num = sc.nextLine();
        Integer min = Integer.parseInt(num), max = Integer.parseInt(num);
        while(!num.isEmpty()) {
            Integer n = Integer.parseInt(num);
            if(numeri.isEmpty()) numeri.append(n);
            else numeri.append(" ").append(n);
            if(n.compareTo(min) < 0) min = n;
            if(n.compareTo(max) > 0) max = n;
            num = sc.nextLine();
        }
        System.out.println("Sequenza inserita: " + numeri);
        System.out.println("Numero massimo: " + max);
        System.out.println("Numero minimo: " + min);
    }
}
