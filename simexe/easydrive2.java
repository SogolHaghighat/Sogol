import ch.aplu.robotsim.LegoRobot;
import ch.aplu.robotsim.Motor;
import ch.aplu.robotsim.MotorPort;
import ch.aplu.robotsim.Tools;
public class easydrive2 {
	
	public easydrive2()
	{
		LegoRobot robot = new LegoRobot();
		Motor motA = new Motor(MotorPort.A);
		Motor motB = new Motor(MotorPort.B);
		robot.addPart(motA);
		robot.addPart(motB);
		
		for (int t=0; t<2;t++){
		for (int i=0; i<2;i++){
		motA.forward();
		motB.forward();
		Tools.delay(2000);
		
		motA.stop();
		Tools.delay(1075);
		
		motB.stop();
		};
		
		for (int i=0; i<2;i++){
			motA.forward();
			motB.forward();
			Tools.delay(2000);
			
			motB.stop();
			Tools.delay(1075);
			
			motA.stop();
			};
		 };
		
		//motA.stop();
		//Tools.delay(1075);
		
		//motB.stop();
		//Tools.delay(2000);
		
		
		//motA.forward();
		//motB.forward();
		//Tools.delay(2000);
		
		//motB.backward();
		//Tools.delay(2000);
		
		robot.exit();
		
	}
    public static void main(String args[]){
	  new easydrive2();
} 
}