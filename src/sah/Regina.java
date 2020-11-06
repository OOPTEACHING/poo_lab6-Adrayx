package sah;

public class Regina extends Piesa {
    public Regina(boolean white)
    {
        super(white);
    }

    @Override
    public boolean canMove(Board board, Position start, Position end)
    {
        int x = Math.abs(end.getX() - start.getX());
        int y = Math.abs(end.getY() - start.getY());
        if(x == y || x * y == 0) {
            return freeToMove(board, start, end);
        }
        else
            return false;
    }
}
