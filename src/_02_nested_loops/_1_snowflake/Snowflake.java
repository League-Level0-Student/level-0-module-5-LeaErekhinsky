package _02_nested_loops._1_snowflake;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Snowflake {

	public static void main(String[] args) {

		Robot rob = new Robot();
		rob.setX(300);
		rob.setY(300);
		rob.penDown();
		rob.setSpeed(50);

		for (int count = 0; count < 6; count++) {
			rob.setPenColor(Color.black);
			rob.move(50);
			rob.turn(60);
			if (count % 2 == 0) {
				rob.setPenColor(Color.blue);

			} else {
				rob.setPenColor(Color.red);

			}
			for (int count1 = 0; count1 < 6; count1++) {
				rob.turn(-60);
				rob.move(50);

			}

		}

		rob.setPenColor(Color.black);
		rob.hide();
	}

}
