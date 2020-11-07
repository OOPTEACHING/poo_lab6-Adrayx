package insecte;

public class Regina extends Albina {
    private int l = this.j + 3;

    public Regina()
    {
        System.out.println("l = " + l);
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x4 = printInit("static Regina.x4 initializat");

    public static void main(String[] args)
    {
        System.out.println("Regina constructor");
        Regina r = new Regina();
    }
}
