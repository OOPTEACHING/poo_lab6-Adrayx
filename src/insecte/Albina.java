package insecte;

public class Albina extends Insecta {
    protected int k = printInit("Albina.k initializat") + 2;

    public Albina()
    {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x3 = printInit("static Albina.x3 initializat");

    public static void main(String[] args)
    {
        System.out.println("Albina constructor");
        Albina a = new Albina();
    }
}
