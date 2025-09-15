import java.util.Scanner;

public class TicTacToe2 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		boolean gameOver = false;

		String[] board = new String[9];
		int player = 1;
		boolean[] playedMoves = new boolean [9];
		fillBoard(board);
		drawBoard(board);

		while (!gameOver) {
			makeMove(board, player, playedMoves);
			drawBoard(board);
			player = player % 2 + 1;
		}

	}
	
	


	private static void makeMove(String[] board, int player, boolean [] playedMoves) {
		int move;
		String marker = "X";
		if (player == 2)
			marker = "O";
		
		
		do {
		     System.out.println("Player " + player + ", enter your move (0-8): ");
		        move = input.nextInt();

		        if (move < 0 || move > 8) {
		            System.out.println("Invalid move. Choose 0-8.");
		        } else if (playedMoves[move]) {
		            System.out.println("Move already played. Choose another spot.");
		        } else {
		            break; // valid move
		        }
			}
	
		while (true);
		
			board[move] = marker;
			playedMoves[move] = true;
	}
				
	
				
		

	

	

	private static void drawBoard(String[] board) {
		for (int rows = 0; rows < 9; rows++) {

			System.out.print(board[rows]);
			if (rows % 3 < 2)
				System.out.print("|");

			if (rows % 3 == 2) {
				System.out.println();

				System.out.println("_____");
			}

		}

	}

	private static void fillBoard(String[] board) {
		for (int rows = 0; rows < 9; rows++) {
			board[rows] = Integer.toString(rows);

		}

	}

}
