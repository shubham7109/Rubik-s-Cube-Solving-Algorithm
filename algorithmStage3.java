package solver;

public class algorithmStage3 {

	public static void stage3()
	{
		while ( algorithmStage3.checkStage3() == 1)
	    {

	        if ( ( stateOfCube.Y[2][1] > 60 || stateOfCube.G[0][1] > 60 ) && ( stateOfCube.Y[1][0] > 60 || stateOfCube.R[0][1] > 60 ) && ( stateOfCube.Y[0][1] > 60 || stateOfCube.B[0][1] > 60 ) && ( stateOfCube.Y[1][2] > 60 || stateOfCube.O[0][1] > 60 ) )
	        {
	            if ( stateOfCube.G[1][0] != 54 )
	            {
	                moveUpperInv.moveUi();
	                moveLeftInv.moveLi();
	                moveUpper.moveU();
	                moveLeft.moveL();
	                moveUpper.moveU();
	                moveFront.moveF();
	                moveUpperInv.moveUi();
	                moveFrontInv.moveFi();   
	            }

	            if ( stateOfCube.R[1][0] != 24 )
	            {
	                moveBackInv.moveBi();
	                moveUpper.moveU();
	                moveBack.moveB();
	                moveUpper.moveU();
	                moveLeft.moveL();
	                moveUpperInv.moveUi();
	                moveLeftInv.moveLi();
	            }

	            if ( stateOfCube.B[1][0] != 44 )
	            {
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	                moveUpper.moveU();
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveBack.moveB();
	                moveUpperInv.moveUi();
	                moveBackInv.moveBi();
	            }

	            if ( stateOfCube.O[1][0] != 34 )
	            {
	                moveUpperInv.moveUi();
	                moveUpperInv.moveUi();
	                moveFrontInv.moveFi();
	                moveUpper.moveU();
	                moveFront.moveF();
	                moveUpper.moveU();
	                moveRight.moveR();
	                moveUpperInv.moveUi();
	                moveRightInv.moveRi();
	            }
	        }

	        if ( stateOfCube.G[0][1] == 34 && stateOfCube.Y[2][1] == 56 )
	        {
	            moveUpper.moveU();
	            moveUpper.moveU();
	            moveFrontInv.moveFi();
	            moveUpper.moveU();
	            moveFront.moveF();
	            moveUpper.moveU();

	            moveRight.moveR();
	            moveUpperInv.moveUi();
	            moveRightInv.moveRi();
	        }

	         if ( stateOfCube.G[0][1] == 56 && stateOfCube.Y[2][1] == 34 )
	         {
	            moveUpper.moveU();
	            moveRight.moveR();
	            moveUpperInv.moveUi();
	            moveRightInv.moveRi();
	            moveUpperInv.moveUi();
	            moveFrontInv.moveFi();
	            moveUpper.moveU();
	            moveFront.moveF();
	         }

	         if ( stateOfCube.G[0][1] == 26 && stateOfCube.Y[2][1] == 54)
	         {
	            moveUpper.moveU();
	            moveUpper.moveU();
	            moveFront.moveF();
	            moveUpperInv.moveUi();
	            moveFrontInv.moveFi();
	            moveUpperInv.moveUi();
	            moveLeftInv.moveLi();
	            moveUpper.moveU();
	            moveLeft.moveL();
	         }

	         if ( stateOfCube.G[0][1] == 54 && stateOfCube.Y[2][1] == 26 )
	         {
	            moveUpperInv.moveUi();
	            moveLeftInv.moveLi();
	            moveUpper.moveU();
	            moveLeft.moveL();
	            moveUpper.moveU();
	            moveFront.moveF();
	            moveUpperInv.moveUi();
	            moveFrontInv.moveFi();
	         }

	         if ( stateOfCube.G[0][1] == 46 && stateOfCube.Y[2][1] == 24 )
	         {
	            moveUpperInv.moveUi();
	            moveLeft.moveL();
	            moveUpperInv.moveUi();
	            moveLeftInv.moveLi();
	            moveUpperInv.moveUi();
	            moveBackInv.moveBi();
	            moveUpper.moveU();
	            moveBack.moveB();
	         }

	         if ( stateOfCube.G[0][1] == 24 && stateOfCube.Y[2][1] == 46 )
	         {
	            moveBackInv.moveBi();
	            moveUpper.moveU();
	            moveBack.moveB();
	            moveUpper.moveU();
	            moveLeft.moveL();
	            moveUpperInv.moveUi();
	            moveLeftInv.moveLi();
	         }

	         if ( stateOfCube.G[0][1] == 36 && stateOfCube.Y[2][1] == 44 )
	         {
	            moveBack.moveB();
	            moveUpperInv.moveUi();
	            moveBackInv.moveBi();
	            moveUpperInv.moveUi();
	            moveRightInv.moveRi();
	            moveUpper.moveU();
	            moveRight.moveR();
	         }

	         if ( stateOfCube.G[0][1] ==  44 && stateOfCube.Y[2][1] == 36 )
	         {
	            moveUpper.moveU();
	            moveRightInv.moveRi();
	            moveUpper.moveU();
	            moveRight.moveR();
	            moveUpper.moveU();
	            moveBack.moveB();
	            moveUpperInv.moveUi();
	            moveBackInv.moveBi();
	         }
	         moveUpper.moveU();
	    }
	}

	public static int checkStage3() {
		
		   if ( stateOfCube.W[0][1] == 12 && stateOfCube.W[1][0] == 14 && stateOfCube.W[2][1] == 18 && stateOfCube.W[1][2] == 16 && stateOfCube.G[2][1] == 58 && stateOfCube.R[2][1] == 28 && stateOfCube.B[2][1] == 48 && stateOfCube.O[2][1] == 38 && stateOfCube.W[0][0] == 11 && stateOfCube.W[0][2] == 13 && stateOfCube.W[2][0] == 17 && stateOfCube.W[2][2] == 19 && stateOfCube.G[2][2] == 59 && stateOfCube.R[2][2] == 29 && stateOfCube.B[2][2] == 49 && stateOfCube.O[2][2] == 39 && stateOfCube.G[2][0] == 57 && stateOfCube.R[2][0] == 27 && stateOfCube.B[2][0] == 47 && stateOfCube.O[2][0] == 37 && stateOfCube.G[1][0] == 54 && stateOfCube.G[1][2] == 56 && stateOfCube.R[1][0] == 24 && stateOfCube.R[1][2] == 26 && stateOfCube.B[1][0] == 44 && stateOfCube.B[1][2] == 46 && stateOfCube.O[1][0] == 34 && stateOfCube.O[1][2] == 36 )
		    {       
			   return 0;
		    }
		    
		   else
			    return 1;
		   
		    
	}
}
