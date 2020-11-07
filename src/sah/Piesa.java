package sah;

public abstract class Piesa {
    private boolean white;

    public Piesa(boolean white)
    {
        this.white = white;
    }

    public boolean isWhite() {
        return white;
    }

    public boolean freeToMove(Board board, Position start, Position end)
    {
        int initialX, initialY, finalX, finalY;
        if (start.getX() < end.getX()) {
            initialX = start.getX();
            finalX = end.getX();
        } else {
            initialX = start.getX();
            finalX = end.getX();
        }

        if (start.getY() < end.getY()) {
            initialY = start.getY();
            finalY = end.getY();
        } else {
            initialY = start.getY();
            finalY = end.getY();
        }
        for (int i = initialX - 1; i < finalX; i++) {
            for (int j = initialY - 1; j < finalY; j++)
                if (board.tabla[i][j].getPiesa().toString() != "PozitieGoala")
                    return false;
        }
        return true;
    }

    public abstract boolean canMove(Board board, Position start, Position end);
}
