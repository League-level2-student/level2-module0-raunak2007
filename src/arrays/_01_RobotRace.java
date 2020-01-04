package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		

	//2. create an array of 5 robots.
		Robot[]robotArray=new Robot[7];
	//3. use a for loop to initialize the robots.
		//for(int i=0;i<7;i++) {
		//4. make each robot start at the bottom of the screen, side by side, facing up
			//robotArray[i]=new Robot();
			//robotArray[i].setY(500);
			//robotArray[i].setX((100*i)+100);
			//robotArray[i].setSpeed(50);
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.
		
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
		//boolean h=false;
		//while(h==false) {
			//for(int j=0;j<7;j++) {
				//robotArray[j].move(new Random().nextInt(50));
				//if(robotArray[j].getY()<=0) {
					//h=true;
					//JOptionPane.showMessageDialog(null, "Robot "+(j+1)+" is the winner");
				//}
			//}
		//}
	//7. declare that robot the winner and throw it a party!
	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
		for(int i=0;i<7;i++) {
			//4. make each robot start at the bottom of the screen, side by side, facing up
				robotArray[i]=new Robot();
				robotArray[i].setY(500);
				robotArray[i].setX((100*i)+100);
				robotArray[i].setSpeed(50);
			}
		int a=0;
		boolean h=false;
		while(h==false) {
			for(int j=0;j<7;j++) {
				a+=1;
				robotArray[j].move(new Random().nextInt(50));
				robotArray[j].turn(10);
				if(robotArray[j].getY()>=501&&a==1) {
					h=true;
					JOptionPane.showMessageDialog(null, "Robot "+(j+1)+" is the winner");
				}
			}
		}
	}
}
