import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JEditorPane;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;

public class Login_Form extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	int xMouse;
	int yMouse;
	private JTextField textField;
	private JPasswordField passwordField;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_Form frame = new Login_Form();
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
	public Login_Form() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 150, 650, 500);
		contentPane = new JPanel();
		contentPane.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		contentPane.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent evt) {
				int x = evt.getXOnScreen();
				int y = evt.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
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
		
		JLabel lblX = new JLabel("X");
		lblX.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent evt) {
				System.exit(0);
			}
		});
		lblX.setBounds(609, 11, 41, 37);
		lblX.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(lblX);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 233, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(68, 5, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(119, 5, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(Login_Form.class.getResource("/img/0x0.png")));
		lblNewLabel_3.setBounds(-358, 142, 581, 219);
		panel.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(425, 151, 111, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("T\u00EAn \u0110\u0103ng Nh\u1EADp");
		lblNewLabel.setBounds(314, 154, 98, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblMtKhu = new JLabel("M\u1EADt Kh\u1EA9u");
		lblMtKhu.setBounds(314, 214, 76, 14);
		contentPane.add(lblMtKhu);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(425, 211, 111, 20);
		contentPane.add(passwordField);
		
		JButton btnTruyCp = new JButton("Truy C\u1EADp");
		btnTruyCp.setBackground(Color.LIGHT_GRAY);
		btnTruyCp.setBounds(425, 289, 89, 23);
		contentPane.add(btnTruyCp);
		
		JLabel lblngNhp = new JLabel("\u0110\u0103ng Nh\u1EADp");
		lblngNhp.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblngNhp.setBounds(385, 74, 158, 37);
		contentPane.add(lblngNhp);
		
		JLabel lblcLmBi = new JLabel("\u0110\u01B0\u1EE3c l\u00E0m b\u1EDFi Th\u00E0nh Long-Nh\u00F3m 7");
		lblcLmBi.setBounds(425, 428, 215, 14);
		contentPane.add(lblcLmBi);
		
		JCheckBox chckbxNhThngTin = new JCheckBox("Nh\u1EDB Th\u00F4ng Tin");
		chckbxNhThngTin.setBackground(UIManager.getColor("RadioButtonMenuItem.selectionBackground"));
		chckbxNhThngTin.setBounds(506, 333, 116, 23);
		contentPane.add(chckbxNhThngTin);
		setUndecorated(true);
	}
}
