package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Color;
import java.awt.Graphics;

public class MyRRect {
	public void paint(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(350, 350, 100, 100);
		g.setColor(Color.red);
		g.drawRect(350, 350, 100, 100);
	}
}