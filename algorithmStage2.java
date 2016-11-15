package solver;

public class algorithmStage2 {

	public static void stage2()
	{
		while ( algorithmStage2.checkStage2() == 1 )
	    {
			
	        moveUpper.moveU();
	        
	        if ( stateOfCube.W[0][0] < 20 && stateOfCube.W[0][2] < 20 && stateOfCube.W[2][0] < 20 && stateOfCube.W[2][2] < 20 )
	        {
	            if ( stateOfCube.O[2][2] != 39 )
	            {
	                moveFront.moveF();
	                moveUpper.moveU();
	                moveFrontInv.moveFi();
	            }
	            
	            if ( stateOfCube.G[2][2] != 59)
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	            }
	            
	            if ( stateOfCube.R[2][2] != 29 )
	            {
	                moveFront.moveF();
	                moveUpper.moveU();
	                moveFrontInv.moveFi();
	            }
	            
	            if ( stateOfCube.B[2][2] != 49 )
	            {
	                moveLeft.moveL();
	                moveUpper.moveU();
	                moveLeftInv.moveLi();
	            }
	        }
	
	        if ( stateOfCube.G[0][2] < 20 )
	        { 
	            if ( stateOfCube.Y[2][2] == 29 && stateOfCube.O[0][0] == 57 )
	            {
	                moveUpper.moveU();
	                moveLeftInv.moveLi();
	                moveUpperInv.moveUi();
	                moveLeft.moveL();
	            }
	            
	            if ( stateOfCube.Y[2][2] == 59 && stateOfCube.O[0][0] == 37 )
	            {
	                moveUpper.moveU();
	                moveRight.moveR();
	                moveUpperInv.moveUi();
	                moveRightInv.moveRi();               
	            }
	            
	            if ( stateOfCube.Y[2][2] == 39 && stateOfCube.O[0][0] == 47 )
	            {
	                moveBack.moveB();
	                moveUpperInv.moveUi();
	                moveBackInv.moveBi();
	            }
	            
	            if ( stateOfCube.Y[2][2] == 49 && stateOfCube.O[0][0] == 27 )
	            {
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveBackInv.moveBi();
	                moveUpperInv.moveUi();
	                moveBack.moveB();
	            }
	        }
	
	        if ( stateOfCube.G[0][0] < 20 )
	        {
	                if ( stateOfCube.Y[2][0] == 57 && stateOfCube.R[0][2] == 29 )
	                {
	                    moveFront.moveF();
	                    moveUpper.moveU();
	                    moveFrontInv.moveFi();
	                }
	                
	                if ( stateOfCube.Y[2][0] == 37 && stateOfCube.R[0][2] == 59 )
	                {
	                    moveUpperInv.moveUi();
	                    moveRight.moveR();
	                    moveUpper.moveU();
	                    moveRightInv.moveRi();
	                }
	                
	                if ( stateOfCube.Y[2][0] == 47 && stateOfCube.R[0][2] == 39 )
	                {
	                    moveUpper.moveU();
	                    moveRightInv.moveRi();
	                    moveUpper.moveU();
	                    moveRight.moveR();
	                }
	                
	                if ( stateOfCube.Y[2][0] == 27 && stateOfCube.R[0][2] == 49 )
	                {
	                    moveUpper.moveU();
	                    moveLeft.moveL();
	                    moveUpper.moveU();
	                    moveLeftInv.moveLi();
	                }
	        }
	
	        if ( stateOfCube.Y[2][2] < 20 )
	        {
	            if ( stateOfCube.G[0][2] == 37 && stateOfCube.O[0][0] == 59 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	                moveUpperInv.moveUi();
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	            }
	            
	            if ( stateOfCube.G[0][2] == 57 && stateOfCube.O[0][0] == 29 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	                moveFront.moveF();
	                moveUpper.moveU();
	                moveFrontInv.moveFi();
	            }
	            
	            if ( stateOfCube.G[0][2] == 47 && stateOfCube.O[0][0] == 39 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveBack.moveB();
	                moveUpper.moveU();
	                moveBackInv.moveBi();
	            }
	            
	            if ( stateOfCube.G[0][2] == 27 && stateOfCube.O[0][0] == 49 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	                moveBackInv.moveBi();
	                moveUpper.moveU();
	                moveBack.moveB();
	            }
	        }
	
	            if ( stateOfCube.G[2][2] < 20 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	            }
	            
	            if ( stateOfCube.G[2][0] < 20 )
	            {
	                moveLeftInv.moveLi();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveLeft.moveL();
	            }
	            
	            if ( stateOfCube.R[2][2] < 20 )
	            {
	                moveFront.moveF();
	                moveUpper.moveU();
	                moveFrontInv.moveFi();
	            }
	            
	            if ( stateOfCube.R[2][0] < 20 )
	            {
	                moveBackInv.moveBi();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveBack.moveB();
	            }
	            
	            if ( stateOfCube.B[2][2] < 20 )
	            {
	                moveLeft.moveL();
	                moveUpper.moveU();
	                moveLeftInv.moveLi();
	            }
	            
	            if ( stateOfCube.B[2][0] < 20 )
	            {
	                moveRightInv.moveRi();
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveRight.moveR();
	            }
	            
	            if ( stateOfCube.O[2][2] < 20 )
	            {
	                moveBack.moveB();
	                moveUpper.moveU();
	                moveBackInv.moveBi();
	            }
	            
	            if ( stateOfCube.O[2][0] < 20 )
	            {
	                moveRight.moveR();
	                moveUpper.moveU();
	                moveRightInv.moveRi();
	            }
	    }
	}

	public static int checkStage2()
	{
		if ( stateOfCube.W[0][1] == 12 && stateOfCube.W[1][0] == 14 && stateOfCube.W[2][1] == 18 && stateOfCube.W[1][2] == 16 && stateOfCube.G[2][1] == 58 && stateOfCube.R[2][1] == 28 && stateOfCube.B[2][1] == 48 && stateOfCube.O[2][1] == 38 && stateOfCube.W[0][0] == 11 && stateOfCube.W[0][2] == 13 && stateOfCube.W[2][0] == 17 && stateOfCube.W[2][2] == 19 && stateOfCube.G[2][2] == 59 && stateOfCube.R[2][2] == 29 && stateOfCube.B[2][2] == 49 && stateOfCube.O[2][2] == 39 && stateOfCube.G[2][0] == 57 && stateOfCube.R[2][0] == 27 && stateOfCube.B[2][0] == 47 && stateOfCube.O[2][0] == 37 )
		{      
            return 0;
		}
    
		else
			return 1;
	}
}
