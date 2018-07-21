import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class TeamApp extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	int xMouse;
	int yMouse;
	private JTable table;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeamApp frame = new TeamApp();
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
	public TeamApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 50, 1200, 750);
		contentPane = new JPanel();
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
				int y = evt.getYOnScreen();
				setLocation(x - xMouse,y - yMouse);
			}
		});
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent evt) {
				xMouse = evt.getX();
				yMouse = evt.getY();
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 176, 750);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(UIManager.getColor("RadioButtonMenuItem.foreground"));
		panel_2.setBounds(0, 0, 176, 33);
		panel.add(panel_2);
		
		JLabel lblDanhMcKhch = new JLabel("Danh m\u1EE5c kh\u00E1ch h\u00E0ng");
		lblDanhMcKhch.setForeground(UIManager.getColor("ScrollBar.track"));
		lblDanhMcKhch.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDanhMcKhch.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionForeground"));
		panel_2.add(lblDanhMcKhch);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(UIManager.getColor("RadioButtonMenuItem.foreground"));
		panel_3.setForeground(UIManager.getColor("RadioButtonMenuItem.foreground"));
		panel_3.setBounds(0, 56, 176, 33);
		panel.add(panel_3);
		
		JLabel lblThngTinNhn = new JLabel("Th\u00F4ng tin nh\u00E2n vi\u00EAn[Developing]");
		lblThngTinNhn.setForeground(Color.WHITE);
		lblThngTinNhn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblThngTinNhn.setBackground(Color.WHITE);
		panel_3.add(lblThngTinNhn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		panel_1.setBounds(177, 0, 1023, 750);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				System.exit(0);
			}
		});
		lblX.setBounds(983, 11, 30, 25);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 30));
		panel_1.add(lblX);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(50, 118, 943, 621);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel = new JLabel("Danh M\u1EE5c Kh\u00E1ch H\u00E0ng");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setBounds(324, 47, 590, 60);
		panel_1.add(lblNewLabel);
		setUndecorated(true);
		setResizable(true);
	}
}
