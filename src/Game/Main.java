package Game;

import javax.swing.JOptionPane;

public class Main {
	public static boolean playerTurn = true;
	public static boolean playerWon = false;
	public static boolean computerWon = false;
	public static tictactoe board = new tictactoe();

	public static void main(String[] args) {
		if (board.isVisible()== false) {
			board.setVisible(true);
		}

	}
	public static void checkforWin() {
		if(board.button1.getText().equals("X")) {
			if(board.button2.getText().equals("X")) {
				if(board.button3.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button1.getText().equals("X")) {
			if(board.button4.getText().equals("X")) {
				if(board.button7.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button1.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button4.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button6.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button7.getText().equals("X")) {
			if(board.button8.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button2.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button8.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button3.getText().equals("X")) {
			if(board.button6.getText().equals("X")) {
				if(board.button9.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button3.getText().equals("X")) {
			if(board.button5.getText().equals("X")) {
				if(board.button7.getText().equals("X")) {
					playerWon=true;
					computerWon=false;
					JOptionPane.showMessageDialog(board, "Player X Win");
				}
			}
		}
		if(board.button1.getText().equals("O")) {
			if(board.button2.getText().equals("O")) {
				if(board.button3.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button1.getText().equals("O")) {
			if(board.button4.getText().equals("O")) {
				if(board.button7.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button1.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button4.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button6.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button7.getText().equals("O")) {
			if(board.button8.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button2.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button8.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button3.getText().equals("O")) {
			if(board.button6.getText().equals("O")) {
				if(board.button9.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		if(board.button3.getText().equals("O")) {
			if(board.button5.getText().equals("O")) {
				if(board.button7.getText().equals("O")) {
					playerWon=false;
					computerWon=true;
					JOptionPane.showMessageDialog(board, "Player O Win");
				}
			}
		}
		
	}

}
