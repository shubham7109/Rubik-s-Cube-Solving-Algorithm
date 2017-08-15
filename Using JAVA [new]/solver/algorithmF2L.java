package solver;

public class algorithmF2L {
	
	public static void F2L() {
		
		while (checkF2L()== 1)
		{
			// If left of green is solved with White 
			if (stateOfCube.G[0][0] <20)
			{
				// Left is Green and Orange
				if (stateOfCube.R[0][2] == 59 && stateOfCube.Y[2][0] == 37 && stateOfCube.R[0][1] == 56 && stateOfCube.Y[1][0] == 34)
				{
					MainController.showStatus();
					moveUpper.moveU();
					moveUpper.moveU();
					moveFrontInv.moveFi();
					moveUpper.moveU();
					moveFront.moveF();
					MainController.showStatus();
				}
				
				// Left is Blue and Red
				if (stateOfCube.R[0][2] == 49 && stateOfCube.Y[2][0] == 27 && stateOfCube.R[0][1] == 46 && stateOfCube.Y[1][0] == 24)
				{
					MainController.showStatus();
					moveBackInv.moveBi();
					moveUpper.moveU();
					moveBack.moveB();
					MainController.showStatus();
				}
				
				// Left is Red and Green
				if ( stateOfCube.R[0][2] == 29 && stateOfCube.Y[2][0] == 57 && stateOfCube.R[0][1] == 26 && stateOfCube.Y[1][0] == 54)
				{
					MainController.showStatus();
					moveUpperInv.moveUi();
					moveLeftInv.moveLi();
					moveUpper.moveU();
					moveLeft.moveL();
					MainController.showStatus();
				}
				
				// Left is Orange and Blue
				if ( stateOfCube.R[0][2] == 39 && stateOfCube.Y[2][0] == 47 && stateOfCube.R[0][1] == 36 && stateOfCube.Y[1][0] == 44)
				{
					MainController.showStatus();
					moveUpper.moveU();
					moveRightInv.moveRi();
					moveUpper.moveU();
					moveRight.moveR();
					MainController.showStatus();
				}
				
				
			}
			
			// When the Right side of Green is solved with White 
			if ( stateOfCube.G[0][2] < 20)
			{
				// Right is Green and Red
				if ( stateOfCube.O[0][0] == 57 && stateOfCube.Y[2][2] == 29 && stateOfCube.O[0][1] == 54 && stateOfCube.Y[1][2] == 26)
				{
					MainController.showStatus();
					moveUpperInv.moveUi();
					moveFront.moveF();
					moveUpper.moveU();
					moveUpper.moveU();
					moveFrontInv.moveFi();
					MainController.showStatus();
				}
				
				// Right is Blue and Orange
				if ( stateOfCube.O[0][0] == 47 && stateOfCube.Y[2][2] == 39 && stateOfCube.O[0][1] == 44 && stateOfCube.Y[1][2] == 36 )
				{
					moveBack.moveB();
					moveUpperInv.moveUi();
					moveBackInv.moveBi();
				}
				
				// Right is Orange and Green
				if ( stateOfCube.O[0][0] == 37 && stateOfCube.Y[2][2] == 59 && stateOfCube.O[0][1] == 34 && stateOfCube.Y[1][2] == 56 )
				{
					MainController.showStatus();
					moveUpper.moveU();
					moveRight.moveR();
					moveUpperInv.moveUi();
					moveRightInv.moveRi();
					MainController.showStatus();
				}
				
				// Right is Red and Blue
				if ( stateOfCube.O[0][0] == 27 && stateOfCube.Y[2][2] == 49 && stateOfCube.O[0][1] == 24 && stateOfCube.Y[1][2] == 46 )
				{
					MainController.showStatus();
					moveUpperInv.moveUi();
					moveLeft.moveL();
					moveUpperInv.moveUi();
					moveLeftInv.moveLi();
					MainController.showStatus();
				}
		
			}
			
			  // METHOD 1 :	[ top colors are opposite]
			
			// At G[0][0] is White
			
		}
		
	}
	
	public static int checkF2L() {
		
		   if ( stateOfCube.W[0][1] == 12 && stateOfCube.W[1][0] == 14 && stateOfCube.W[2][1] == 18 && stateOfCube.W[1][2] == 16 && stateOfCube.G[2][1] == 58 && stateOfCube.R[2][1] == 28 && stateOfCube.B[2][1] == 48 && stateOfCube.O[2][1] == 38 && stateOfCube.W[0][0] == 11 && stateOfCube.W[0][2] == 13 && stateOfCube.W[2][0] == 17 && stateOfCube.W[2][2] == 19 && stateOfCube.G[2][2] == 59 && stateOfCube.R[2][2] == 29 && stateOfCube.B[2][2] == 49 && stateOfCube.O[2][2] == 39 && stateOfCube.G[2][0] == 57 && stateOfCube.R[2][0] == 27 && stateOfCube.B[2][0] == 47 && stateOfCube.O[2][0] == 37 && stateOfCube.G[1][0] == 54 && stateOfCube.G[1][2] == 56 && stateOfCube.R[1][0] == 24 && stateOfCube.R[1][2] == 26 && stateOfCube.B[1][0] == 44 && stateOfCube.B[1][2] == 46 && stateOfCube.O[1][0] == 34 && stateOfCube.O[1][2] == 36 )
		    {       
			   return 0;
		    }
		    
		   else
			    return 1;
		   
		    
	}

}
