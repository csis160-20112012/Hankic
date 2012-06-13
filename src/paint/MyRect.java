package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Graphics;

public class MyRect {

	int x;
	int y;
	int h;
	int w;
	
	
	public void paint(Graphics g) {
		g.drawRect(x, y, h, w);

	}

}