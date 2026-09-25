import java.util.Scanner;
public class battleShip
	{
		static String[][] board = {{ "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""}, { "", "", "", "", "", ""},};

		public static void main(String[] args)
			{
				display();

			}
		public static void display()
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

	}
