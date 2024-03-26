import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginPanel {

	private JFrame frmLogin;
	private JLayeredPane layeredPane;
	private JPanel Register;
	private JPanel Login;
	private JButton btnRegisterButton;
	private JButton btnRegisterAccountButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPanel window = new LoginPanel();
					window.frmLogin.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPanels(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	/**
	 * Create the application.
	 */
	public LoginPanel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 434, 261);
		frmLogin.getContentPane().add(layeredPane);
		
		Login = new JPanel();
		Login.setBounds(0, 0, 434, 261);
		layeredPane.add(Login);
		Login.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Login");
		lblNewLabel_1.setBounds(10, 11, 198, 14);
		Login.add(lblNewLabel_1);
		
		btnRegisterButton = new JButton("Register");
		btnRegisterButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(Register);
				
			}
		});
		btnRegisterButton.setBounds(149, 122, 89, 23);
		Login.add(btnRegisterButton);
		

		
		
		Register = new JPanel();
		Register.setBounds(0, 0, 434, 261);
		layeredPane.add(Register);
		Register.setLayout(null);
		
		btnRegisterAccountButton = new JButton("Register account");
		btnRegisterAccountButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				switchPanels(Login);
				
			}
		});
		btnRegisterAccountButton.setBounds(138, 227, 140, 23);
		Register.add(btnRegisterAccountButton);
		
		textField = new JTextField();
		textField.setBounds(167, 100, 86, 20);
		Register.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(167, 131, 86, 20);
		Register.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(167, 162, 86, 20);
		Register.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(167, 193, 86, 20);
		Register.add(textField_3);
		textField_3.setColumns(10);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setBounds(10, 103, 147, 14);
		Register.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setBounds(10, 134, 147, 14);
		Register.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4.setBounds(10, 165, 147, 14);
		Register.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5.setBounds(10, 196, 147, 14);
		Register.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("State thy identity");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(138, 30, 140, 59);
		Register.add(lblNewLabel_6);
		
		
		
		switchPanels(Login);
	}
	public JLayeredPane getLayeredPane() {
		return layeredPane;
	}
	public JPanel getRegister() {
		return Register;
	}
	public JPanel getLogin() {
		return Login;
	}
}
