package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, calcolare la somma dei numeri in posizione pari e la somma dei numeri in posizione dispari
public class Es6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder indexPari = new StringBuilder() , indexDispari = new StringBuilder();
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        String input = sc.nextLine();
        int index = 1, sumPari = 0, sumDispari = 0;
        while(!input.isEmpty()) {
            int number = Integer.parseInt(input);
            if(index % 2 == 0) {
                if(indexPari.isEmpty()) {
                    indexPari.append(number);
                } else {
                    indexPari.append(" + ").append(number);
                }
                sumPari += number;
            } else {
                if(indexDispari.isEmpty()) {
                    indexDispari.append(number);
                } else {
                    indexDispari.append(" + ").append(number);
                }
                sumDispari += number;
            }
            index++;
            input = sc.nextLine();
        }
        indexPari.append(" = ").append(sumPari);
        indexDispari.append(" = ").append(sumDispari);
        System.out.println(indexPari);
        System.out.println(indexDispari);
    }
}
