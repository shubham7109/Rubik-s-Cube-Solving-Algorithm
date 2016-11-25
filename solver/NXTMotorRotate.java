package solver;

import java.io.IOException;

import lejos.nxt.remote.NXTCommand;
import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommandConnector;
import lejos.pc.comm.NXTConnector;
import lejos.util.Delay;
import lejos.nxt.remote.RemoteMotor;


public class NXTMotorRotate {
	
	private static NXTCommand m_NxtCommand;
	private static RemoteMotor A;
	private static RemoteMotor B;
	private static RemoteMotor C;
	
	public static void rotator(int side)
	{
		NXTConnector conn = new NXTConnector();
		
		if(!conn.connectTo("usb://fuck1",1))
		System.out.println("FUCKING ERROR");
		NXTComm nxtComm = conn.getNXTComm();

		m_NxtCommand =	new NXTCommand(nxtComm);
		NXTCommandConnector.setNXTCommand(m_NxtCommand);
		A =	new RemoteMotor (m_NxtCommand, 0 );
		B =	new RemoteMotor (m_NxtCommand, 1);
		C =	new RemoteMotor (m_NxtCommand, 2);
		
		A.setSpeed(50);
		B.setSpeed(50);
		C.setSpeed(50);
		
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
		
		if(side == 1)
		{
			A.rotate(90,true);
			C.rotate(90);
		}
		
		if(side == 2)
		{
			
		}
		
		if(side == 3)
		{
			
		}
		
		if(side == 4)
		{
			
		}
		
		if(side == 5)
		{
			
		}
		
		if(side == 6)
		{
			
		}
		
		if(side == 7)
		{
			
		}
		
		if(side == 8)
		{
			
		}
		
		if(side == 9)
		{
			
		}
		
		if(side == 10)
		{
			
		}
		
		if(side == 11)
		{
			
		}
		
		if(side == 12)
		{
			
		}
	}

}
