package solver;

import java.io.IOException;

import lejos.nxt.remote.NXTCommand;
import lejos.pc.comm.NXTComm;
import lejos.pc.comm.NXTCommandConnector;
import lejos.pc.comm.NXTConnector;
import lejos.util.Delay;
import lejos.nxt.remote.RemoteMotor;

public class btconnect1 {

	private static NXTCommand m_NxtCommand;
	 private static RemoteMotor A;
	private static RemoteMotor B;
	private static RemoteMotor C;
	
	public static void main(String[] args) throws IOException {
		
		NXTConnector conn = new NXTConnector();
		
		if(!conn.connectTo("usb://fuck1",1))
			System.out.println("FUCKING ERROR");
		NXTComm nxtComm = conn.getNXTComm();

		m_NxtCommand =	new NXTCommand(nxtComm);
		NXTCommandConnector.setNXTCommand(m_NxtCommand);
		A =	new RemoteMotor (m_NxtCommand, 0 );
		B =	new RemoteMotor (m_NxtCommand, 1);
		C =	new RemoteMotor (m_NxtCommand, 2);

		C.setSpeed(50);
		 A.setSpeed(50);   

		A.rotate(-90,true);
		C.rotate(90);
		conn.close();
		nxtComm.close();
		
		/*
		NXTConnector conn1 = new NXTConnector();
		
		if(!conn1.connectTo("usb://NXT2",1))
			System.out.println("FUCKING ERROR");
		NXTComm nxtComm1 = conn1.getNXTComm();

		m_NxtCommand =	new NXTCommand(nxtComm1);
		NXTCommandConnector.setNXTCommand(m_NxtCommand);
		A =	new RemoteMotor (m_NxtCommand, 0 );
		B =	new RemoteMotor (m_NxtCommand, 1);
		C =	new RemoteMotor (m_NxtCommand, 2);
		B.backward();
		Delay.msDelay(2000);
		B.stop();
			
		conn1.close();
		nxtComm1.close();
		*/
	}	

}
