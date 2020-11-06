package sah;

import java.util.Scanner;

public class Game {
    public static boolean move(Board board, Position start, Position end)
    {
        if(start.getPiesa().canMove(board, start, end)) {
            if(end.getPiesa().getClass().toString().contentEquals("Rege"))
                return true;
            System.out.print(start.getPiesa().toString() + " moved to " + end.getX() + " " + end.getY());
            board.tabla[end.getX()][end.getY()].setPiesa(start.getPiesa());
        }
        else
            System.out.println("Impossible to move!");
        return false;
    }

    public static boolean playerMove(Board board, int x, int y, int endX, int endY)
    {
        if(x > 8 || y > 8 || x <= 0 || y <= 0) {
            System.out.println("Impossible move!");
            return false;
        }
        if(endX > 8 || endY > 8 || endX <= 0 || endY <= 0) {
            System.out.println("Impossible move!");
            return false;
        }
        return move(board, board.tabla[x - 1][y - 1], board.tabla[endX - 1][endY - 1]);
    }

    public static void main(String[] args) {
        Board board = new Board();
        board.initializeBoard();

        Scanner s = new Scanner(System.in);
        System.out.println("0: END GAME");
        System.out.println("1: RESTART GAME");
        System.out.println("2: BEGIN GAME");
        while(true)
        {
            int x = s.nextInt();
            if(x == 0)
            {
                System.out.println("Game ended!");
                break;
            }
            else if(x == 1)
            {
                System.out.println("Game restart!");
                board.initializeBoard();
            }
            else if(x == 2)
            {
                System.out.println("White begins!");
                boolean white = true;
                while(true)
                {
                    int initialX, initialY, finalX, finalY;
                    System.out.println("The coordinates of the piece you want to move: ");
                    System.out.print("x = ");
                    initialX = s.nextInt();
                    System.out.print("y = ");
                    initialY = s.nextInt();
                    System.out.println("The ending coordinates: ");
                    System.out.print("x = ");
                    finalX = s.nextInt();
                    System.out.print("y = ");
                    finalY = s.nextInt();
                    if(playerMove(board, initialX, initialY, finalX, finalY))
                    {
                        String side = (white) ? "White" : "Black";
                        System.out.println(side + " won!");
                        break;
                    }
                    white = !white;
                    if(white)
                    {
                        System.out.println("Now it's white's turn");
                    }
                    else
                    {
                        System.out.println("Now it's black's turn");
                    }
                }
            }
        }
    }
}
