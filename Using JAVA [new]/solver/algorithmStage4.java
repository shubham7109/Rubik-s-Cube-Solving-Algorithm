package solver;

public class algorithmStage4 {

	public static void stage4()
	{
        while ( algorithmStage4.checkStage4() == 1)
        {

            moveUpper.moveU();
            
            if( (stateOfCube.Y[1][0] > 60  && stateOfCube.Y[0][1] > 60) || ( stateOfCube.Y[1][0] > 60 && stateOfCube.Y[1][2] > 60 ) || ( stateOfCube.Y[0][1] < 60 && stateOfCube.Y[1][0] < 60 && stateOfCube.Y[2][1] < 60 && stateOfCube.Y[1][2] < 60 ) )
            {
                moveFront.moveF();
                moveUpper.moveU();
                moveRight.moveR();
                moveUpperInv.moveUi();
                moveRightInv.moveRi();
                moveFrontInv.moveFi();
                moveUpper.moveU();
            }
        }
}

	public static int checkStage4()	
	{
		if( stateOfCube.Y[0][1] > 60 && stateOfCube.Y[1][0] > 60 && stateOfCube.Y[2][1] > 60 && stateOfCube.Y[1][2] > 60 )	
		{
			return 0;
		}

		else
		{
			return 1;
		}
	}
}
