package Esercizi;

import prog.io.ConsoleInputManager;
import prog.utili.Importo;

//Scrivere un'applicazione che legga un prezzo in euro e una percentuale di sconto (int) e comunichi:
//importo, sconto importo scontato
    public class Es9 {
        public static void main(String[] args) {
            ConsoleInputManager in = new ConsoleInputManager();
            System.out.println("Prezzo");
            Importo euro = new Importo(in.readInt("Euri: "), in.readInt("Centesimi: "));
            int sconto = in.readInt("Sconto (%): ");
            int totaleCentesimi = euro.getEuro() * 100 + euro.getCent();
            double scontoImporto = totaleCentesimi * sconto / 100.0;
            double importoScontato = totaleCentesimi - scontoImporto;
            System.out.printf("Importo: %d euro e %d centesimi%n", euro.getEuro(), euro.getCent());
            System.out.printf("Sconto: %.2f euro%n", scontoImporto / 100);
            System.out.printf("Importo scontato: %.2f euro%n", importoScontato / 100);
        }
    }

