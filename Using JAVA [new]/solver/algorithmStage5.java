package solver;

public class algorithmStage5 {

	public static void stage5()
	{
        while ( algorithmStage5.checkStage5() == 1)
        {

            moveUpper.moveU();
            
            if ( stateOfCube.Y[0][0] > 60 && stateOfCube.Y[2][2] > 60 && stateOfCube.Y[0][2] < 60 && stateOfCube.Y[2][0] < 60 )
            {
                moveRight.moveR();
                moveUpper.moveU();
                moveRightInv.moveRi();
                moveUpper.moveU();
                moveRight.moveR();
                moveUpper.moveU();
                moveUpper.moveU();
                moveRightInv.moveRi();
            }

           if ( stateOfCube.Y[0][0] < 60 && stateOfCube.Y[2][2] < 60 && stateOfCube.Y[0][2] < 60 && stateOfCube.Y[2][0] > 60 )
           {
                moveRight.moveR();
                moveUpper.moveU();
                moveRightInv.moveRi();
                moveUpper.moveU();
                moveRight.moveR();
                moveUpper.moveU();
                moveUpper.moveU();
                moveRightInv.moveRi();
            }

          if ( stateOfCube.Y[0][0] < 60 && stateOfCube.Y[2][2] > 60 && stateOfCube.Y[0][2] > 60 && stateOfCube.Y[2][0] < 60 )
          {
                moveRight.moveR();
                moveUpper.moveU();
                moveRightInv.moveRi();
                moveUpper.moveU();
                moveRight.moveR();
                moveUpper.moveU();
                moveUpper.moveU();
                moveRightInv.moveRi();
        }

          if ( stateOfCube.Y[0][0] < 60 && stateOfCube.Y[2][2] < 60 && stateOfCube.Y[0][2] < 60 && stateOfCube.Y[2][0] < 60 && stateOfCube.G[0][2] < 60 )
          {
                moveRight.moveR();
                moveUpper.moveU();
                moveRightInv.moveRi();
                moveUpper.moveU();
                moveRight.moveR();
                moveUpper.moveU();
                moveUpper.moveU();
                moveRightInv.moveRi();
            }
        }
}

	public static int checkStage5()
	{
	
	  if( stateOfCube.Y[0][0] > 60 && stateOfCube.Y[0][1] > 60 && stateOfCube.Y[2][0] > 60 && stateOfCube.Y[2][2] > 60 )
	  {
	    return 0;
	  }
	
	  else
	  {
	    return 1;
	  }
	}
}
