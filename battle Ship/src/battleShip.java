import java.util.Scanner;
public class battleShip
	{
		static String[][] board = {{ "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""},};

		public static void main(String[] args)
			{
				intro();
				mainGame();
				//display();

			}
		public static void display(String[][] board)
			{
				System.out.println("    1    2    3    4    5    6 ");
				System.out.println("  -----------------------------");
				System.out.println("A | "+ board[0][0] +" | | "+ board[0][1] +" | | "+ board[0][2] +" | | "+ board[0][3] +" | | "+ board[0][4] +" | | "+ board[0][5] +" |");
				System.out.println("  -----------------------------");
				System.out.println("  -----------------------------");
				System.out.println("B | "+ board[1][0] +" | | "+ board[1][1] +" | | "+ board[1][2] +" | | "+ board[1][3] +" | | "+ board[1][4] +" | | "+ board[1][5] +" |");
				System.out.println("  -----------------------------");
				System.out.println("  -----------------------------");
				System.out.println("C | "+ board[2][0] +" | | "+ board[2][1] +" | | "+ board[2][2] +" | | "+ board[2][3] +" | | "+ board[2][4] +" | | "+ board[2][5] +" |");
				System.out.println("  -----------------------------");
				System.out.println("  -----------------------------");
				System.out.println("D | "+ board[3][0] +" | | "+ board[3][1] +" | | "+ board[3][2] +" | | "+ board[3][3] +" | | "+ board[3][4] +" | | "+ board[3][5] +" |");
				System.out.println("  -----------------------------");
				System.out.println("  -----------------------------");
				System.out.println("E | "+ board[4][0] +" | | "+ board[4][1] +" | | "+ board[4][2] +" | | "+ board[4][3] +" | | "+ board[4][4] +" | | "+ board[4][5] +" |");
				System.out.println("  -----------------------------");
				System.out.println("  -----------------------------");
				System.out.println("F | "+ board[5][0] +" | | "+ board[5][1] +" | | "+ board[5][2] +" | | "+ board[5][3] +" | | "+ board[5][4] +" | | "+ board[5][5] +" |");
				System.out.println("  -----------------------------");
			}
		public static void intro()
			{
				System.out.println("+----------------------------------------------------------+");
		        System.out.println("|  [o]  [o]    ===>  B A T T L E S H I P  <===   [o]  [o]  |");
		        System.out.println("+----------------------------------------------------------+");
		        System.out.println("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~|");
		        System.out.println("|                   ~ ~ ~ [|]___|___[|] ~                  |");
		        System.out.println("|                   \\\\_____o_o_o_o_____//                  |");
		        System.out.println("| ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~|");
		        System.out.println("+----------------------------------------------------------+");
			}
		public static void mainGame()
			{
				Scanner userIntInput = new Scanner(System.in);
				Scanner userStringInput = new Scanner(System.in);
				System.out.println("");
				System.out.println("(1) START GAME");
				System.out.println("(2) QUIT");
				int startGame = userIntInput.nextInt();
				if (startGame == 1)
					{
						System.out.println("Select what board you would like...");
						System.out.println("(1)");
						System.out.println("(2)");
						System.out.println("(3)");
						int selectBoard = userIntInput.nextInt();
						int guesses = 0;
						int hitCounter = 0;
						boolean playing = true;
						while (playing)
						{

							if (selectBoard == 1)
								{
									display(BoardList.board1);
									
									display(BoardList.board1e);
									System.out.println("Guess what letter row then after number colume the ship is!");
									System.out.println("Guesses: "+ guesses );
									String guess = userStringInput.nextLine().toUpperCase();
									int row = guess.charAt(0) - 'A';
									int col = Character.getNumericValue(guess.charAt(1)) - 1;
									if(BoardList.board1[row][col].equals("X"))
										{
											System.out.println("HIT");
											BoardList.board1e[row][col] = "X";
											display(BoardList.board1e);
											guesses++;
											hitCounter++;
										}
									
									else if(BoardList.board1[row][col].equals(" "))
										{
											System.out.println("Miss");
											BoardList.board1e[row][col] = "O";
											display(BoardList.board1e);
											guesses++;
										}
									else 
										{
											System.out.println("INVALID! Please re input your guess!");
										}
									
								}
							else if (selectBoard == 2)
								{
									//display(BoardList.board2);
									
									display(BoardList.board2e);
									System.out.println("Guess what letter row then after number colume the ship is!");
									System.out.println("Guesses: "+ guesses );
									String guess = userStringInput.nextLine().toUpperCase();
									int row = guess.charAt(0) - 'A';
									int col = Character.getNumericValue(guess.charAt(1)) - 1;
									if(BoardList.board1[row][col].equals("X"))
										{
											System.out.println("HIT");
											BoardList.board2e[row][col] = "X";
											display(BoardList.board2e);
											guesses++;
											hitCounter++;
										}
									
									else if(BoardList.board1[row][col].equals(" "))
										{
											System.out.println("Miss");
											BoardList.board2e[row][col] = "O";
											display(BoardList.board2e);
											guesses++;
										}
									else 
										{
											System.out.println("INVALID! Please re input your guess!");
										}
									
								}
							else if (selectBoard == 3)
								{
									//display(BoardList.board3);
									
									display(BoardList.board3e);
									System.out.println("Guess what letter row then after number colume the ship is!");
									System.out.println("Guesses: "+ guesses );
									String guess = userStringInput.nextLine().toUpperCase();
									int row = guess.charAt(0) - 'A';
									int col = Character.getNumericValue(guess.charAt(1)) - 1;
									if(BoardList.board1[row][col].equals("X"))
										{
											System.out.println("HIT");
											BoardList.board3e[row][col] = "X";
											display(BoardList.board3e);
											guesses++;
											hitCounter++;
										}
									
									else if(BoardList.board1[row][col].equals(" "))
										{
											System.out.println("Miss");
											BoardList.board3e[row][col] = "O";
											display(BoardList.board3e);
											guesses++;
										}
									else 
										{
											System.out.println("INVALID! Please re input your guess!");
										}
								}
							
							
						}
						if(guesses == 36 || hitCounter == 9)
						{
							System.out.println("YOU WIN!");
							playing = false;
						}
					}
			}
	}
