package sah;

public class PozitieGoala extends Piesa {
    public PozitieGoala()
    {
        super(false);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        return false;
    }

    @Override
    public String toString()
    {
        return "PozitieGoala";
    }
}
