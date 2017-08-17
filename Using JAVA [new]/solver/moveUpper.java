package solver;
	
public class moveUpper {
	
	public static void moveU() {
		 
		MainController.listOfMoves(1);
		
		int temp1, temp2 ;

	    // For [0][2] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[0][2] ;
	    stateOfCube.G[0][2] = stateOfCube.O[0][2] ;
	    temp2 = stateOfCube.R[0][2];
	    stateOfCube.R[0][2] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[0][2];
	    stateOfCube.B[0][2] = temp2;    // Temp2 is discarded
	    stateOfCube.O[0][2] = temp1;    // Temp1 is discarded

	    // For [0][1] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[0][1] ;
	    stateOfCube.G[0][1] = stateOfCube.O[0][1] ;
	    temp2 = stateOfCube.R[0][1];
	    stateOfCube.R[0][1] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[0][1];
	    stateOfCube.B[0][1] = temp2;    // Temp2 is discarded
	    stateOfCube.O[0][1] = temp1;    // Temp1 is discarded

	    // For [0][0] Cell of G,R,B & O
	    temp1 =  stateOfCube.G[0][0] ;
	    stateOfCube.G[0][0] = stateOfCube.O[0][0] ;
	    temp2 = stateOfCube.R[0][0];
	    stateOfCube.R[0][0] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.B[0][0];
	    stateOfCube.B[0][0] = temp2;    // Temp2 is discarded
	    stateOfCube.O[0][0] = temp1;    // Temp1 is discarded

	    // For rotating Y corners Clockwise
	    temp1 = stateOfCube.Y[0][0];
	    stateOfCube.Y[0][0] = stateOfCube.Y[2][0];
	    temp2 = stateOfCube.Y[0][2];
	    stateOfCube.Y[0][2] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.Y[2][2];
	    stateOfCube.Y[2][2] = temp2;    // Temp2 is discarded
	    stateOfCube.Y[2][0] = temp1;     // Temp1 is discarded


	    // For rotating Y edges Clockwise
	    temp1 = stateOfCube.Y[1][0];
	    stateOfCube.Y[1][0] = stateOfCube.Y[2][1];
	    temp2 = stateOfCube.Y[0][1];
	    stateOfCube.Y[0][1] = temp1;    // Temp1 is discarded
	    temp1 = stateOfCube.Y[1][2];
	    stateOfCube.Y[1][2] = temp2;    // Temp2 is discarded
	    stateOfCube.Y[2][1] = temp1;     // Temp1 is discarded
	}
}
