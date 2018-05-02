
import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
		super.moveByAmount(3 * dir, 0);
	}

	public void jump() {
		// JUMP!
		super.moveByAmount(0, -10);
	}

	public void act(ArrayList<Shape> obstacles) {
		// FALL (and stop when a platform is hit)
		boolean hitObstacle = false;
<<<<<<< HEAD
		for(int i =0; i < obstacles.size(); i++) {
			if(obstacles.get(i).contains(x, y)) {
				hitObstacle = true;
=======
		for (int i = 0; i < obstacles.size(); i++) {
			if (this.getMaxY() == obstacles.get(i).getBounds2D().getMinY()) {
				if (this.getMaxX() <= obstacles.get(i).getBounds2D().getMaxX()
						&& this.getMaxX() >= obstacles.get(i).getBounds2D().getMinX()
						|| this.getMinX() <= obstacles.get(i).getBounds2D().getMaxX()
								&& this.getMinX() >= obstacles.get(i).getBounds2D().getMinX())
					hitObstacle = true;
>>>>>>> branch 'master' of https://github.com/jpoist504/AnimationDemo.git
			}
		}

		if (!hitObstacle)
<<<<<<< HEAD
			super.moveByAmount(0, 5);
		
		
=======
			super.moveByAmount(0, 1);

>>>>>>> branch 'master' of https://github.com/jpoist504/AnimationDemo.git
	}

}
