package sah;

import javax.swing.*;
import java.util.Scanner;

public class Game {
    public static boolean move(Board board, Position start, Position end)
    {
        if(start.getPiesa().canMove(board, start, end)) {
            System.out.println(start.getPiesa().toString() + " moved to " + end.getX() + " " + end.getY());
            board.tabla[end.getX()][end.getY()].setPiesa(start.getPiesa());
            board.tabla[start.getX()][start.getY()].setPiesa(new PozitieGoala());
        }
        else
            System.out.println("Impossible to move!");
        return false;
    }

    public static boolean playerMove(Board board, int x, int y, int endX, int endY)
    {
        if(endX > 8 || endY > 8 || endX <= 0 || endY <= 0) {
            System.out.println("Impossible move!");
            return false;
        }
        return move(board, board.tabla[x - 1][y - 1], board.tabla[endX - 1][endY - 1]);
    }


    public static boolean play(Board board, boolean white, Scanner s)
    {
        System.out.println("Introduce the starting coordonates of the piece you want to move: ");
        System.out.print("X = ");
        int initialX = s.nextInt();
        System.out.print("Y = ");
        int initialY = s.nextInt();
        while(true) {
            if (initialX <= 8 || initialX > 0 || initialY > 0 || initialY <= 8) {
                if (board.tabla[initialX - 1][initialY - 1].getPiesa().isWhite() != white) {
                    System.out.println("Please move a " + (white ? "white" : "black") + " piece");
                    System.out.print("X = ");
                    initialX = s.nextInt();
                    System.out.print("Y = ");
                    initialY = s.nextInt();
                }
                else
                    break;
            }
            else
            {
                System.out.println("Please enter valide coordiantes:");
                System.out.print("X = ");
                initialX = s.nextInt();
                System.out.print("Y = ");
                initialY = s.nextInt();
            }
        }

        System.out.println("Introduce the ending coordonates of the piece you want to move: ");
        System.out.print("X = ");
        int finalX = s.nextInt();
        System.out.print("Y = ");
        int finalY = s.nextInt();
        while(!playerMove(board, initialX, initialY, finalX, finalY))
        {
            System.out.println("Please make a valid move!");
            System.out.print("X = ");
            finalX = s.nextInt();
            System.out.print("Y = ");
            finalY = s.nextInt();
        }

        if(board.checkKings() == 0)
            return false;
        else
            if(board.checkKings() == 1)
            {
                System.out.println("White wins");
                return true;
            }
            else
            {
                System.out.println("Black wins");
                return true;
            }

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
                    if(play(board, white, s))
                        break;
                    white = !white;
                    System.out.println();
                    //board.listBoard();
                }
            }
        }
    }
}
