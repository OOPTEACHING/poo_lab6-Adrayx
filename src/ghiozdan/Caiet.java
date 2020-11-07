package ghiozdan;

public class Caiet extends Rechizita {
    public Caiet(String eticheta)
    {
        super.eticheta = eticheta;
        super.pret = 3;
    }

    @Override
    public String getNume() {
        return eticheta + " Caiet";
    }
}
