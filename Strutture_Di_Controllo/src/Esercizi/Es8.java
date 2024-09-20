package Esercizi;

import java.util.Scanner;
//Dato in input una sequenza di numeri dall'utente, indicare il minimo e il massimo
public class Es8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        StringBuilder numbers = new StringBuilder();
        String input = sc.nextLine();
        int min = Integer.parseInt(input), max = min;
        while(!input.isEmpty()) {
            int number = Integer.parseInt(input);
            numbers.append("|").append(number);
            if(number > max) max = number;
            if(number < min) min = number;
            input = sc.nextLine();
        }
        numbers.append("|");
        System.out.println(numbers);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
