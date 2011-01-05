import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.GridLayout;


public class MainPageContainer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JButton Entertainment;
	JButton Politics;
	JButton Sports;
	private int PressedButton = 0;
	private JPanel sidepanel1;
	private JLabel image;
	private JLabel label;
	private Table t;

	public void ButtonPressed(){
				  
		/*/
		 * clears all info from sidepanel1
		 */
		sidepanel1.removeAll();
		
		/*/
		 *Entertainment button pressed
		 */
		if (PressedButton == 0) {
			Entertainment.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/entertainmentbuttonpressed.png")));
			Politics.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/politicsbutton.png")));
			Sports.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/sportbutton.png")));
			
			/*/
			 * reads the csv file and imports the images into the sidepanel1
			 */
			for( int i = 0; i < t.getRowCount(); i++ ) {
				int y = 0;
				//System.out.println("cat: " + t.getRowCat(i));
			    if (t.getRowCat(i).compareTo("Entertainment") == 0) {
			    	String bild = "/images/"+t.getImageName(i);
			    	JLabel lblImage = new JLabel("Image");
					lblImage.setIcon(new ImageIcon(MainPageContainer.class.getResource(bild)));
					sidepanel1.add(lblImage);
			    }
			}	
			}
		
		/*/
		 *Politics button pressed
		 */
		if (PressedButton == 1) { 
			Entertainment.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/entertainmentbutton.png")));
			Politics.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/politicsbuttonpressed.png")));
			Sports.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/sportbutton.png")));
			
			/*/
			 * reads the csv file and imports the images into the sidepanel1
			 */
			for( int i = 0; i < t.getRowCount(); i++ ) {
				int y = 0;
				//System.out.println("cat: " + t.getRowCat(i));
			    if (t.getRowCat(i).compareTo("Politics") == 0) {
			    	String bild = "/images/"+t.getImageName(i);
			    	JLabel lblImage = new JLabel("Image");
					lblImage.setIcon(new ImageIcon(MainPageContainer.class.getResource(bild)));
					sidepanel1.add(lblImage);
			    }
			    	
			}
		}
		
		/*/
		 *Sports button pressed
		 */
		if (PressedButton == 2) { 
			Entertainment.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/entertainmentbutton.png")));
			Politics.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/politicsbutton.png")));
			Sports.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/sportbuttonpressed.png")));
			
			/*/
			 * reads the csv file and imports the images into the sidepanel1
			 */
			for( int i = 0; i < t.getRowCount(); i++ ) {
				int y = 0;
				//System.out.println("cat: " + t.getRowCat(i));
			    if (t.getRowCat(i).compareTo("Sports") == 0) {
			    	String bild = "/images/"+t.getImageName(i);
			    	JLabel lblImage = new JLabel("Image");
					lblImage.setIcon(new ImageIcon(MainPageContainer.class.getResource(bild)));
					sidepanel1.add(lblImage);
			    }
			    	
			}
		}
	}
	
	/**
	 * Create the frame.
	 */
	public MainPageContainer() {
		
		 t = new Table("name.csv");
		
		setTitle("CelebWatch Main Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		
		sidepanel1 = new JPanel();
		sidepanel1.setBackground(Color.WHITE);
		sidepanel1.setForeground(Color.WHITE);
		sidepanel1.setBounds(440, 65, 220, 460);
		contentPane.add(sidepanel1);
		sidepanel1.setLayout(new GridLayout(10, 2, 5, 5));
		
		label = new JLabel("image");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setForeground(Color.BLACK);
		sidepanel1.add(label);
		
		/*/
		 * Entertainment button
		 */
		Entertainment = new JButton("");
		Entertainment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame MPC = new MainPageContainer();
				((MainPageContainer)MPC).setPressedButton(0);
				MPC.setVisible(true);
				dispose();
			}
		});
		
		Entertainment.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/entertainmentbutton.png")));
		Entertainment.setPreferredSize(new Dimension(107, 36));
		Entertainment.setName("Entertainment");
		Entertainment.setMinimumSize(new Dimension(107, 36));
		Entertainment.setMaximumSize(new Dimension(107, 36));
		Entertainment.setHorizontalTextPosition(SwingConstants.CENTER);
		Entertainment.setForeground(Color.WHITE);
		Entertainment.setFont(new Font("Arial", Font.BOLD, 12));
		Entertainment.setBorderPainted(false);
		Entertainment.setBackground(Color.WHITE);
		Entertainment.setAlignmentY(0.0f);
		Entertainment.setBounds(10, 10, 110, 40);
		contentPane.add(Entertainment);
		
		/*/
		 * Politics button
		 */
		Politics = new JButton("");
		Politics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame MPC = new MainPageContainer();
				((MainPageContainer)MPC).setPressedButton(1);
				MPC.setVisible(true);
				dispose();
			}
		});
		Politics.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/politicsbutton.png")));
		Politics.setPreferredSize(new Dimension(107, 36));
		Politics.setName("Politics");
		Politics.setMinimumSize(new Dimension(107, 36));
		Politics.setMaximumSize(new Dimension(107, 36));
		Politics.setHorizontalTextPosition(SwingConstants.CENTER);
		Politics.setForeground(Color.WHITE);
		Politics.setFont(new Font("Arial", Font.BOLD, 12));
		Politics.setBorderPainted(false);
		Politics.setBackground(Color.WHITE);
		Politics.setAlignmentY(0.0f);
		Politics.setBounds(120, 10, 110, 40);
		contentPane.add(Politics);
		
		/*/
		 * Sportsbutton
		 */
		Sports = new JButton("");
		Sports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame MPC = new MainPageContainer();
				((MainPageContainer)MPC).setPressedButton(2);
				MPC.setVisible(true);
				dispose();
			}
		});
		Sports.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/sportbutton.png")));
		Sports.setPreferredSize(new Dimension(107, 36));
		Sports.setName("Sports");
		Sports.setMinimumSize(new Dimension(107, 36));
		Sports.setMaximumSize(new Dimension(107, 36));
		Sports.setHorizontalTextPosition(SwingConstants.CENTER);
		Sports.setForeground(Color.WHITE);
		Sports.setFont(new Font("Arial", Font.BOLD, 12));
		Sports.setBorderPainted(false);
		Sports.setBackground(Color.WHITE);
		Sports.setAlignmentY(0.0f);
		Sports.setBounds(230, 10, 110, 40);
		contentPane.add(Sports);
		
		
		JLabel bodyImage = new JLabel("New label");
		bodyImage.setBounds(25, 73, 101, 99);
		contentPane.add(bodyImage);
		
		/*/
		 * MainWindow container
		 */
		JLabel MainCelebwatch = new JLabel("");
		MainCelebwatch.setForeground(Color.WHITE);
		MainCelebwatch.setFont(new Font("Arial", Font.BOLD, 12));
		MainCelebwatch.setIcon(new ImageIcon(MainPageContainer.class.getResource("/images/bakgrund.jpg")));
		MainCelebwatch.setHorizontalAlignment(SwingConstants.CENTER);
		MainCelebwatch.setBounds(0, 0, 680, 550);
		contentPane.add(MainCelebwatch);

	}

	public void setPressedButton(int pressedButton) {
		PressedButton = pressedButton;
		ButtonPressed();
	}
}
