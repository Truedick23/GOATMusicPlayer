package ControlCircle;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.Color;

public class ControlCircle extends JFrame{
	private JButton jbtEnlarge = new JButton("Enlarge");
	private JButton jbtShrink = new JButton("Shrink");
	private CirclePanel canvas = new CirclePanel();
	private KeyboardPanel keyboardPanel = new KeyboardPanel();
	
	public ControlCircle() {
		JPanel panel = new JPanel();
		panel.add(jbtEnlarge);
		panel.add(jbtShrink);
		
		this.add(canvas, BorderLayout.CENTER);
		this.add(panel, BorderLayout.NORTH);
		this.add(keyboardPanel, BorderLayout.SOUTH);
		keyboardPanel.setFocusable(true);
		
		jbtEnlarge.addActionListener(new EnlargeListener());
		jbtShrink.addActionListener(new ShrinkListener());
	}
	
	class KeyboardPanel extends JPanel {
		private char key = ' ';
		public KeyboardPanel() {
			addKeyListener(new KeyAdapter() {
				 public void keyPressed(KeyEvent e) {
					 if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_RIGHT)
						 canvas.enlarge();
					 else if(e.getKeyCode() == KeyEvent.VK_DOWN || e.getKeyCode() == KeyEvent.VK_LEFT)
						 canvas.shrink();
					 else
						 key = e.getKeyChar();
					 repaint();
				 }
			});
		}
		
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setFont(new Font("TomesRoman", Font.PLAIN, 24));
			g.drawString(String.valueOf(key), 100, 250);
		}
	}
	
	public static void main(String[] args) {
		JFrame frame = new ControlCircle();
		frame.setTitle("ControlCircle");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 250);
		frame.setVisible(true);
	}
	
	public static Color getRandomColor() {
		Color[] colorset = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GRAY, Color.GREEN, 
				Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW};
		Random random = new Random();
		int len = colorset.length;
		int index = random.nextInt(len) % (len + 1);
		return colorset[index];
	}
	
	class EnlargeListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			canvas.enlarge();
		}
	}
	class ShrinkListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			canvas.shrink();
		}
	}
	
	class CirclePanel extends JPanel {
		private int radius = 10;
		
		public void enlarge() {
			radius++;
			repaint();
		}
		
		public void shrink() {
			radius--;
			repaint();
		}
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(getRandomColor());
			g.fillOval(getWidth() / 2 - radius, getHeight() / 2 - radius, 
					2 * radius, 2 * radius);
		}
	}
}
