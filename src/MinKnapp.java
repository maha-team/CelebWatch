import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;


public class MinKnapp extends JButton {
	public MinKnapp() {
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		setIcon(new ImageIcon(MinKnapp.class.getResource("/images/entertainmentbutton.jpg")));
	}

	@Override
	protected void paintComponent(Graphics arg0) {		
		
		arg0.drawRect(5, 5, 10, 10);
	}

}
