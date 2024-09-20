package Esercizi;

import java.util.Scanner;
//Dato in input due numeri dall'utente, calcolare la somma dei numeri in posizione pari e la somma dei numeri in posizione dispari
public class Es6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String indexPari = "", indexDispari = "";
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        String input = sc.nextLine();
        int index = 1, sumPari = 0, sumDispari = 0;
        while(!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if(index % 2 == 0) {
                if(indexPari.isEmpty()) {
                    indexPari += number;
                } else {
                    indexPari += " + " + number;
                }
                sumPari += number;
            } else {
                if(indexDispari.isEmpty()) {
                    indexDispari += number;
                } else {
                    indexDispari += " + " + number;
                }
                sumDispari += number;
            }
            index++;
            input = sc.nextLine();
        }
        indexPari += " = " + sumPari;
        indexDispari += " = " + sumDispari;
        System.out.println(indexPari);
        System.out.println(indexDispari);
    }
}
