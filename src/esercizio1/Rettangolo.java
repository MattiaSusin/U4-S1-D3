package esercizio1;

public class Rettangolo {

    //ATTRIBUTI
    public int altezza;
    public int larghezza;


    //COSTRUTTORI
    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;

    }


    //METODI

    public int getPerimetro() {
        return (this.altezza + this.larghezza) * 2;
    }

    public int getArea() {
        return (this.altezza * this.larghezza);

    }

    public int getTotPerimetro() {
        return (this.altezza + this.larghezza) * 2;
    }
}
