package Ysoft;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class project {

	private JFrame frame;
	private JTextField username_text;
	private JTextField password_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project window = new project();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public project() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 697, 540);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setBounds(12, 13, 327, 467);
		frame.getContentPane().add(leftPanel);
		leftPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-3, 465, 322, -465);
		leftPanel.add(lblNewLabel);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(351, 13, 316, 467);
		frame.getContentPane().add(rightPanel);
		rightPanel.setLayout(null);
		
		JButton loginBttn = new JButton("Login");
		loginBttn.setBounds(92, 343, 143, 41);
		rightPanel.add(loginBttn);
		
		username_text = new JTextField();
		username_text.setBounds(65, 119, 192, 41);
		rightPanel.add(username_text);
		username_text.setColumns(10);
		
		password_text = new JTextField();
		password_text.setBounds(65, 187, 192, 41);
		rightPanel.add(password_text);
		password_text.setColumns(10);
	}
}
