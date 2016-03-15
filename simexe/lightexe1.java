import ch.aplu.robotsim.*;

public class lightexe1 {

	public lightexe1(){
		TurtleRobot robot = new TurtleRobot();
		LightSensor ls = new LightSensor(SensorPort.S3);
		robot.addPart(ls);
		robot.setTurtleSpeed(200);
		while (true){
			robot.forward();
			if (ls.getValue()<=30){
				robot.left(180);
			}	
		}
	}		
		static{
			NxtContext.useBackground("sprites/blackPanels.gif");
			NxtContext.setStartDirection(0);
			NxtContext.setStartPosition(300, 200);
		}
		
    public static void main(String args[]){
	  lightexe1 robot = new lightexe1();
    } 
}


