import java.awt.Graphics;

public class SquareBrush extends Points {

	// paint a square using fillRect method
	public void paint( Graphics g ) {
		g.fillRect( coordinates.x, coordinates.y, pointSize, pointSize );
	}
}
