import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;


public class Main extends JFrame {
	
	public Main() {
	}

	private JPanel contentPane;
	Table t; //csv
	int rows; //csv
	
		
	/*
	 * Launches the application
	 */
	public static void main(final String[] args) {
		Main cont = new Main();
		cont.CSV();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					final EntryPageContainer frame = new EntryPageContainer();
					frame.setVisible(true);
				} catch (final Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
	}

	/*
	 * Creates the frame.
	 */
	public void CSV() {
		
		// Create the table (2D array) from our CSV file.
		  t = new Table( "name.csv" );
		  rows = t.getRowCount(); 
		  
		//print the first column in each row from csv-file.
		  for( int i = 0; i < rows; i++ ) {
		  }
		 		   
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
}
