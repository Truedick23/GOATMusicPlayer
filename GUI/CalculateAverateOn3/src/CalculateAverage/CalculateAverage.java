package CalculateAverage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class CalculateAverage extends JFrame {
	private JTextField jtfNum1 = new JTextField();
	private JTextField jtfNum2 = new JTextField();
	private JTextField jtfNum3 = new JTextField();
	private JTextField jtfSum = new JTextField();
	private JTextField jtfAverage = new JTextField();
	
	private JButton jbtComputeAverage = new JButton("Compute Average Number");
	
	public CalculateAverage() {
		JPanel p1 = new JPanel(new GridLayout(5, 2));
		p1.add(new JLabel("First Number"));
		jtfNum1.setBackground(Color.LIGHT_GRAY);
		p1.add(jtfNum1);
		p1.add(new JLabel("Second Number:"));
		jtfNum2.setBackground(Color.LIGHT_GRAY);
		p1.add(jtfNum2);
		p1.add(new JLabel("Third Number:"));
		jtfNum3.setBackground(Color.LIGHT_GRAY);
		p1.add(jtfNum3);
		p1.add(new JLabel("Sum:"));
		jtfSum.setForeground(Color.YELLOW);
		jtfSum.setBackground(Color.RED);
		p1.add(jtfSum);
		p1.add(new JLabel("Average:"));
		jtfAverage.setForeground(Color.YELLOW);
		jtfAverage.setBackground(Color.RED);
		p1.add(jtfAverage);
		p1.setBorder(new TitledBorder("Enter three number: "));
		
		JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
		p2.add(jbtComputeAverage);
		add(p1, BorderLayout.CENTER);
		add(p2, BorderLayout.SOUTH);
		
		jbtComputeAverage.addActionListener(new ButtonListener());
	}
	
	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double num1 = Double.parseDouble(jtfNum1.getText());
			double num2 = Double.parseDouble(jtfNum2.getText());
			double num3 = Double.parseDouble(jtfNum3.getText());
			double sumNum = num1 + num2 + num3;
			double average = sumNum / 3;
			
			jtfSum.setText(String.format("%.2f", sumNum));
			jtfAverage.setText(String.format("%.4f", average));
		}
	}
	public static void main(String[] args) {
		CalculateAverage frame = new CalculateAverage();
		frame.pack();
		frame.setTitle("Average Calculator");
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
}
