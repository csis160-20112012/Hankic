
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;
import java.io.*;

public class Paint extends JFrame implements ActionListener {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private MenuBar menuBar = new MenuBar(); 
	private Menu file = new Menu(); 
	private MenuItem New = new MenuItem(); 
	private MenuItem OpenFile = new MenuItem();
	private MenuItem Save = new MenuItem();

	private MenuItem Save_as = new MenuItem(); 
	private MenuItem Print_Preview = new MenuItem();
	private MenuItem Page_Setup = new MenuItem();
	private MenuItem Print = new MenuItem();
	private MenuItem Send = new MenuItem();
	private MenuItem EXIT=new MenuItem();
	private Menu edit = new Menu();
	private MenuItem Undo = new MenuItem();
	private MenuItem Repeat = new MenuItem();
	private MenuItem Cut = new MenuItem();
	private MenuItem Copy = new MenuItem();
	private MenuItem Paste = new MenuItem();
	private MenuItem Clear_Selection = new MenuItem();
	private MenuItem Select_All = new MenuItem();
	private MenuItem Copy_to = new MenuItem();
	private MenuItem Paste_From = new MenuItem();
	private Menu View= new Menu();
	private MenuItem ToolBox=new MenuItem();
	private MenuItem ColorBox=new MenuItem();
	private MenuItem OptionBox=new MenuItem();

	public Paint() {

		this.setSize(500, 300);

		this.setTitle("untitled-Paint"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		
																		
	

		this.getContentPane().setLayout(new BorderLayout()); 

		

		this.setMenuBar(this.menuBar);

		this.menuBar.add(this.file);
		this.file.setLabel("File");
		
		this.file.add(this.New);
		this.New.setLabel("New");

		this.New.addActionListener(this);

		this.New.setShortcut(new MenuShortcut(KeyEvent.VK_N, false));
		

		this.file.add(this.OpenFile); 

		this.OpenFile.setLabel("Open");

		this.OpenFile.addActionListener(this);

		this.OpenFile.setShortcut(new MenuShortcut(KeyEvent.VK_O, false));

		this.file.add(this.Save);

		this.Save.setLabel("Save");

		this.Save.setShortcut(new MenuShortcut(KeyEvent.VK_S, false));

		this.Save.addActionListener(this);

		this.file.add(this.Save_as);

		this.Save_as.setLabel("Save_as");

		this.Save_as.addActionListener(this);

		this.file.add(this.Print_Preview);
		this.Print_Preview.setLabel("Print_Preview");

		

		this.Print_Preview.addActionListener(this);

		this.file.add(this.Page_Setup);
		this.Page_Setup.setLabel("Page_Setup");

		

		this.Page_Setup.addActionListener(this);

		this.file.add(this.Print);
		this.Print.setLabel("Print");

		this.Print.setShortcut(new MenuShortcut(KeyEvent.VK_P, false));

		this.Print.addActionListener(this);

		this.file.add(this.Send);
		this.Send.setLabel("Send");

		this.Send.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));

		this.Send.addActionListener(this);
		this.file.add(this.EXIT);
		this.EXIT.setLabel("EXIT");

		this.EXIT.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));

		this.EXIT.addActionListener(this);

		this.menuBar.add(this.edit); 
		this.edit.setLabel("Edit");
		this.edit.add(this.Undo);
		this.Undo.setLabel("Undo");

		this.Undo.setShortcut(new MenuShortcut(KeyEvent.VK_Z, false));

		this.Undo.addActionListener(this);

		this.edit.add(this.Repeat);
		this.Repeat.setLabel("Repeat");

		this.Repeat.setShortcut(new MenuShortcut(KeyEvent.VK_Y, false));

		this.Repeat.addActionListener(this);
		this.edit.add(this.Cut);
		this.Cut.setLabel("Cut");

		this.Cut.setShortcut(new MenuShortcut(KeyEvent.VK_X, false));

		this.Cut.addActionListener(this);
		this.edit.add(this.Copy);
		this.Copy.setLabel("Copy");

		this.Copy.setShortcut(new MenuShortcut(KeyEvent.VK_C, false));

		this.Copy.addActionListener(this);
		this.edit.add(this.Paste);
		this.Paste.setLabel("Paste");

		this.Paste.setShortcut(new MenuShortcut(KeyEvent.VK_V, false));

		this.Paste.addActionListener(this);
		this.edit.add(this.Clear_Selection);
		this.Clear_Selection.setLabel("Clear_Selection");
    this.Clear_Selection.addActionListener(this);

		this.edit.add(this.Select_All);
		this.Select_All.setLabel("Select_All");

		this.Select_All.setShortcut(new MenuShortcut(KeyEvent.VK_A, false));

		this.Select_All.addActionListener(this);

		this.edit.add(this.Copy_to);
		this.Copy_to.setLabel("Copy_to");

		

		this.Copy_to.addActionListener(this);

		this.edit.add(this.Paste_From);
		this.Paste_From.setLabel("Paste_From");

		this.Paste_From.setShortcut(new MenuShortcut(KeyEvent.VK_F4, false));

		this.Paste_From.addActionListener(this);
		this.menuBar.add(this.View); 
		this.View.setLabel("View");
		this.View.add(this.ToolBox);
		this.ToolBox.setLabel("ToolBox");
        this.ToolBox.addActionListener(this);
        
		this.View.add(this.ColorBox);
		this.ColorBox.setLabel("ColorBox");
        this.ColorBox.addActionListener(this);
        this.View.add(this.OptionBox);
		this.OptionBox.setLabel("OptionBox");
        this.OptionBox.addActionListener(this);
		
		
	}
	
		     public static void main(String args[]) {
		
		         Paint app = new Paint();
		
		         app.setVisible(true);
	}

			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				
			}

}


	

