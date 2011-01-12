import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.JLabel;


@SuppressWarnings("serial")
public class MyLabel extends JLabel implements MouseListener {

	private String celebIcon;
	private MainPageContainer MPC;
	private int Index;
	
	/*Creates the buttonfunction for the images on in the right hand sidepanel*/
	public void setMPC(MainPageContainer parent){
		MPC = parent;
	}
	
	public void setIndex(int x) {
		Index = x;
	}
	
	public MyLabel(String arg0) {
		super(arg0);

		this.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		MPC.showTable(Index);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {	
	}

	@Override
	public void mouseExited(MouseEvent arg0) {	
	}

	@Override
	public void mousePressed(MouseEvent arg0) {	
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
}
