import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import java.text.*;
public class CalculatetTwoNumber extends JFrame {

	private JPanel contentPane;
	private JTextField texttnumber1;
	private JTextField textnumber2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatetTwoNumber frame = new CalculatetTwoNumber();
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
	public CalculatetTwoNumber() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 290);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblnumber1 = new JLabel("Enter Number1");
		lblnumber1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblnumber1.setBounds(60, 12, 147, 14);
		contentPane.add(lblnumber1);
		
		JLabel lblnumber2 = new JLabel("Enter Number2");
		lblnumber2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblnumber2.setBounds(60, 48, 104, 26);
		contentPane.add(lblnumber2);
		
		texttnumber1 = new JTextField();
		texttnumber1.setBounds(212, 11, 186, 20);
		contentPane.add(texttnumber1);
		texttnumber1.setColumns(10);
		
		JLabel lblOperator = new JLabel("Operator");
		lblOperator.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOperator.setBounds(60, 86, 104, 14);
		contentPane.add(lblOperator);
		
		JComboBox cmdOperator = new JComboBox();
		cmdOperator.setBounds(212, 84, 86, 22);
		cmdOperator.addItem("+"); 
		cmdOperator.addItem("-");  
		cmdOperator. addItem("*"); 
		cmdOperator. addItem("/");
		contentPane.add(cmdOperator);
		
		
		JLabel lbldigit = new JLabel("How to show digit");
		lbldigit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbldigit.setBounds(60, 116, 119, 26);
		contentPane.add(lbldigit);
		
		JRadioButton DG1 = new JRadioButton("1 digit");
		DG1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DG1.setBounds(212, 123, 161, 23);
		contentPane.add(DG1);
		
		JRadioButton DG2 = new JRadioButton("2 digit");
		DG2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		DG2.setBounds(212, 144, 109, 23);
		contentPane.add(DG2);
		
		ButtonGroup group = new ButtonGroup();
		group.add(DG1);
		group.add(DG2);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblResult.setBounds(159, 163, 103, 38);
		contentPane.add(lblResult);
		
	    final JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1,num2,sum=0;
				String Operator;
						if(e.getSource()==btnOK) {
							num1 = Double.parseDouble(texttnumber1.getText());
							num2 = Double.parseDouble(textnumber2.getText());
							sum = num1+num2;
							Operator = (String)cmdOperator.getSelectedItem();
							if(Operator.equals("+"))
								sum = num1+num2;
							if(Operator.equals("-"))
								sum = num1-num2;
							if(Operator.equals("*"))
								sum = num1*num2;
							if(Operator.equals("/"))
								sum = num1/num2;
							
							DecimalFormat frmNumber = null;
							if(DG1.isSelected())
								frmNumber = new DecimalFormat("#,###.0");
							else if(DG2.isSelected())
								frmNumber = new DecimalFormat("#,###.00");
												
					  lblResult.setText(frmNumber.format(sum));
						}
			}
		});
		btnOK.setBounds(86, 202, 103, 38);
		contentPane.add(btnOK);
		
		JButton btnCancle = new JButton("EXIT");
		btnCancle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancle.setBounds(217, 202, 104, 38);
		contentPane.add(btnCancle);
		
		textnumber2 = new JTextField();
		textnumber2.setBounds(212, 53, 186, 20);
		contentPane.add(textnumber2);
		textnumber2.setColumns(10);
		
		
		
		
		
		
		
	}
}
