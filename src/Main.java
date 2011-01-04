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

	private final JPanel contentPane;
	private Control c;
	Table t; //csv
	int rows; //csv
	
		
	/**
	 * Launch the application.
	 */
	public static void main(final String[] args) {
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
	public Main() {
		
		
		// Create the table (2D array) from our CSV file.
		  t = new Table( "name.csv" );
		  rows = t.getRowCount(); 
		  
		//print the first column in each row from csv-file.
		  for( int i = 0; i < rows; i++ ) {
		    System.out.println( t.getRowName(i) );
		  }
		  
		// print the second column in csv-file
		// System.out.println( t.getInt( "ABBA", 0 ) );
		 		  
		  
		 /* H�mtar kolumn 2 (Category) fr�n rad numret som heter "ABBA" */
		 System.out.println(t.getString(t.getRowIndex("ABBA"), 1));
		 
		 

		 /* H�mtar kolumn 3 (Id1) fr�n raden som heter "The Hives" */
		 System.out.println(t.getString("The Hives", 2));

			  		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	}

	
}
