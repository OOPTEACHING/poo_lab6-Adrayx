package sah;

public class Regina extends Piesa {
    public Regina(boolean white)
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
        if(x == y || x * y == 0) {
            return freeToMove(board, start, end);
        }
        else
            return false;
    }

    @Override
    public String toString()
    {
        return "Regina";
    }
}
