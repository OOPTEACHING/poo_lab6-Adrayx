package sah;

public class Board {
    Position[][] tabla;

    public Board()
    {
        tabla = new Position[8][8];
    }

    public void initializeBoard()
    {
        tabla[0][0] = new Position(0, 0, new Tura(false));
        tabla[0][1] = new Position(0, 1, new Cal(false));
        tabla[0][2] = new Position(0, 2, new Nebun(false));
        tabla[0][3] = new Position(0, 3, new Regina(false));
        tabla[0][4] = new Position(0, 4, new Rege(false));
        tabla[0][5] = new Position(0, 5, new Nebun(false));
        tabla[0][6] = new Position(0, 6, new Cal(false));
        tabla[0][7] = new Position(0, 7, new Tura(false));
        tabla[1][0] = new Position(1, 0, new Pion(false));
        tabla[1][1] = new Position(1, 1, new Pion(false));
        tabla[1][2] = new Position(1, 2, new Pion(false));
        tabla[1][3] = new Position(1, 3, new Pion(false));
        tabla[1][4] = new Position(1, 4, new Pion(false));
        tabla[1][5] = new Position(1, 5, new Pion(false));
        tabla[1][6] = new Position(1, 6, new Pion(false));
        tabla[1][7] = new Position(1, 7, new Pion(false));

        tabla[7][0] = new Position(7, 0, new Tura(true));
        tabla[7][1] = new Position(7, 1, new Cal(true));
        tabla[7][2] = new Position(7, 2, new Nebun(true));
        tabla[7][3] = new Position(7, 3, new Rege(true));
        tabla[7][4] = new Position(7, 4, new Regina(true));
        tabla[7][5] = new Position(7, 5, new Nebun(true));
        tabla[7][6] = new Position(7, 6, new Cal(true));
        tabla[7][7] = new Position(7, 7, new Tura(true));
        tabla[6][0] = new Position(6, 0, new Pion(true));
        tabla[6][1] = new Position(6, 1, new Pion(true));
        tabla[6][2] = new Position(6, 2, new Pion(true));
        tabla[6][3] = new Position(6, 3, new Pion(true));
        tabla[6][4] = new Position(6, 4, new Pion(true));
        tabla[6][5] = new Position(6, 5, new Pion(true));
        tabla[6][6] = new Position(6, 6, new Pion(true));
        tabla[6][7] = new Position(6, 7, new Pion(true));

        for(int i = 2; i < 6; i++)
            for(int j = 0; j < 8; j++)
            {
                tabla[i][j] = new Position(i, j, null);
            }
    }


}
