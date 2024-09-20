package Esercizi;

import java.util.Scanner;
//Dato in input un numero dall'utente, indicare se è pari o dispari
public class Es1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserire un numero: ");
        int input = sc.nextInt();
        if(input % 2 == 0)
            System.out.println(input + ": PARI");
        else
            System.out.println(input + ": DISPARI");
    }
}
