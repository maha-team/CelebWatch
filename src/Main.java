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
	private Control c;
	Table t; //csv
	int rows; //csv
	
		
	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
		Main asd = new Main();
		asd.Mupp();
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

	/**
	 * Create the frame.
	 */
	public void Mupp() {
		
		// Create the table (2D array) from our CSV file.
		  t = new Table( "name.csv" );
		  rows = t.getRowCount(); 
		  
		//print the first column in each row from csv-file.
		  for( int i = 0; i < rows; i++ ) {
		    //System.out.println( t.getRowName(i) );
		  }
		 		   
		 /* Hämtar kolumn 2 (Category) från rad numret som heter "ABBA" */
		 //System.out.println(t.getString(t.getRowIndex("ABBA"), 1));
		 
		 /* Hämtar kolumn 3 (Id1) från raden som heter "The Hives" */
		 //System.out.println(t.getString("The Hives", 2));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
}
