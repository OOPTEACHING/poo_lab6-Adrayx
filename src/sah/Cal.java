package sah;

public class Cal extends Piesa {
    public Cal(boolean white)
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
        int y = Math.abs(end.getX() - start.getX());

        return x * y == 2;
    }
}
