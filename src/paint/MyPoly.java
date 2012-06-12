package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.Graphics;
import java.awt.Polygon;

public class MyPoly {
	public void paint(Graphics g) {
		int exes[] = { 139, 194, 197, 242, 153, 158, 126 };
		int whys[] = { 133, 174, 136, 170, 208, 180, 206 };
		int pts = exes.length;
		Polygon poly = new Polygon(exes, whys, pts);
		g.fillPolygon(poly);
	}
}
