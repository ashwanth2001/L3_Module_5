package Lvl4._03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class Redmorph extends Polymorph {

	Redmorph(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(x, y, 50, 50);
	}

}
