package Esercizi;

public class Frazione {
    private int num;
    private int den;

    public Frazione(int num) {
        this.num = num;
        this.den = 1;
    }
    public Frazione(int num, int den) {
        this.num = num;
        this.den = den;
    }

    public Frazione piu(Frazione f) {
        int den = MCD(this.den, f.den);
        int num = ((den/this.den)*this.num)+((den/f.den)*f.num);
        return new Frazione(num,den);
    }

    public Frazione meno(Frazione f) {
        int den = MCD(this.den, f.den);
        int num = ((den/this.den)*this.num)-((den/f.den)*f.num);
        return new Frazione(num,den);
    }
    public Frazione per(Frazione f) {
        return new Frazione(this.num*f.num,this.den*f.den);
    }
    public Frazione diviso(Frazione f) {
        return new Frazione(this.num*f.den,this.den*f.num);
    }

    public Frazione quadrato() {
        return new Frazione(this.num*this.num, this.den*this.den);
    }

    public boolean equals(Frazione f) {
        Frazione tmp = this.meno(f);
        return tmp.num == 0;
    }

    public boolean isMinore(Frazione f) {
        Frazione tmp = this.meno(f);
        return(tmp.num < 0 && tmp.den > 0 || tmp.num > 0 && tmp.den < 0);
    }

    public boolean isMaggiore(Frazione f) {
        return !this.isMinore(f);
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }

    @Override
    public String toString() {
        return this.num+"/"+this.den;
    }

    private static int MCD(int x, int y) {
        int resto;
        do {
            resto = x % y;
            if (resto != 0) {
                x = y;
                y = resto;
            }
        } while (resto != 0);
        return y;
    }
}
