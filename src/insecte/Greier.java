package insecte;

public class Greier extends Gindac {
    private int l = printInit("A new Greier is in town!") + 6;

    public Greier()
    {
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }

    private static int x5 = printInit("static Greier.x5 initializat");

    public static void main(String[] args)
    {
        System.out.println("Greier constructor");
        Greier g = new Greier();
    }
}
