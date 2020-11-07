package sah;

public class Cal extends Piesa {
    public Cal(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        if(end.getPiesa().isWhite() == start.getPiesa().isWhite() && end.getPiesa().toString() != "PozitieGoala")
            return false;

        int x = Math.abs(end.getX() - start.getX());
        int y = Math.abs(end.getY() - start.getY());

        return x * y == 2;
    }

    @Override
    public String toString()
    {
        return "Cal";
    }
}
