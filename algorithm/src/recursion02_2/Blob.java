package recursion02_2;

public class Blob {
	private static int BACKGROUND_COLOR = 0;
	private static int IMAGE_COLOR = 1;
	private static int ALREADY_COUNTED = 2;
	private static int N;
	private static int [][] grid;
	public int countCells(int x, int y) {
		int result;
		if (x<0 || x>= N || y<0 || y>=N)
			return 0;
		else if (grid[x][y] != IMAGE_COLOR)
			return 0;
		else {
			grid[x][y] = ALREADY_COUNTED;
			return 1 + countCells(x-1, y+1) + countCells(x, y+1) + countCells(x+1, y+1) + countCells(x-1, y) + countCells(x+1, y) + countCells(x-1, y-1) +countCells(x, y-1) + countCells(x+1, y-1);
		}
	}
}
