package Interface;

import javax.swing.*;

import java.awt.*;

public class SongListsPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private String[] ls = {"1", "2", "3"};
	private String[] others = {"4", "5", "6"};
	SongListsPanel() {
		super();
		this.setLayout(new GridLayout(2, 1));
		JList<String> mySongLists = new JList<String>(ls);
		mySongLists.setSize(300, 150);
		mySongLists.setBorder(BorderFactory.createTitledBorder("My Song Lists"));
		mySongLists.setVisibleRowCount(6);
		mySongLists.setFixedCellHeight(40);
		JPanel othersPanel = new JPanel(new BorderLayout(2, 3));
		JList<String> othersSongLists = new JList<String>(others);
		JPanel buttonsForLists = new JPanel(new GridLayout(1, 2, 1, 1));
			buttonsForLists.add(new JButton("Detailed Info"));
			buttonsForLists.add(new JButton("Management"));
			buttonsForLists.setSize(10, 150);
			buttonsForLists.setVisible(true);
		
		othersPanel.setBorder(BorderFactory.createTitledBorder("Others Song Lists"));
		
		othersSongLists.setSize(300, 150);
		
		othersSongLists.setVisibleRowCount(6);
		
		othersSongLists.setFixedCellHeight(40);
		mySongLists.setFixedCellWidth(150);
		othersSongLists.setFixedCellWidth(150);
		othersPanel.add(othersSongLists, BorderLayout.CENTER);
		othersPanel.add(buttonsForLists, BorderLayout.SOUTH);
		/*JScrollPane MyPane = new JScrollPane(mySongLists);
		JScrollPane OthersPane = new JScrollPane(othersSongLists);*/
		add(mySongLists);
		add(othersPanel);
		
		setSize(150, 400);
		setBackground(Color.BLUE);
	}
}