import esercizio1.Rettangolo;

public class Main {

    public int PerimetroTot;
    public int AreaTot;

    public static void main(String[] args) {
        System.out.println("------------ESERCIZIO 1-------------");

        Rettangolo rettangolo1 = new Rettangolo(10, 28);
        Rettangolo rettangolo2 = new Rettangolo(15, 23);
        int Perimetro = rettangolo1.getTotPerimetro() + rettangolo2.getTotPerimetro();


        System.out.println("RETTANGOLO 1");
        System.out.println("Perimetro: " + rettangolo1.getPerimetro());
        System.out.println("Area: " + rettangolo1.getArea());
        System.out.println(" ");
        System.out.println("RETTANGOLO 2");
        System.out.println("Perimetro: " + rettangolo2.getPerimetro());
        System.out.println("Area: " + rettangolo2.getArea());
        System.out.println(" ");
        System.out.println("PERIMETRO RETTANGOLI: " + PerimetroTot(rettangolo1.getTotPerimetro(), rettangolo2.getPerimetro()));
        System.out.println("AREA RETTANGOLI: " + AreaTot(rettangolo1.getArea(), rettangolo2.getArea()));

    }

    public static int PerimetroTot(int ret1, int ret2) {
        int PerimetroTot = ret1 + ret2;
        return PerimetroTot;
    }

    public static int AreaTot(int ret1, int ret2) {
        int AreaTot = ret1 + ret2;
        return AreaTot;
    }
}