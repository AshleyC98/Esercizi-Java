package Esercizi;

import java.util.Scanner;

public class SumSequenceNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire un numero alla volta (premi INVIO per terminare): ");
        String input = sc.nextLine();
        String output = "";
        int sum = 0;
        boolean first = true;

        while(!input.isEmpty()) {
            int number = Integer.parseInt(input);
            sum+=number;
            if(first) {
                output += input;
                first = false;
            }
            else {
                output += " + " + input;
            }
            input = sc.nextLine();
        }
        output += " = " + sum;
        System.out.println(output);
    }
}
