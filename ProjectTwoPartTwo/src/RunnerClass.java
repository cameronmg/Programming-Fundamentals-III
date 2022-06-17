public class RunnerClass 
{
	static GameFunctions start = new GameFunctions();
	//creating board size
	private static final int BOARD_SIZE = 5;

	public static void main(String[] args) 
	{
		// visited[][] serves two purpose -
	       // 1. It keep track of squares involved the Knight's tour.
	       // 2. It stores the order in which the squares are visited
	       int visited[][] = new int[BOARD_SIZE][BOARD_SIZE];
	       int currentSquare = 1;

	       // start knight tour from corner square (0, 0)
	       start.knightTour(visited, 0, 0, currentSquare);

	}

}
