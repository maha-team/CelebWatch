import java.awt.Graphics;

import javax.swing.JButton;


public class MinKnapp extends JButton {
	public MinKnapp() {
	}

	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(Graphics arg0) {
		// TODO Auto-generated method stub
		//super.paintComponent(arg0);
		
		
		arg0.drawRect(5, 5, 10, 10);
	}

}
