import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;


public class MyLabel extends JLabel implements MouseListener {

	private String bild;

	public MyLabel(String arg0) {
		super(arg0);

		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println(bild);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void setBild(String bild) {
		this.bild = bild;
	}

	
	
}
