package sah;

public class Rege extends Piesa {
    public Rege(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        if(end.getPiesa().isWhite() == this.isWhite())
        {
            return false;
        }

        int x = Math.abs(end.getX() - start.getX());
        int y = Math.abs(end.getY() - start.getY());
        return x + y == 1 || x + y == 2;
    }
}
