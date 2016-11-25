package solver;

public class algorithmStage7 {

	public static void stage7()
	{
        while ( algorithmStage7.checkStage7() == 1)
        {
            
           moveUpper.moveU();
           
           if ( stateOfCube.G[0][1] != 52 && stateOfCube.O[0][1] != 32 && stateOfCube.B[0][1] != 42 && stateOfCube.R[0][1] != 22 && stateOfCube.G[0][0] == 51 && stateOfCube.O[0][0] == 31 && stateOfCube.B[0][0] == 41 && stateOfCube.R[0][0] == 21)

           {
                moveFront.moveF();
                moveFront.moveF();
                moveUpper.moveU();
                moveLeft.moveL();
                moveRightInv.moveRi();
                moveFront.moveF();
                moveFront.moveF();
                moveLeftInv.moveLi();
                moveRight.moveR();
                moveUpper.moveU();
                moveFront.moveF();
                moveFront.moveF();
            }

            if  ( stateOfCube.B[0][0] == 41 && stateOfCube.B[0][1] == 42 )
            {
                if ( stateOfCube.G[0][1] == 32)
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpperInv.moveUi();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpperInv.moveUi();
                    moveFront.moveF();
                    moveFront.moveF();
                }

                if ( stateOfCube.G[0][1] == 22 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpper.moveU();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpper.moveU();
                    moveFront.moveF();
                    moveFront.moveF();
                }
            }

            if ( stateOfCube.B[0][0] == 31 && stateOfCube.B[0][1] == 32 )
            {
                if ( stateOfCube.G[0][1] == 52 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpperInv.moveUi();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpperInv.moveUi();
                    moveFront.moveF();
                    moveFront.moveF();
                }

                if ( stateOfCube.G[0][1] == 42 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpper.moveU();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpper.moveU();
                    moveFront.moveF();
                    moveFront.moveF();
                }
            }

            if ( stateOfCube.B[0][1] == 52 && stateOfCube.B[0][0] == 51 )
            {

                if ( stateOfCube.G[0][1] == 32 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpper.moveU();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpper.moveU();
                    moveFront.moveF();
                    moveFront.moveF();
                }

                if ( stateOfCube.G[0][1] == 22 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpperInv.moveUi();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpperInv.moveUi();
                    moveFront.moveF();
                    moveFront.moveF();
                }
            }

            if ( stateOfCube.B[0][0] == 21 && stateOfCube.B[0][1] == 22)
            {
                if ( stateOfCube.G[0][1] == 52 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpper.moveU();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpper.moveU();
                    moveFront.moveF();
                    moveFront.moveF();
                }
                if ( stateOfCube.G[0][1] == 42 )
                {
                    moveFront.moveF();
                    moveFront.moveF();
                    moveUpperInv.moveUi();
                    moveLeft.moveL();
                    moveRightInv.moveRi();
                    moveFront.moveF();
                    moveFront.moveF();
                    moveLeftInv.moveLi();
                    moveRight.moveR();
                    moveUpperInv.moveUi();
                    moveFront.moveF();
                    moveFront.moveF();
                }
            }
        }
}

	public static int checkStage7()
	{
	    if ( stateOfCube.G[0][1] == 52 && stateOfCube.O[0][1] == 32 && stateOfCube.B[0][1] == 42 && stateOfCube.R[0][1] == 22 && stateOfCube.G[0][0] == 51 && stateOfCube.O[0][0] == 31 && stateOfCube.B[0][0] == 41 && stateOfCube.R[0][0] == 21 )
	    {
	        return 0;
	    }
	
	    else
	    {
	        return 1;
	    }
	}
}
