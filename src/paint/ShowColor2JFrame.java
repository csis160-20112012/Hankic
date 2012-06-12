package paint;

/**
 * @author Mirzeta Hankic and Adna Kolakovic
 * 
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ShowColor2JFrame extends Paint {

	private static final long serialVersionUID = 1L;
	private JButton changeColorJButton;
	private Color color = Color.WHITE;
	private JPanel colorJPanel;

	public ShowColor2JFrame(String string) {
		super("Paint");
		colorJPanel = new JPanel();
		colorJPanel.setBackground(color);
		changeColorJButton = new JButton("Change color");
		changeColorJButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				color = JColorChooser.showDialog(ShowColor2JFrame.this,
						"Choose a color", color);
				if (color == null)
					color = Color.WHITE;
				colorJPanel.setBackground(color);

			}
		});

		add(colorJPanel, BorderLayout.CENTER);
		add(changeColorJButton, BorderLayout.SOUTH);
		setSize(512, 384);
		setVisible(true);

	}
}


