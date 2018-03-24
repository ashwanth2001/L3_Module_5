package Lvl4._03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Movingmorph extends Polymorph {

	Movingmorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, 50, 50);
	}
	
	public void update() {
		y++;
	}

}
