package esercizio2;

import java.util.Random;

public class SIM {

    //ATTRIBUTI
    private String numeroCell;
    private double creditoDisponibile;
    private int last5Call;
    private double minutes;

    //COSTRUTTORI

    public SIM(String numeroCell, double creditoDisponibile, double minutes) {
        Random random = new Random();
        this.numeroCell = "numeroCell";
        this.creditoDisponibile = creditoDisponibile;
        this.last5Call = last5Call;
        this.minutes = random.nextDouble(0.30, 2.30);
    }

    //METODI


}
