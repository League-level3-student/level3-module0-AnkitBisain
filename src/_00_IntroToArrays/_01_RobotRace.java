package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		int numberOfRobots = 3;
		Random r = new Random();
		int winner = 0;
		//2. create an array of 5 robots.
		Robot[] robots = new Robot[numberOfRobots];
		//3. use a for loop to initialize the robots.
		for(int i=0; i<numberOfRobots; i++) {
			robots[i] = new Robot();
			
			robots[i].setX(100+Math.round(850/numberOfRobots)*i);
			robots[i].setY(500);
			robots[i].setAngle(0);
			//4. make each robot start at the bottom of the screen, side by side, facing up
		}
		//5. use another for loop to iterate through the array and make each robot move 
	    //   a random amount less than 50.
    		for(int i = 0; i < numberOfRobots;) {
    			robots[i].move(r.nextInt(100));
    			if(robots[i].getY() < 50) {
    				winner = i + 1;
    				i = numberOfRobots;
    			}else {
    				if(i < numberOfRobots-1) {
    					i++;
    				}else {
    					i = 0;
    				}
    			}
    		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!
    		JOptionPane.showMessageDialog(null, "Robot " + winner + " wins!!!");
		//8. try different races with different amounts of robots.
    	
	    //9. make the robots race around a circular track.
		
	}

	
}
