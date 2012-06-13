package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Graphics;

public class MyOval {
	
	int x;
	int y;
	int h;
	int w;

	public void paint(Graphics g) {

	g.drawOval(x, y, h, w);

	}
}

