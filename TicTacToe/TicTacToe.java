package TicTacToe;

import java.io.IOException;
import java.util.Arrays;


public class TicTacToe {

	static String[][] grid = new String[3][3];
	static boolean isPlay = true ;
	
	
	public static void main(String[] args) throws IOException{
		
		 
		creatGrid();
		 
		
		playGame();
		 
		  
		

	}
	
	public static void creatGrid() {
		int count = 1;
		for (int i = 0; i < grid.length; i++) {
			
			for (int j = 0; j < grid.length; j++) {
				 grid[i][j] = "[" + count + "]" ;
				 count++;
			}
		 }
	}
	
	public static void playGame() throws IOException{
		
		while(isPlay) {
			Player p1 = new Player("Stepan", "X");
		    Player p2 = new Player("Petr", "O");
			 
			  
		    p1.chooseChamber();
			checkGrid(p1); 
		    	if(!isPlay) break;
			
			p2.chooseChamber();
			checkGrid(p2);
				if(!isPlay) break;
		}
	}
				
	public static void showGrid() {
		System.out.println();
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print(" " + grid[i][j] + " ");
			}
		   System.out.println();
		}
	  
		System.out.println();
	 
	}
	
	public static void checkGrid(Player player) {
		
		 
				
		int count = 0;
			
			for (int i = 0; i < grid.length; i++) {
				String horLine = "";
				String vertLine = "";
				
				String crossLineL = "";
				String crossLineR = "";
			
				for (int j = 0; j < grid[i].length; j++) {
					horLine = grid[i][j] + horLine;
					vertLine =  grid[j][i] + vertLine;

					crossLineL = grid[j][j] + crossLineL;
				    crossLineR = grid[j][2 - j] + crossLineR; 
				    
				    count++;
				}
				
				checkLine(player, horLine);
				checkLine(player, vertLine);
				
				checkLine(player, crossLineR);
				checkLine(player, crossLineL);
				 
			}
			
			 
		 
		
		 
	}
	
	public static void checkLine(Player player, String line) {
		String winLineX = "[X][X][X]";
		String winLineO = "[O][O][O]";
		
		if (line.equals(winLineX) ) {
			isPlay = false;
			System.out.println("The winner is " + player.name);
		}
		
		if (line.equals(winLineO) ) {
			isPlay = false;
			System.out.println("The winner isa " + player.name);
		}
		 
	}
	
	public static boolean isChamberAvaliable(String ticOrTac, int vert, int hor) { // check if the cell is available 
		
		if(!("[X]".equals( grid[ vert  ][ hor - 1 ] ) || "[O]".equals( grid[ vert ][ hor - 1 ] ))  ) {   
			TicTacToe.grid[ vert ][ hor - 1 ] = "[" + ticOrTac + "]";
			
			return true;
		}
		
		return false;
	}
}
