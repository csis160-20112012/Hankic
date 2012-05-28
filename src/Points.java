
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Point;

public abstract class Points {

	protected Point coordinates;
	protected int pointSize = 10;
	protected Color pointColor = Color.BLACK;
	
	public abstract void paint( Graphics g );
	

	public Point getCoordinates() {
		return coordinates;
	}
	
	public void setCoordinates( Point p ) {
		coordinates = p;
	}

	public int getPointSize() {
		return pointSize;
	}

	public void setPointSize(int pointSize) {
		this.pointSize = pointSize;
	}

	public Color getPointColor() {
		return pointColor;
	}

	public void setPointColor(Color pointColor) {
		this.pointColor = pointColor;
	}
	

}