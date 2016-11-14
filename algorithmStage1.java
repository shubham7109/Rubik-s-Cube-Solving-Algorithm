package solver;

public class algorithmStage1 {
	
	public static void stage1()
	{

		int stay = 0;
		
	    while (algorithmStage1.checkStage1() == 1)
	    {
	
	            // Check if white has DUPLICATES
	        if ( stateOfCube.W[0][1] < 20 && stateOfCube.W[1][0] < 20 && stateOfCube.W[2][1] < 20 && stateOfCube.W[1][2] < 20 )
	        {
	                if ( stateOfCube.G[2][1] != 58 )
	                {
	                    moveFront.moveF();
	                    moveFront.moveF();
	                }
	                
	                if ( stateOfCube.R[2][1] != 28 )
	                {
	                    moveLeft.moveL();
	                    moveLeft.moveL();  
	                }
	                
	                if ( stateOfCube.B[2][1] != 48 )
	                {
	                    moveBack.moveB();
	                    moveBack.moveB(); 
	                }
	                
	                if ( stateOfCube.O[2][1] != 38 )
	                {
	                    moveRight.moveR();
	                    moveRight.moveR();
	                }
	                
	        }
	
	        // On Yellow Side for FF
	        if ( stateOfCube.Y[0][1] < 20 )
	        {
	            if ( stateOfCube.B[0][1] == 28 && stateOfCube.Y[0][1] == 14) // Check for Red Edge
	            {
	                moveUpperInv.moveUi();
	                moveLeft.moveL();
	                moveLeft.moveL();
	            }
	            
	            if ( stateOfCube.B[0][1] == 38 && stateOfCube.Y[0][1] == 16 ) // Check for Orange Edge
	            {
	                moveUpper.moveU();
	                moveRight.moveR();
	                moveRight.moveR();
	            }
	            
	            if ( stateOfCube.B[0][1] == 48 && stateOfCube.Y[0][1] == 18 ) // Check for Blue Edge
	            {
	                moveBack.moveB();
	                moveBack.moveB();
	            }
	            
	            if ( stateOfCube.B[0][1] == 58 && stateOfCube.Y[0][1] == 12 ) // Check for Green Edge
	            {
	                moveUpper.moveU();
	                moveUpper.moveU();
	                moveFront.moveF();
	                moveFront.moveF();
	            }
	           
	        }
	        
	        // Check for white on Green top
	        if ( stateOfCube.G[0][1] < 20 )
	        {
	            if ( stateOfCube.Y[2][1] == 28 && stateOfCube.G[0][1] == 14 )    // Check for Red Edge
	            {
	                moveUpper.moveU();
	                moveLeft.moveL();
	                moveDown.moveD();
	                moveFrontInv.moveFi();
	                moveDownInv.moveDi();
	            }
	
	            if ( stateOfCube.Y[2][1] == 38 && stateOfCube.G[0][1] == 16)    // Check for Orange Edge
	            {
	                moveUpperInv.moveUi();
	                moveRightInv.moveRi();
	                moveDownInv.moveDi();
	                moveFront.moveF();
	                moveDown.moveD();
	            }
	
	            if ( stateOfCube.Y[2][1] == 48 && stateOfCube.G[0][1] == 18)    // Check for Blue Edge
	            {
	                moveUpperInv.moveUi();
	                moveRight.moveR();
	                moveBackInv.moveBi();
	                moveRightInv.moveRi();
	            }
	
	            if ( stateOfCube.Y[2][1] == 58 && stateOfCube.G[0][1] == 12 )    // Check for Green Edge
	            {
	                moveFront.moveF();
	                moveDown.moveD();
	                moveRightInv.moveRi();
	                moveDownInv.moveDi();
	            }
	
	        }
	        
	        if ( stateOfCube.G[1][2] > 10 && stateOfCube.G[1][2] <20 )
	        {
	            moveRight.moveR();
	            moveUpper.moveU();
	            moveRightInv.moveRi();
	        }
	        
	        if ( stateOfCube.O[1][2] > 10 && stateOfCube.O[1][2] <20 )
	        {
	            moveBack.moveB();
	            moveUpper.moveU();
	            moveBackInv.moveBi();
	        }
	        
	        if ( stateOfCube.B[1][2] > 10 && stateOfCube.B[1][2] < 20)
	        {
	            moveLeft.moveL();
	            moveUpper.moveU();
	            moveLeftInv.moveLi();
	        }
	        
	        if ( stateOfCube.R[1][2] > 10 && stateOfCube.R[1][2] < 20 )
	        {
	            moveFront.moveF();
	            moveUpper.moveU();
	            moveFrontInv.moveFi();
	            
	        }
	
	        if ( stateOfCube.G[1][0] > 10 && stateOfCube.G[1][0] < 20 )
	        {
	            moveLeftInv.moveLi();
	            moveUpper.moveU();
	            moveLeft.moveL();
	            
	        }
	        
	        if ( stateOfCube.O[1][0] > 10 && stateOfCube.O[1][0] <20 )
	        {
	            moveFrontInv.moveFi();
	            moveUpper.moveU();
	            moveFront.moveF();
	            
	        }
	        
	        if ( stateOfCube.B[1][0] > 10 && stateOfCube.B[1][0] < 20 )
	        {
	            moveRightInv.moveRi();
	            moveUpper.moveU();
	            moveRight.moveR();
	            
	        }
	        
	        if ( stateOfCube.R[1][0] > 10 && stateOfCube.R[1][0] < 20 )
	        {
	            moveBackInv.moveBi();
	            moveUpper.moveU();
	            moveBack.moveB(); 
	        }
	        
	        if ( stateOfCube.G[2][1] <20 )
	        {
	            moveFront.moveF();
	            moveFront.moveF();
	        }
	        
	        if ( stateOfCube.O[2][1] < 20 )
	        {
	            moveRight.moveR();
	            moveRight.moveR();
	        }
	        
	        if ( stateOfCube.B[2][1] < 20 )
	        {
	            moveBack.moveB();
	            moveBack.moveB();           
	        }
	        
	        if ( stateOfCube.R[2][1] < 20 )
	        {
	            moveLeft.moveL();
	            moveLeft.moveL();           
	        }
	        
	        if ( stay < 25 )
	        {
	        	moveUpper.moveU();
	    	}
	    }
	}

	public static int checkStage1() {

    	if( stateOfCube.W[0][1] == 12 && stateOfCube.W[1][0] == 14 && stateOfCube.W[2][1] == 18 && stateOfCube.W[1][2] == 16 && stateOfCube.G[2][1] == 58 && stateOfCube.R[2][1] == 28 && stateOfCube.B[2][1] == 48 && stateOfCube.O[2][1] == 38)
        {
            return 0;
        }

        else
        {
            return 1;
        }
	}
}
