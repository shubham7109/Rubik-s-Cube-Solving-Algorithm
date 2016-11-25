package solver;

import java.io.IOException;

import lejos.nxt.remote.NXTCommand;
import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommandConnector;
import lejos.pc.comm.NXTConnector;
import lejos.util.Delay;
import lejos.nxt.remote.RemoteMotor;

public class movementController extends MainController {

	// Side1 = Left
	// Side2 = Down
	// Side3 = Right
	public static NXTCommand m_NxtCommand;
	public static RemoteMotor A;
	public static RemoteMotor B;
	public static RemoteMotor C;
	
	//check if arm is vertical or horizontal
	//true = vertical , false = horizontal
	public static boolean rotLeft=false;
	public static boolean rotDown=false;
	public static boolean rotRight=false;
	
	//check if arm is clenched or unclenched 
	public static boolean clenchDown=true;
	public static boolean clenchLeft=true;
	public static boolean clenchRight=true;
	
	public static void main(String[] args) {
	
		MainController.completeAlgorithm();
		
		int side;
		int i=0;
		
		while(i<randomList.size())
		{
			side=randomList.get(i); 
			
			while(check(side)==false)
				fix(side);
			
			
			i++;
		}
		
		i=0;
		
		while(i<moveList.size())
		{
			
			i++;
		}
	}
	
	public static void rotate(int side)
	{
		/* Move Upper    = 1
		 * Move UpperInv = 2
		 * Move Down     = 3
		 * Move DownInv  = 4
		 * Move Left     = 5
		 * Move LeftInv  = 6
		 * Move Right    = 7
		 * Move RightInv = 8
		 * Move Front    = 9
		 * Move FrontInv = 10
		 * Move Back     = 11
		 * Move BackInv  = 12
		 */
		
		if(side==1)
		{
			
		}	
		
		if(side==2)
		{
			
		}
		
		if(side==3)
		{
			
		}
		
		if(side==4)
		{
			
		}
		
		if(side==5)
		{
			
		}
		
		if(side==6)
		{
			
		}
		
		if(side==7)
		{
			
		}
		
		if(side==8)
		{
			
		}
		
		if(side==9)
		{
			
		}
		
		if(side==10)
		{
			
		}
		
		if(side==11)
		{
			
		}	
		
		if(side==12)
		{
			
		}
	}
	
	public static void clench()
	{
		
	}
	
	public static boolean check(int side)
	{
		//up
		if(side == 1 || side ==2)
		{
			if(clenchDown == false && clenchRight == true && clenchLeft == true)
				return true;
		}
		
		//down
		if(side == 3|| side == 4)
		{
			if((rotLeft == false && clenchLeft == true && clenchDown == true) || (rotRight == false && clenchRight == true && clenchDown == true))
				return true;
		}
		
		//left
		if(side == 5 || side == 6)
		{
			if(rotDown == true && clenchDown == true && clenchRight == true && clenchLeft==true)
				return true;
		}
	
		//right
		if(side == 7 || side == 8)
		{
			if(rotDown == true && clenchDown == true && clenchLeft == true && clenchRight == true)
				return true;
		}              
		
		//front
		if(side == 9 || side == 10)
		{
			if(clenchDown == false && clenchRight == true && clenchLeft == true)
				return true;
		}
		
		//back
		if(side== 11 || side == 12)
		{
			if(clenchDown == false && clenchRight == true && clenchLeft == true)
				return true;
		}
		return false;
	}
	
	public static void fix(int side)
	{
		if(side == 1)
		{
			
		}
	}
	
	//updates the side information (rotation)
	public static void updateRotation(int update)
	{
		if(update == 1)
		{
			rotLeft = false;
		}
		
		if(update == 2)
		{
			rotDown = false;
		}
		
		if(update == 3)
		{
			rotRight = false; 
		}
		
		if(update == 4)
		{
			rotLeft = true;
		}
		
		if(update ==5)
		{
			rotDown = true;
		}
		
		if(update == 6)
		{
			rotRight = true;
		}
	}
	
	//updates the side information (clench)
	public static void updateClench(int update)
	{
		if(update == 1)
		{
			clenchLeft = false;
		}
		
		if(update == 2)
		{
			clenchDown = false;
		}
		
		if(update == 3)
		{
			clenchRight = false; 
		}
		
		if(update == 4)
		{
			clenchLeft = true;
		}
		
		if(update ==5)
		{
			clenchDown = true;
		}
		
		if(update == 6)
		{
			clenchRight = true;
		}
	}
}
