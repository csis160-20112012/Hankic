package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Graphics;

public class MyLine {
	
	int x;
	int y;
	int h;
	int w;

	public void paint(Graphics g) {
		g.drawLine(x, y, h, w);
		
	}

}