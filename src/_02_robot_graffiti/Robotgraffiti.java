package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot Potato = new Robot();
		Potato.penDown();
		Potato.setSpeed(100);
		for (int i = 0; i <90; i++) {
Potato.move(10);
Potato.turn(20);
	}

}
}