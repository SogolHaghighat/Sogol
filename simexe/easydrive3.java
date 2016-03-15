import ch.aplu.robotsim.*;

public class easydrive3 {
	
	public easydrive3()
	{
		LegoRobot robot = new LegoRobot();
		Gear gear = new Gear();
		robot.addPart(gear);
		//gear.setSpeed(20); 
		gear.rightArc(0.4,10800);
		gear.left(1075);
	}
    public static void main(String args[]){
	  new easydrive3();
    } 
}
