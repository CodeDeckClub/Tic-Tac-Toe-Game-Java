package com.company;
//Imports
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;

//Main Method
public class Main {
    static Scanner input;
    static String[] board;
    static String turn;

    public static void main(String[] args) {
        input = new Scanner(System.in).useDelimiter("[\\n\\r\\f]+");
        board = new String[9];
        turn = "X";
        String winner = null;
        populateEmptyBoard();


        printBoard();
        System.out.println("IMPORTANT RULE:");
        System.out.println("When entering a slot number, DO NOT enter in a SPECIAL CHARACTERS or LETTERS! It will result in an AUTOMATIC LOSS!");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("X's will play first. Enter a slot number to place X in:");

        while (winner == null) {
            while(!input.hasNextInt()){
                input.next();
                System.out.println("Invalid input; re-enter slot number:");
            }
            int numInput;
            try {
                numInput = input.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! " + turn + "'s have lost.");
                break;
            }
            if (board[numInput-1].equals(String.valueOf(numInput))) {
                board[numInput-1] = turn;
                if (turn.equals("X")) {
                    turn = "O";
                } else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();
            } else {
                System.out.println("Slot already taken; re-enter slot number:");
                continue;
            }
        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("It's a draw! Thanks for playing.");
        } else {
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
    }
//Checks to see if 3 in a row
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;
            switch (a) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) return "draw";
        }

        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
        return null;
    }
//Creates Board GUI
    static void printBoard() {

        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");

    }
//Populates board with values
    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a+1);
        }
}
