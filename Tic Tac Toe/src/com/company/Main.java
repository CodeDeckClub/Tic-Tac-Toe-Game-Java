package com.company;
//Imports
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Arrays;

//Main Method
public class Main {
    static String[] board;
    static String turn;

    public static void main(String[] args) {
        board = new String[9];
        turn = "X";
        populateEmptyBoard();
        
        //set up for GUI
        final JFrame frame = new JFrame("Tic-Tac-Toe");
    	GridLayout grid = new GridLayout(0, 3);
    	JPanel panel = new JPanel(grid);
    	
    	final JButton topLeft = new JButton("1");
    	topLeft.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(topLeft);
        
        final JButton top = new JButton("2");
    	top.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(top);
        
        final JButton topRight = new JButton("3");
    	topRight.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(topRight);
        
        final JButton midLeft = new JButton("4");
    	midLeft.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(midLeft);
        
        final JButton middle = new JButton("5");
    	middle.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(middle);
        
        final JButton midRight = new JButton("6");
    	midRight.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(midRight);
        
        final JButton bottomLeft = new JButton("7");
    	bottomLeft.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(bottomLeft);
        
        final JButton bottom = new JButton("8");
    	bottom.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(bottom);
        
        final JButton bottomRight = new JButton("9");
    	bottomRight.setFont(new Font("Arial", Font.PLAIN, 100));
        panel.add(bottomRight);
        
        final JLabel label = new JLabel("<html>IMPORTANT RULE:<br>Click on the button to mark the location of X or O!<br><-----------------------------------------------------------------------------------------------------------------------------------------<br>X's will play first. Click a button to place X in.");
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        frame.add(label, BorderLayout.PAGE_END);
        
        frame.add(panel);
        
        //detects button press
        class ClickListener implements ActionListener { 
            public void actionPerformed(ActionEvent event) {
                Object obj = event.getSource();
                //checks if game is over
                if(!label.getText().equals("Congratulations! X's have won! Thanks for playing.") && !label.getText().equals("Congratulations! O's have won! Thanks for playing.") && !label.getText().equals("Congratulations! X's have won! Thanks for playing.") && !label.getText().equals("It's a draw! Thanks for playing."))
                {
                	if(obj == topLeft)
                    {
                    	if(topLeft.getText().equals("1"))
                    	{
                            board[0] = turn;
                            if (turn.equals("X")) {
                            	topLeft.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	topLeft.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == top)
                    {
                    	if(top.getText().equals("2"))
                    	{
                            board[1] = turn;
                            if (turn.equals("X")) {
                            	top.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	top.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == topRight)
                    {
                    	if(topRight.getText().equals("3"))
                    	{
                            board[2] = turn;
                            if (turn.equals("X")) {
                            	topRight.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	topRight.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == midLeft)
                    {
                    	if(midLeft.getText().equals("4"))
                    	{
                            board[3] = turn;
                            if (turn.equals("X")) {
                            	midLeft.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	midLeft.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == middle)
                    {
                    	if(middle.getText().equals("5"))
                    	{
                            board[4] = turn;
                            if (turn.equals("X")) {
                            	middle.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	middle.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == midRight)
                    {
                    	if(midRight.getText().equals("6"))
                    	{
                            board[5] = turn;
                            if (turn.equals("X")) {
                            	midRight.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	midRight.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == bottomLeft)
                    {
                    	if(bottomLeft.getText().equals("7"))
                    	{
                            board[6] = turn;
                            if (turn.equals("X")) {
                            	bottomLeft.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	bottomLeft.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else if(obj == bottom)
                    {
                    	if(bottom.getText().equals("8"))
                    	{
                            board[7] = turn;
                            if (turn.equals("X")) {
                            	bottom.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	bottom.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                    else
                    {
                    	if(bottomRight.getText().equals("9"))
                    	{
                            board[8] = turn;
                            if (turn.equals("X")) {
                            	bottomRight.setText("<html><font color=\"red\">" + turn + "</font></html>");
                                turn = "O";
                            } else {
                            	bottomRight.setText("<html><font color=\"green\">" + turn + "</font></html>");
                                turn = "X";
                            }
                            checkWinner(label);
                    	}
                    	else
                    	{
                    		label.setText("Slot already taken; choose another button (" + turn + "'s turn).");
                    		label.setFont(new Font("Arial", Font.PLAIN, 40));
                    	}
                    }
                }
            } 
          }
        
        //creates action listeners and links buttons to them
        ActionListener listener1 = new ClickListener();
        ActionListener listener2 = new ClickListener();
        ActionListener listener3 = new ClickListener();
        ActionListener listener4 = new ClickListener();
        ActionListener listener5 = new ClickListener();
        ActionListener listener6 = new ClickListener();
        ActionListener listener7 = new ClickListener();
        ActionListener listener8 = new ClickListener();
        ActionListener listener9 = new ClickListener();
        topLeft.addActionListener(listener1);
        top.addActionListener(listener2);
        topRight.addActionListener(listener3);
        midLeft.addActionListener(listener4);
        middle.addActionListener(listener5);
        midRight.addActionListener(listener6);
        bottomLeft.addActionListener(listener7);
        bottom.addActionListener(listener8);
        bottomRight.addActionListener(listener9);
        
        printBoard(frame);
    }
//Checks to see if 3 in a row
    static void checkWinner(JLabel label) {
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
            	label.setText("Congratulations! X's have won! Thanks for playing.");
                label.setFont(new Font("Arial", Font.PLAIN, 40));
                return;
            } else if (line.equals("OOO")) {
            	label.setText("Congratulations! O's have won! Thanks for playing.");
                label.setFont(new Font("Arial", Font.PLAIN, 40));
                return;
            }
        }

        for (int a = 0; a < 9; a++) {
            if (Arrays.asList(board).contains(String.valueOf(a+1))) {
                break;
            }
            else if (a == 8) 
            {
            	label.setText("It's a draw! Thanks for playing.");
                label.setFont(new Font("Arial", Font.PLAIN, 40));
                return;
            }
        }
        label.setText(turn + "'s turn; choose a button to place " + turn + " in.");
        label.setFont(new Font("Arial", Font.PLAIN, 40));
    }
//Creates a more user friendly Board GUI
    static void printBoard(JFrame frame) {
    	frame.setExtendedState(JFrame.MAXIMIZED_BOTH);    	
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
//Populates board with values
    static void populateEmptyBoard() {
        for (int a = 0; a < 9; a++) {
            board[a] = String.valueOf(a+1);
        }
    }
}
