package Esercizi;
/*Scrivere un'applicazione che legga una frazione e un esponente e calcoli la frazione ottenuta elevandola all'esponente (positivo o negativo)*/
import prog.io.ConsoleInputManager;
import prog.utili.Frazione;

public class Es7 {
    public static void main(String[] args) {
        ConsoleInputManager in = new ConsoleInputManager();
        Frazione f = new Frazione(in.readInt("Numeratore: "), in.readInt("Denominatore: "));
        int e = in.readInt("Esponente (positivo o negativo): ");
        System.out.println(Es7.elevate(f,e));
    }
    public static Frazione elevate(Frazione f, int e) {
        if(e == 0) return new Frazione(1,1);
        int num = f.getNumeratore();
        int den = f.getDenominatore();
        for(int i = 1; i < Math.abs(e); i++) {
            num *= f.getNumeratore();
            den *= f.getDenominatore();
        }
        if(e < 0) {
            int tmp = num;
            num = den;
            den = tmp;
        }
        return new Frazione(num, den);
    }
}
