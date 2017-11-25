package Interface;
import javax.swing.*;
import java.awt.*;
public class Interface extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel SongListsPanel = new SongListsPanel();
	private JPanel CurrentSongListPanel = new ListComponentPanel();
	public Interface() {
		this.setLayout(new BorderLayout());
		add(SongListsPanel, BorderLayout.WEST);
		add(CurrentSongListPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		Interface player = new Interface();
		player.setTitle("Music Player");
		player.setSize(1000, 700);
		player.setLocationRelativeTo(null);
		player.setDefaultCloseOperation(EXIT_ON_CLOSE);
		player.setVisible(true);
	}
}
