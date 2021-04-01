package TicTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Player {
    String name;
    String ticOrTac;
	
	
	Random ran = new Random(); 

	public Player(String name, String ticOrTac) {
		this.name = name;
		
		if("X".equals(ticOrTac)) 
			this.ticOrTac = ticOrTac;
		
		else if("O".equals(ticOrTac)) 
			this.ticOrTac = ticOrTac;
		
	}
	
	public void chooseChamber( ) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean isPassed = false;
		
		while(!isPassed) {
			System.out.println("Player " + name + " choose your cell between 1 and 9 inclusively ");
			
			int input = Integer.parseInt(reader.readLine());
				if(input > 0 && input < 10 ) {
					  isPassed = setChamber(input);
					 
				}
			 
		}
	
		
		System.out.println("The player " + name + " chose grid" );
		TicTacToe.showGrid();
	}
	 
	public  boolean setChamber(int cell) {
		int vert = 0;
		int hor = 0;
		
		if(cell >= 1 && cell <= 3) {
			vert = 0;
			hor = cell ;
			
			return TicTacToe.isChamberAvaliable(ticOrTac, vert, hor);
		}
		
	    if(cell >= 4 && cell <= 6) {
			vert = 1;
			hor = cell - 3 ;
			
			return TicTacToe.isChamberAvaliable(ticOrTac, vert, hor);
	    }
			
		if(cell >= 7 && cell <= 9){
			vert = 2;
			hor = cell - 6 ;
			
			return TicTacToe.isChamberAvaliable(ticOrTac, vert, hor);
		
		}	
		 
		return false;
	}
	
  
}
