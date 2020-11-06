package sah;

public class Pion extends Piesa {
    public Pion(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        if(Math.abs(end.getX() - start.getX()) == 1 && start.getY() == end.getY() && end.getPiesa().toString() == "PozitieGoala")
        {
            return true;
        }
        else if(Math.abs(end.getX() - start.getX()) == 1 && Math.abs(end.getY() - start.getY()) == 1 && end.getPiesa().isWhite() != this.isWhite())
        {
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString()
    {
        return "Pion";
    }
}
