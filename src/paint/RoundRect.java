package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Color;
import java.awt.Graphics;

public class RoundRect {

	public void paint(Graphics graphics) {
		graphics.setColor(Color.pink);
		graphics.fillRoundRect(400, 400, 100, 100, 5, 5);
		graphics.setColor(Color.red);
		graphics.drawRoundRect(400, 400, 100, 100, 5, 5);
	}

}
