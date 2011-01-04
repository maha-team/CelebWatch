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

	private JPanel contentPane;

	private Control c;
	
	Table t; //csv

	int rows; //csv
	
		
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
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
		 
		  
		  
		 /* Hämtar kolumn 2 (Category) från rad numret som heter "ABBA" */
		 System.out.println(t.getString(t.getRowIndex("ABBA"), 1));
		 
		 

		 /* Hämtar kolumn 3 (Id1) från raden som heter "The Hives" */
		 System.out.println(t.getString("The Hives", 2));

			  
		
		  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton button = new JButton("New button");
		
		JToggleButton toggleButton = new JToggleButton("New toggle button");
		
		MinKnapp minKnapp = new MinKnapp();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(button))
						.addComponent(toggleButton)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(minKnapp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(279, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(button)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(toggleButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(minKnapp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(163, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}

	
}
