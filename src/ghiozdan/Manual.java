package ghiozdan;

public class Manual extends Rechizita {
    public Manual(String eticheta)
    {
        super.eticheta = eticheta;
        super.pret = 5;
    }

    @Override
    public String getNume() {
        return eticheta + " Manual";
    }
}
