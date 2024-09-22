package Esercizi;
/*Scrivere un'applicazione che ricevendo in ingresso un numero intero positivo, indichi se è primo.
Primo metodo: dividere il numero per tutti i numeri inferiori per verificare l'esistenza di un divisore.
Secondo metodo: interrompere l'iterazione quando viene individuato un divisore.
Terzo metodo: Ridurre il numero di iterazioni osservando che se un numero ammette un divisore, allora ammette anche un divisore
minore o uguale alla propria radice quadrata.
*/

import prog.io.ConsoleInputManager;

public class Es4 {
    private int num;

    public Es4(int n) {
        this.num = n;
    }

    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        int n = in.readInt("Inserisci un numero: ");
        Es4 x = new Es4(n);
        x.method1();
        System.out.println();
        x.method2();
        System.out.println();
        x.method3();

    }

    public void method1() {
        int numCicli = 0;
        System.out.println("METODO 1");
        StringBuilder res = new StringBuilder();
        for (int i = 2; i < this.num; i++) {
            numCicli++;
            if (num % i == 0) {
                if (res.isEmpty())
                    res.append(i);
                else
                    res.append(", ").append(i);
            }
        }
        System.out.println("Numero di cicli: " + numCicli);
        if (res.isEmpty())
            System.out.println(num + " e' un numero primo");
        else {
            System.out.println(num + " non e' un numero primo");
            System.out.println("E' divisibile per: " + res);
        }
    }

    public void method2() {
        int numCicli = 0;
        System.out.println("METODO 2");
        boolean primo = true;
        for (int i = 2; i < this.num; i++) {
            numCicli++;
            if (num % i == 0) {
                primo = false;
                break;
            }
        }
        System.out.println("Numero di cicli: " + numCicli);
        if (!primo)
            System.out.println(num + " e' un numero primo");
        else
            System.out.println(num + " non e' un numero primo");
    }

    public void method3() {
        int numCicli = 0;
        int divisore = 0;
        System.out.println("METODO 3");
        boolean primo = true;
        for(int i = 2; i < this.num; i++) {
            numCicli++;
            primo = false;
            if(this.num % i == 0) {
                int radice = (int) Math.sqrt(this.num);
                for(int j = divisore; j <= radice; j++) {
                    numCicli++;
                }
                break;
            }
        }
        System.out.println("Numero di cicli: " + numCicli);
        if (primo) {
            System.out.println(num + " è un numero primo");
        } else {
            System.out.println(num + " non è un numero primo");
        }
    }
}
