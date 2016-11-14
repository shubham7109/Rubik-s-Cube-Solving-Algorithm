package solver;

public class moveBackInv {

	public static void moveBi()
	{
	
		MainController.listOfMoves('b');
		
		int[] temp = new int[6];

	    // For moving cells onto Yellow Face and others respectively
	    temp[0] = stateOfCube.Y[0][0];
	    temp[1] = stateOfCube.Y[0][1];
	    temp[2] = stateOfCube.Y[0][2];
	    stateOfCube.Y[0][0] = stateOfCube.R[2][0];
	    stateOfCube.Y[0][1] = stateOfCube.R[1][0];
	    stateOfCube.Y[0][2] = stateOfCube.R[0][0];
	    temp[3] = stateOfCube.W[2][0];
	    temp[4] = stateOfCube.W[2][1];
	    temp[5] = stateOfCube.W[2][2];
	    stateOfCube.W[2][0] = stateOfCube.O[2][2];
	    stateOfCube.W[2][1] = stateOfCube.O[1][2];
	    stateOfCube.W[2][2] = stateOfCube.O[0][2];
	    stateOfCube.O[0][2] = temp[0];    // Temp[0] is discarded
	    stateOfCube.O[1][2] = temp[1];    // Temp[1] is discarded
	    stateOfCube.O[2][2] = temp[2];    // Temp[2] is discarded
	    stateOfCube.R[0][0] = temp[3];    // Temp[3] is discarded
	    stateOfCube.R[1][0] = temp[4];    // Temp[4] is discarded
	    stateOfCube.R[2][0] = temp[5];    // Temp[5] is discarded
	    
	    // For rotating B corners antiClockwise
	    temp[0] = stateOfCube.B[0][0];
	    stateOfCube.B[0][0] = stateOfCube.B[0][2];
	    temp[1] = stateOfCube.B[2][0];
	    stateOfCube.B[2][0] = temp[0];    // Temp[0] is discarded
	    temp[0] = stateOfCube.B[2][2];
	    stateOfCube.B[2][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.B[0][2] = temp[0];    // Temp1 is discarded


	    // For rotating B edges antiClockwise
	    temp[0] = stateOfCube.B[1][0];
	    stateOfCube.B[1][0] = stateOfCube.B[0][1];
	    temp[1] = stateOfCube.B[2][1];
	    stateOfCube.B[2][1] = temp[0];    // Temp1 is discarded
	    temp[0] = stateOfCube.B[1][2];
	    stateOfCube.B[1][2] = temp[1];    // Temp2 is discarded
	    stateOfCube.B[0][1] = temp[0];    // Temp1 is discarded
	    
	    
	    
	}
}
