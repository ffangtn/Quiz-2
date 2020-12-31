import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class quiz2 {

	private JFrame frmWaterCalculator;
	private JTextField textFieldNum1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quiz2 window = new quiz2();
					window.frmWaterCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public quiz2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWaterCalculator = new JFrame();
		frmWaterCalculator.getContentPane().setBackground(Color.CYAN);
		frmWaterCalculator.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmWaterCalculator.setTitle("Water Calculator");
		frmWaterCalculator.setBounds(100, 100, 450, 300);
		frmWaterCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWaterCalculator.getContentPane().setLayout(null);
		
		JLabel lblEnterYourWeight = new JLabel("How much water you should drink a day?");
		lblEnterYourWeight.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblEnterYourWeight.setBounds(55, 51, 343, 44);
		frmWaterCalculator.getContentPane().add(lblEnterYourWeight);
		
		JLabel lblNewLabel = new JLabel("Enter your weight in kg :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblNewLabel.setBounds(20, 134, 183, 25);
		frmWaterCalculator.getContentPane().add(lblNewLabel);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setBounds(193, 126, 173, 44);
		frmWaterCalculator.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		JButton btnTellMe = new JButton("Tell Me");
		btnTellMe.setForeground(Color.BLUE);
		btnTellMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double litre ;
				double weight =Double.parseDouble(textFieldNum1.getText());
				try {
					litre= weight*0.033;
					String litree = String.format("%.2f",litre);
					JOptionPane.showMessageDialog(null, "Buddy You Should drink " + litree + "L a day!");
					
					}	catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Number");
				}
				}
		});
		btnTellMe.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		btnTellMe.setBounds(169, 192, 106, 23);
		frmWaterCalculator.getContentPane().add(btnTellMe);
	}
}
