package insecte;

public class Insecta {
    private int i = 9;
    protected int j;

    public Insecta()
    {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insecta.x1 initializata");

    public static int printInit(String s)
    {
        System.out.println(s);
        return 47;
    }
}
