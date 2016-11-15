package solver;

public class moveLeft {

	public static void moveL()
	{
		
		MainController.listOfMoves(5);
		
		int[] temp = new int[6];

	    // For moving cells onto Green Face and others respectively
	    temp[0] = stateOfCube.G[0][0];
	    temp[1] = stateOfCube.G[1][0];
	    temp[2] = stateOfCube.G[2][0];
	    stateOfCube.G[0][0] = stateOfCube.Y[0][0];
	    stateOfCube.G[1][0] = stateOfCube.Y[1][0];
	    stateOfCube.G[2][0] = stateOfCube.Y[2][0];
	    temp[3] = stateOfCube.B[0][2];
	    temp[4] = stateOfCube.B[1][2];
	    temp[5] = stateOfCube.B[2][2];
	    stateOfCube.B[0][2] = stateOfCube.W[2][0];
	    stateOfCube.B[1][2] = stateOfCube.W[1][0];
	    stateOfCube.B[2][2] = stateOfCube.W[0][0];
	    stateOfCube.W[0][0] = temp[0];  // Temp[0] is discarded
	    stateOfCube.W[1][0] = temp[1];  // Temp[1] is discarded
	    stateOfCube.W[2][0] = temp[2];  // Temp[2] is discarded
	    stateOfCube.Y[0][0] = temp[5];  // Temp[5] is discarded
	    stateOfCube.Y[1][0] = temp[4];  // Temp[4] is discarded
	    stateOfCube.Y[2][0] = temp[3];  // Temp[3] is discarded

	     // For rotating R corners Clockwise
	    temp[0] = stateOfCube.R[0][0];
	    stateOfCube.R[0][0] = stateOfCube.R[2][0];
	    temp[1] = stateOfCube.R[0][2];
	    stateOfCube.R[0][2] = temp[0];    // Temp[0] is discarded
	    temp[0] = stateOfCube.R[2][2];
	    stateOfCube.R[2][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.R[2][0] = temp[0];    // Temp1 is discarded


	    // For rotating R edges Clockwise
	    temp[0] = stateOfCube.R[1][0];
	    stateOfCube.R[1][0] = stateOfCube.R[2][1];
	    temp[1] = stateOfCube.R[0][1];
	    stateOfCube.R[0][1] = temp[0];    // Temp1 is discarded
	    temp[0] = stateOfCube.R[1][2];
	    stateOfCube.R[1][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.R[2][1] = temp[0];    // Temp1 is discarded

	}
}
