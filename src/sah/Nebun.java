package sah;

public class Nebun extends Piesa {
    public Nebun(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        int x = Math.abs(end.getX() - start.getX());
        int y = Math.abs(end.getY() - start.getY());
        if(x == y)
        {
            return freeToMove(board, start, end);
        }
        else
            return false;
    }
}
