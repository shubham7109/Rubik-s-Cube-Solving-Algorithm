package solver;

public class algorithmStage6 {

	public static void stage6()
	{
		while ( algorithmStage6.checkStage6() == 1)
        {
            if ( stateOfCube.R[0][2] > 20 && stateOfCube.R[0][2] < 30  && stateOfCube.O[0][0] > 20 && stateOfCube.O[0][0] < 30 )
            {
                moveRightInv.moveRi();
                moveFront.moveF();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveFrontInv.moveFi();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveRight.moveR();
            }

            if ( stateOfCube.R[0][2] > 30 && stateOfCube.R[0][2] < 40  && stateOfCube.O[0][0] > 30 && stateOfCube.O[0][0] < 40 )
            {
                moveRightInv.moveRi();
                moveFront.moveF();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveFrontInv.moveFi();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveRight.moveR();
            }

            if ( stateOfCube.R[0][2] > 40 && stateOfCube.R[0][2] < 50  && stateOfCube.O[0][0] > 40 && stateOfCube.O[0][0] < 50 )
            {
                moveRightInv.moveRi();
                moveFront.moveF();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveFrontInv.moveFi();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveRight.moveR();
            }

            if ( stateOfCube.R[0][2] > 50 && stateOfCube.R[0][2] < 60  && stateOfCube.O[0][0] > 50 && stateOfCube.O[0][0] < 60 )
            {
                moveRightInv.moveRi();
                moveFront.moveF();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveFrontInv.moveFi();
                moveRightInv.moveRi();
                moveBack.moveB();
                moveBack.moveB();
                moveRight.moveR();
                moveRight.moveR();
            }
            
            moveUpper.moveU();
        }

}

public static int checkStage6()
{

      if( stateOfCube.G[0][0] == 51 && stateOfCube.G[0][2] == 53 && stateOfCube.R[0][0] == 21 && stateOfCube.R[0][2] == 23 && stateOfCube.B[0][0] == 41 && stateOfCube.B[0][2] == 43  && stateOfCube.O[0][0] == 31 && stateOfCube.O[0][2] == 33  )
    {
        return 0;
    }

    else
    {
        return 1;
    }
	}
}
