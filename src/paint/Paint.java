package paint;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

public class Paint extends JFrame implements MouseListener,
MouseMotionListener, ActionListener

{

	private static final long serialVersionUID = 1L;

	int last_x = -10; // mouse coordinates

	int last_y = -10;

	int xpos = -10;

	int ypos = -10;

	int coordinatesx;

	int coordinatesy;

	int valuex;

	int valuey;

	Container con = null;

	private JPanel westPanel; // left part of the window reserved for buttons

	private JPanel eastPanel; // right part of the window reserved for buttons

	private Color currentColor = Color.BLACK; // default color of the pencil

	public Paint(String string) // constructor

	{

		setTitle("untitled-Paint"); // title of the document

		con = this.getContentPane(); // content panel

		con.setBackground(Color.WHITE); // default background

		addMouseListener(this); // mouse listener for panel

		addMouseMotionListener(this);

		JMenuBar menuBar = new JMenuBar(); // main menu bar

		getContentPane().add(menuBar, BorderLayout.NORTH); // adds menu bar to
		// the top of the
		// panel

		JMenu fileMenu = new JMenu("File"); // menus
		JMenu helpMenu = new JMenu("Help");

		/**
		 * @author Adna Kolakovic
		 * 
		 */

		JButton bblack = new JButton("Black"); // Buttons for selecting colors
		JButton cred = new JButton("Red");
		JButton white = new JButton("White");
		JButton cyellow = new JButton("Yellow");
		JButton cgreen = new JButton("Green");
		JButton cblue = new JButton("Blue");
		JButton pink = new JButton("Pink");
		JButton cyan = new JButton("Cyan");
		JButton gray = new JButton("Gray");
		JButton orange = new JButton("Orange");

		/**
		 * @author Mirzeta Hankic
		 * 
		 */


		JMenuItem newItem = new JMenuItem("New"); // Buttons inside menus
		JMenuItem exitItem = new JMenuItem("Exit");
		JMenuItem OpenItem = new JMenuItem("Open");
		JMenuItem SaveItem = new JMenuItem("Save");
		JMenuItem Save_as = new JMenuItem("Save_as");
		JMenuItem Print_Preview = new JMenuItem("Print_Preview");
		JMenuItem helpItem = new JMenuItem("About");


		/**
		 * @author Mirzeta Hankic and Adna Kolakovic
		 * 
		 */		

		JButton clearButton = new JButton("Clear"); // Options, stamps, buttons on the left side
		JButton MyLine = new JButton("Line");
		JButton MyRect = new JButton("Rectangle");
		JButton RoundRect = new JButton("Rounded");
		JButton MyRRect = new JButton("Filled");
		JButton Lamp = new JButton("Lamp");
		JButton MyPoly = new JButton("Polygon");
		JButton Circles = new JButton("Circles");
		JButton MyOval = new JButton("Circle");

		cyellow.addActionListener(this); // button's action listeners for mouse click
		white.addActionListener(this);
		cgreen.addActionListener(this);
		cblue.addActionListener(this);
		cred.addActionListener(this);
		bblack.addActionListener(this);
		pink.addActionListener(this);
		gray.addActionListener(this);
		orange.addActionListener(this);
		cyan.addActionListener(this);
		clearButton.addActionListener(this);
		MyRect.addActionListener(this);
		MyLine.addActionListener(this);
		MyOval.addActionListener(this);
		MyRRect.addActionListener(this);
		Lamp.addActionListener(this);
		RoundRect.addActionListener(this);
		MyPoly.addActionListener(this);	
		Circles.addActionListener(this);
		newItem.addActionListener(this);
		exitItem.addActionListener(this);
		helpItem.addActionListener(this);
		OpenItem.addActionListener(this);
		SaveItem.addActionListener(this);
		Save_as.addActionListener(this);	

		/**
		 * @author Mirzeta Hankic
		 * 
		 */

		fileMenu.add(newItem);
		fileMenu.add(OpenItem);
		fileMenu.add(SaveItem);
		fileMenu.add(Save_as);
		fileMenu.add(Print_Preview);
		fileMenu.add(exitItem);

		helpMenu.add(helpItem);

		menuBar.add(fileMenu);

		menuBar.add(helpMenu);


		/**
		 * @author Mirzeta Hankic and Adna Kolakovic
		 * 
		 */

		westPanel = new JPanel(); // buttons on the left

		westPanel.setLayout(new GridLayout(9, 2)); // buttons arrangement

		westPanel.add(clearButton);
		westPanel.add(MyLine);
		westPanel.add(MyRect);
		westPanel.add(Lamp);
		westPanel.add(MyOval);
		westPanel.add(MyRRect);
		westPanel.add(RoundRect);
		westPanel.add(MyPoly);
		westPanel.add(Circles);
		con.add(westPanel, BorderLayout.WEST);

		eastPanel = new JPanel(); // buttons on the right

		eastPanel.setLayout(new GridLayout(10, 2)); // arrangement

		eastPanel.add(white);
		eastPanel.add(bblack);
		eastPanel.add(cred);
		eastPanel.add(cyellow);
		eastPanel.add(cgreen);
		eastPanel.add(cblue);
		eastPanel.add(pink);
		eastPanel.add(cyan);
		eastPanel.add(orange);
		eastPanel.add(gray);

		con.add(eastPanel, BorderLayout.EAST);

	}

	public void actionPerformed(ActionEvent ae) // method tracks which action is
	// performed - if a button is
	// clicked it does an action
	{

		String actionCommand = ae.getActionCommand();

		if (actionCommand.compareTo("New") == 0) {
			startNewDocument();
		} else if (actionCommand.compareTo("Exit") == 0) {
			exit();
		} else if (actionCommand.compareTo("About") == 0) {
			help();
		} else if (actionCommand.compareTo("Clear") == 0) {
			clear();
		} else if (actionCommand.compareTo("Open") == 0) {
			OpenItem();
		} else if (actionCommand.compareTo("Save") == 0) {
			SaveItem();
		} else if (actionCommand.compareTo("Save_as") == 0) {
			Save_as();
		} else if (actionCommand.compareTo("Print_Preview") == 0) {
			Print_Preview();
		} else if (actionCommand.compareTo("Line") == 0) {
			MyLine();
		} else if (actionCommand.compareTo("Rectangle") == 0) {
			MyRect();
		} else if (actionCommand.compareTo("Filled") == 0) {
			MyRRect();
		} else if (actionCommand.compareTo("Circle") == 0) {
			MyOval();
		} else if (actionCommand.compareTo("Lamp") == 0) {
			Lamp();
		} else if (actionCommand.compareTo("Rounded") == 0) {
			RoundRect();
		} else if (actionCommand.compareTo("Polygon") == 0) {
			MyPoly();
		} else if (actionCommand.compareTo("Circles") == 0) {
			Circles();
		} else if (actionCommand.compareTo("Black") == 0) {
			currentColor = Color.BLACK;
		} else if (actionCommand.compareTo("White") == 0) {
			currentColor = Color.WHITE;
		} else if (actionCommand.compareTo("Red") == 0) {
			currentColor = Color.RED;
		} else if (actionCommand.compareTo("Yellow") == 0) {
			currentColor = Color.YELLOW;
		} else if (actionCommand.compareTo("Blue") == 0) {
			currentColor = Color.BLUE;
		} else if (actionCommand.compareTo("Green") == 0) {
			currentColor = Color.GREEN;
		} else if (actionCommand.compareTo("Pink") == 0) {
			currentColor = Color.PINK;
		} else if (actionCommand.compareTo("Cyan") == 0) {
			currentColor = Color.CYAN;
		} else if (actionCommand.compareTo("Gray") == 0) {
			currentColor = Color.GRAY;
		} else if (actionCommand.compareTo("Orange") == 0) {
			currentColor = Color.ORANGE;
		} 
	}

	public void startNewDocument() // starts a new document in paint application
	{

		Graphics g = getGraphics();

		g.setColor(Color.WHITE); // default background color

		g.fillRect(0, 0, getSize().width, getSize().height); 

	}

	public void exit() // if exit button is clicked

	{

		String exitMessage = "Are you sure you want to exit?";
		if (JOptionPane.showConfirmDialog(this, exitMessage) == JOptionPane.YES_OPTION) {
			System.exit(0);

		}

	}

	public void OpenItem() {
		JOptionPane.showMessageDialog(this, "This is example of good project"

				);

	}

	public void SaveItem() {
		JOptionPane.showMessageDialog(this, "This is example of good project"

				);

	}

	public void Save_as() {
		JOptionPane.showMessageDialog(this, "This is example of good project"

				);

	}

	public void Print_Preview() {
		JOptionPane.showMessageDialog(this, "This is example of good project"

				);

	}


	/**
	 * @author Adna Kolakovic
	 * 
	 */

	public void MyLine() // draws a line
	{
		Graphics g = getGraphics();
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		String valx = JOptionPane.showInputDialog ("Input height");
		valuex = Integer.parseInt ( valx );
		String valy = JOptionPane.showInputDialog ("Input width");
		valuey = Integer.parseInt ( valy );	
		g.setColor(currentColor);
		g.drawLine(coordinatesx, coordinatesy, valuex, valuey);

	}

	public void MyRRect() // draws a filled rectangle
	{

		Graphics g = getGraphics();
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		String valx = JOptionPane.showInputDialog ("Input height");
		valuex = Integer.parseInt ( valx );
		String valy = JOptionPane.showInputDialog ("Input width");
		valuey = Integer.parseInt ( valy );	
		g.setColor(currentColor);
		g.fillRect(coordinatesx, coordinatesy, valuex, valuey);
		g.setColor(Color.red);
		g.drawRect(coordinatesx, coordinatesy, valuex, valuey);

	}

	public void MyOval() // draws an oval with the previously set coordinates
	{

		Graphics g = getGraphics();
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		String valx = JOptionPane.showInputDialog ("Input height");
		valuex = Integer.parseInt ( valx );
		String valy = JOptionPane.showInputDialog ("Input width");
		valuey = Integer.parseInt ( valy );	
		g.setColor(currentColor);
		g.drawOval(coordinatesx, coordinatesy, valuex, valuey);

	}

	public void MyRect() // draws a rectangle with the previously set coordinates
	{

		Graphics g = getGraphics();
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		String valx = JOptionPane.showInputDialog ("Input height");
		valuex = Integer.parseInt ( valx );
		String valy = JOptionPane.showInputDialog ("Input width");
		valuey = Integer.parseInt ( valy );	
		g.setColor(currentColor);
		g.drawRect(coordinatesx, coordinatesy, valuex, valuey);

	}

	/**
	 * @author Mirzeta Hankic
	 * 
	 */


	public void Lamp() // draws a lamp with the previously set coordinates
	{
		Graphics g = getGraphics();

		g.setColor(currentColor);

		g.drawLine(225, 350, 225, 260);
		g.drawLine(275, 350, 275, 260);

		g.drawArc(185, 257, 130, 50, -65, 312);
		g.drawArc(185, 187, 130, 50, 62, 58);

		g.drawLine(185, 277, 219, 189);
		g.drawLine(315, 277, 281, 189);

		g.fillArc(178, 220, 40, 40, 63, -174);
		g.fillOval(220, 196, 40, 40);
		g.fillArc(273, 200, 40, 40, 110, 180);
	}

	/**
	 * @author Adna Kolakovic
	 * 
	 */

	public void RoundRect() // draws a filled rounded rectangle with the 
	// previously set coordinates
	{
		Graphics g = getGraphics();
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		String valx = JOptionPane.showInputDialog ("Input height");
		valuex = Integer.parseInt ( valx );
		String valy = JOptionPane.showInputDialog ("Input width");
		valuey = Integer.parseInt ( valy );	
		String round = JOptionPane.showInputDialog ("Amount of rounding the edge:");
		int roundededge = Integer.parseInt ( round );	
		g.setColor(currentColor);
		g.fillRoundRect(coordinatesx, coordinatesy, valuex, valuey, roundededge, roundededge);
		g.setColor(Color.red);
		g.drawRoundRect(coordinatesx, coordinatesy, valuex, valuey, roundededge, roundededge);
	}

	public void MyPoly()// draws a polygon with the previously set coordinates
	{
		Graphics g = getGraphics();
		int exes[] = { 139, 194, 197, 242, 153, 158, 126 };
		int whys[] = { 133, 174, 136, 170, 208, 180, 206 };
		int pts = exes.length;
		Polygon poly = new Polygon(exes, whys, pts);
		g.setColor(currentColor);
		g.fillPolygon(poly);
	}

	public void Circles() { // draws a bunch of circles with the 
		// previously set coordinates

		Graphics g = getGraphics();
		super.paintComponents(g);
		String corx = JOptionPane.showInputDialog ("Input coordinate x");
		coordinatesx = Integer.parseInt ( corx );
		String cory = JOptionPane.showInputDialog ("Input coordinate y");
		coordinatesy = Integer.parseInt ( cory );
		for (int i = 0; i < 10; i++) {
			g.setColor(currentColor);
			g.drawOval(coordinatesx / 2 - i * 10, coordinatesy / 2 - i * 10,
					20 + i * 20, 20 + i * 20);

		}
	}

	/**
	 * @author Mirzeta Hankic and Adna Kolakovic
	 * 
	 */
	public void help() {

		JOptionPane.showMessageDialog(this, "This is example of good project"

				);

	}

	public void mouseDragged(MouseEvent evt) // PENCIL

	{

		xpos = evt.getX();

		ypos = evt.getY();

		Graphics g = getGraphics();

		g.setColor(currentColor);
		g.drawLine(last_x, last_y, xpos, ypos);

		last_x = xpos;
		last_y = ypos;
	}

	public void mousePressed(MouseEvent evt) // get coordinates of the point
	// where the mouse was last
	{											// pressed
		last_x = evt.getX();
		last_y = evt.getY();
	}

	public void clear() // clears the whole panel
	{
		Graphics g = getGraphics();
		g.setColor(Color.white);

		g.fillRect(0, 0, getSize().width, getSize().height);

		g.setColor(Color.black);

		repaint();

	}

	public void mouseMoved(MouseEvent evt) {
	}

	public void mouseClicked(MouseEvent evt) {

	}

	public void mouseReleased(MouseEvent evt) {
	}

	public void mouseEntered(MouseEvent evt) {
	}

	public void mouseExited(MouseEvent evt) {
	}

	public static void main(String[] args) // main method

	{

		ShowColor2JFrame frame = new ShowColor2JFrame("Paint");

		frame.setSize(1100, 800);

		frame.setResizable(false); // do not allow the frame to be resized

		frame.setVisible(true);

	}

}
