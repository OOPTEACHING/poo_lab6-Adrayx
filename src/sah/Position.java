package sah;

public class Position {
    private Piesa piesa;
    private int x;
    private int y;

    public Position(int x, int y, Piesa piesa)
    {
        this.x = x;
        this.y = y;
        this.piesa = piesa;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Piesa getPiesa() {
        return piesa;
    }

    public void setPiesa(Piesa piesa) {
        this.piesa = piesa;
    }
}
