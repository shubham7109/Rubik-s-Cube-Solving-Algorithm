package solver;

public class moveDown {

	public static void moveD()
	{
		
		MainController.listOfMoves('D');
		
		int temp1, temp2;
	    
	    // For [2][2] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[2][2] ;
	    stateOfCube.G[2][2] = stateOfCube.R[2][2];
	    temp2 = stateOfCube.O[2][2];
	    stateOfCube.O[2][2] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[2][2];
	    stateOfCube.B[2][2] = temp2;    // Temp2 is discarded
	    stateOfCube.R[2][2] = temp1;    // Temp1 is discarded
	    
	    // For [2][1] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[2][1] ;
	    stateOfCube.G[2][1] = stateOfCube.R[2][1] ;
	    temp2 = stateOfCube.O[2][1];
	    stateOfCube.O[2][1] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[2][1];
	    stateOfCube.B[2][1] = temp2;    // Temp2 is discarded
	    stateOfCube.R[2][1] = temp1;    // Temp1 is discarded
	    
	    // For [2][0] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[2][0] ;
	    stateOfCube.G[2][0] = stateOfCube.R[2][0] ;
	    temp2 = stateOfCube.O[2][0];
	    stateOfCube.O[2][0] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[2][0];
	    stateOfCube.B[2][0] = temp2;    // Temp2 is discarded
	    stateOfCube.R[2][0] = temp1;    // Temp1 is discarded
	    
	    // For rotating W corners Clockwise
	    temp1 = stateOfCube.W[0][0];
	    stateOfCube.W[0][0] = stateOfCube.W[2][0];
	    temp2 = stateOfCube.W[0][2];
	    stateOfCube.W[0][2] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.W[2][2];
	    stateOfCube.W[2][2] = temp2;    // Temp2 is discarded
	    stateOfCube.W[2][0] = temp1;     // Temp1 is discarded


	    // For rotating W edges Clockwise
	    temp1 = stateOfCube.W[1][0];
	    stateOfCube.W[1][0] = stateOfCube.W[2][1];
	    temp2 = stateOfCube.W[0][1];
	    stateOfCube.W[0][1] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.W[1][2];
	    stateOfCube.W[1][2] = temp2;    // Temp2 is discarded
	    stateOfCube.W[2][1] = temp1;     // Temp1 is discarded
	   
	}
}
