package ghiozdan;

public class Ghiozdan {
    public Rechizita[] rechizite;
    public int index = 0;

    public Ghiozdan(int numar)
    {
        rechizite = new Rechizita[numar];
    }

    public void add(Caiet caiet)
    {
        if(index < rechizite.length) {
            rechizite[index++] = caiet;
            System.out.println("Caietul a fost adaugat!");
        }
        else
            System.out.println("Nu se mai poate adauga(Caiet)");
    }

    public void add(Manual manual)
    {
        if(index < rechizite.length) {
            rechizite[index++] = manual;
            System.out.println("Manualul a fost adaugat!");
        }
        else
            System.out.println("Nu se mai poate adauga(Manual)");
    }

    public void listItems()
    {
        for(int i = 0; i < index; i++)
        {
            System.out.println(rechizite[i].getNume());
        }
    }

    public void listManual()
    {
        for(int i = 0; i < index; i++)
        {
            if(rechizite[i] instanceof Manual)
                System.out.println(rechizite[i].getNume());
        }
    }

    public void listCaiet()
    {
        for(int i = 0; i < index; i++)
        {
            if(rechizite[i] instanceof Caiet)
                System.out.println(rechizite[i].getNume());
        }
    }

    public int getNrRechizite()
    {
        return index;
    }

    public int getNrManuale()
    {
        int contor = 0;
        for(int i = 0; i < index; i++)
        {
            if(rechizite[i] instanceof Manual)
                contor++;
        }
        return contor;
    }

    public int getNrCaiete()
    {
        int contor = 0;
        for(int i = 0; i < index; i++)
        {
            if(rechizite[i] instanceof Caiet)
                contor++;
        }
        return contor;
    }
}
