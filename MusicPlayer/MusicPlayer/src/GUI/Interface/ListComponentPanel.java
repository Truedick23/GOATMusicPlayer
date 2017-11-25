package Interface;
import javax.swing.*;
import java.awt.*;
public class ListComponentPanel extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTable songTable;
	private JScrollPane scrollPane;
	ListComponentPanel(){
		super();
		BorderLayout border = new BorderLayout(2, 2);
		setLayout(border);
		JPanel ButtonSet = new JPanel();
			ButtonSet.setLayout(new GridLayout(1, 2, 5, 5));
			ButtonSet.add(new JButton("Play All"));
			ButtonSet.add(new JButton("Download ALL"));
			ButtonSet.setSize(50, 100);
			ButtonSet.setVisible(true);
		//songListPic.setSize(25, 50);
		
		String[] titles = {"Name", "Singer", "Length", "Play", "Download"};
		String[][] data = {{"Rap God", "Eminem", "6:03", "YES", "NO"},};
		songTable = new JTable(data, titles);
		scrollPane = new JScrollPane(songTable);
		scrollPane.setBorder(BorderFactory.createTitledBorder("Songs In The Lists"));
		add(scrollPane, BorderLayout.CENTER);
		add(new BasicInfoPanelWithControl(), BorderLayout.NORTH);
		add(ButtonSet, BorderLayout.SOUTH);
		setSize(600, 400);
		setVisible(true);
	}
}
