package solver;

public class moveRight {

	public static void moveR()
	{
		
		MainController.listOfMoves('R');
		
		int[] temp = new int[6];

	    // For moving cells onto Green Face and others respectively
	    temp[0] = stateOfCube.G[0][2];
	    temp[1] = stateOfCube.G[1][2];
	    temp[2] = stateOfCube.G[2][2];
	    stateOfCube.G[0][2] = stateOfCube.W[0][2];
	    stateOfCube.G[1][2] = stateOfCube.W[1][2];
	    stateOfCube.G[2][2] = stateOfCube.W[2][2];
	    temp[3] = stateOfCube.B[0][0];
	    temp[4] = stateOfCube.B[1][0];
	    temp[5] = stateOfCube.B[2][0];
	    stateOfCube.B[0][0] = stateOfCube.Y[2][2];
	    stateOfCube.B[1][0] = stateOfCube.Y[1][2];
	    stateOfCube.B[2][0] = stateOfCube.Y[0][2];
	    stateOfCube.W[0][2] = temp[5];  // Temp[0] is discarded
	    stateOfCube.W[1][2] = temp[4];  // Temp[1] is discarded
	    stateOfCube.W[2][2] = temp[3];  // Temp[2] is discarded
	    stateOfCube.Y[0][2] = temp[0];  // Temp[5] is discarded
	    stateOfCube.Y[1][2] = temp[1];  // Temp[4] is discarded
	    stateOfCube.Y[2][2] = temp[2];  // Temp[3] is discarded

	     // For rotating O corners Clockwise
	    temp[0] = stateOfCube.O[0][0];
	    stateOfCube.O[0][0] = stateOfCube.O[2][0];
	    temp[1] = stateOfCube.O[0][2];
	    stateOfCube.O[0][2] = temp[0];    // Temp[0] is discarded
	    temp[0] = stateOfCube.O[2][2];
	    stateOfCube.O[2][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.O[2][0] = temp[0];    // Temp1 is discarded


	    // For rotating O edges Clockwise
	    temp[0] = stateOfCube.O[1][0];
	    stateOfCube.O[1][0] = stateOfCube.O[2][1];
	    temp[1] = stateOfCube.O[0][1];
	    stateOfCube.O[0][1] = temp[0];    // Temp1 is discarded
	    temp[0] = stateOfCube.O[1][2];
	    stateOfCube.O[1][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.O[2][1] = temp[0];    // Temp1 is discarded
	}
}
