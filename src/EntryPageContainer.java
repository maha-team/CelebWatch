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
import java.awt.Component;
import java.awt.event.MouseAdapter;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;


public class EntryPageContainer extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JFrame m_StartFrame = null;

	/**
	 * Create the frame.
	 */
	public EntryPageContainer() {
		setTitle("Welcome to CelebWatch - Sweden");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setResizable(false);
		contentPane.setLayout(null);
		
		final JButton Entertainment = new JButton("Entertainment");
		Entertainment.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					JFrame MPC = new MainPageContainer();
					((MainPageContainer)MPC).setPressedButton(0);
					MPC.setVisible(true);
					m_StartFrame = null;
					dispose();
			}
		});
		
		Entertainment.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Entertainment.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/entertainmentbuttonpressed.png")));
			}
		});

		Entertainment.setHorizontalAlignment(SwingConstants.LEADING);
		Entertainment.setAlignmentY(Component.TOP_ALIGNMENT);
		Entertainment.setPreferredSize(new Dimension(107, 36));
		Entertainment.setName("Entertainment");
		Entertainment.setMinimumSize(new Dimension(107, 36));
		Entertainment.setMaximumSize(new Dimension(107, 36));
		Entertainment.setBorderPainted(false);
		Entertainment.setBorder(null);
		Entertainment.addMouseListener(new MouseAdapter() {
		});
		
		Entertainment.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/entertainmentbutton.png")));
		Entertainment.setHorizontalTextPosition(SwingConstants.RIGHT);
		Entertainment.setForeground(Color.WHITE);
		Entertainment.setBackground(Color.WHITE);
		Entertainment.setFont(new Font("Arial", Font.BOLD, 12));
		Entertainment.setBounds(250, 280, 112, 40);
		contentPane.add(Entertainment);
		
		final JButton Politics = new JButton("");
		Politics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame MPC = new MainPageContainer();
				((MainPageContainer)MPC).setPressedButton(1);
				MPC.setVisible(true);
				m_StartFrame = null;
				dispose();
			}
		});
		
		Politics.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Politics.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/politicsbuttonpressed.png")));
			}
		});
		
		Politics.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/politicsbutton.png")));
		Politics.setBorder(null);
		Politics.setActionCommand("Politics");
		Politics.setPreferredSize(new Dimension(107, 36));
		Politics.setName("Politics");
		Politics.setMinimumSize(new Dimension(107, 36));
		Politics.setMaximumSize(new Dimension(107, 36));
		Politics.setHorizontalTextPosition(SwingConstants.RIGHT);
		Politics.setHorizontalAlignment(SwingConstants.LEADING);
		Politics.setForeground(Color.WHITE);
		Politics.setFont(new Font("Arial", Font.BOLD, 12));
		Politics.setBorderPainted(false);
		Politics.setBackground(Color.WHITE);
		Politics.setAlignmentY(0.0f);
		Politics.setBounds(360, 320, 110, 40);
		contentPane.add(Politics);
		
		final JButton Sports = new JButton("");
		Sports.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame MPC = new MainPageContainer();
				((MainPageContainer)MPC).setPressedButton(2);
				MPC.setVisible(true);
				m_StartFrame = null;
				dispose();
			}
		});
		
		Sports.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				Sports.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/sportbuttonpressed.png")));
			}
		});
		
		Sports.setBorder(null);
		Sports.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/sportbutton.png")));
		Sports.setActionCommand("Sports");
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
		Sports.setBounds(470, 360, 110, 40);
		contentPane.add(Sports);
		
		JLabel lblCelebwatchSweden = new JLabel("");
		lblCelebwatchSweden.setBorder(null);
		lblCelebwatchSweden.setBackground(Color.WHITE);
		lblCelebwatchSweden.setIcon(new ImageIcon(EntryPageContainer.class.getResource("/images/firstpage.jpg")));
		lblCelebwatchSweden.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCelebwatchSweden.setBounds(0, 0, 680, 550);
		contentPane.add(lblCelebwatchSweden);
		
	}
}
