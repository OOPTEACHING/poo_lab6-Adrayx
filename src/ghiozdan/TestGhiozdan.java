package ghiozdan;

public class TestGhiozdan {
    public static void main(String[] args)
    {
        Rechizita caiet1 = new Caiet("Matematica");
        Rechizita caiet2 = new Caiet("Romana");
        Rechizita caiet3 = new Caiet("Muzica");
        Rechizita caiet4 = new Caiet("Desen");

        Rechizita manual1 = new Manual("Istorie");
        Rechizita manual2 = new Manual("Fizica");
        Rechizita manual3 = new Manual("Chimie");

        Ghiozdan ghiozdan = new Ghiozdan(6);

        ghiozdan.add((Caiet) caiet1);
        ghiozdan.add((Manual) manual1);
        ghiozdan.add((Manual) manual2);
        ghiozdan.add((Caiet) caiet2);
        ghiozdan.add((Manual) manual3);
        ghiozdan.add((Caiet) caiet3);

        System.out.println();
        System.out.println("Ghiozdanul contine:");
        ghiozdan.listItems();
        System.out.println();
        System.out.println("Ghiozdanul contine urmatoarele caiete: ");
        ghiozdan.listCaiet();
        System.out.println();

        ghiozdan.add((Caiet) caiet4);

        System.out.println();
        System.out.println("Ghiozdanul contine urmatoarele caiete: ");
        ghiozdan.listCaiet();

        System.out.println();
        System.out.println("Numarul de caiete este: " + ghiozdan.getNrCaiete());
        System.out.println("Numarul de manuale este: " + ghiozdan.getNrManuale());
        System.out.println("In total sunt " + ghiozdan.getNrRechizite() + " rechizite in ghiozdan!");
    }
}
