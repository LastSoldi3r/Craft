package Craft;

public class Alien extends Sprite {
	
	private final int INITIAL_X = 500;
	
	public Alien(int x, int y) {
		super(x, y);
		
		initAlien();
	}
	
	private void initAlien() {
		
		loadImage("src/images/alien.png");
		getImageDimensions();
	}
	
	//Aliens return on the right side after disappearing on the left
	public void move() {
		
		if (x < 0) {
			x = INITIAL_X;
		}
		
		x -= 1;
	}

}
