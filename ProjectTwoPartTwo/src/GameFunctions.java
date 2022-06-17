public class GameFunctions 
{
	public static final int BOARD_SIZE = 5;
	public final int row[] = { 2, 1, -1, -2, -2, -1, 1, 2 , 2 };
	public final int col[] = { 1, 2, 2, 1, -1, -2, -2, -1, 1 };
	public int completioncounter = 0;
	
	private boolean isValid(int x, int y)
	{
		   //setting boundries so knight cant move out of bounds
	       if (x < 0 || y < 0 || x >= BOARD_SIZE || y >= BOARD_SIZE)
	           return false;
	       //if knight is not going out of bounds return true
	       return true;
	}
	
	private void print(int[][] visited)
	{
		for (int i = 0; i < BOARD_SIZE; i++)
	    {
			for (int j = 0; j < BOARD_SIZE; j++)
			{
				System.out.print(visited[i][j] + " ");
	        }
	        System.out.println();
	    }
	    System.out.println();
	}
	
	// Recursive function to perform the Knight's tour using backtracking
	public void knightTour(int visited[][], int x, int y, int currentSquare)
	{
	     // mark current square as visited
		visited[x][y] = currentSquare;

	    // if all squares are visited, print the solution
	    if (currentSquare >= BOARD_SIZE * BOARD_SIZE && completioncounter != 1)
	    {
	    	print(visited);
	    	completioncounter++;
	        // backtrack before returning
	        visited[x][y] = 0;
	        return;
	    }

	     // check for all 8 possible movements for a knight
	     // and recur for each valid movement
	    for (int k = 0; k < 8; k++)
	    {
	    	// Get the new position of Knight from current
	    	// position on chessboard
	        int newX = x + row[k];
	        int newY = y + col[k];

	        // if new position is a valid and not visited yet
	        if (isValid(newX, newY) && visited[newX][newY] == 0)
	        {
	        	knightTour(visited, newX, newY, currentSquare + 1);
	        }
	    }
	       // backtrack from current square and remove it from current path
	       visited[x][y] = 0;
	}
	//does not alow program to output multiple solutions

}
