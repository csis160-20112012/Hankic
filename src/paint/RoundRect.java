package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundRect {
	
	int x;
	int y;
	int h;
	int w;
	int r;

	public void paint(Graphics graphics) {
		graphics.setColor(Color.pink);
		graphics.fillRoundRect(x, y, h, w, r, r);
		graphics.setColor(Color.red);
		graphics.drawRoundRect(x, y, h, w, r, r);
	}

}
