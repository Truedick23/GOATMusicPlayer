package Interface;

import java.awt.*;
import java.util.Date;

import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BasicInfoPanelWithControl extends JPanel{

	private static final long serialVersionUID = 1L;
	private String songName = "Rap God";
	private String performer = "Eminem";
	private String albumName = "Rap God";
	private String songList = "Annoymous";
	private int builderNumber = 1;
	private String path = "D:/aa.jpg";
	ImageIcon listPic;
	
	public BasicInfoPanelWithControl() {
		super();
		setLayout(new BorderLayout());
		JPanel infoWithoutPic = new JPanel(new GridLayout(7, 1, 4, 4));
			infoWithoutPic.add(new JLabel("Song: " + songName, JLabel.CENTER));
			infoWithoutPic.add(new JLabel("Performer: " + performer, JLabel.CENTER));
			infoWithoutPic.add(new JLabel("Album: " + albumName, JLabel.CENTER));
			infoWithoutPic.add(new JLabel("Song List: " + songList, JLabel.CENTER));
			infoWithoutPic.add(new JLabel("Builder Number: " + builderNumber,JLabel.CENTER));
			infoWithoutPic.add(new JLabel("Date " + (new Date()).toString(),JLabel.CENTER));
			infoWithoutPic.setPreferredSize(new Dimension(50, 150));
			infoWithoutPic.setBackground(Color.LIGHT_GRAY);
		JPanel composedWithControl = new JPanel(new BorderLayout());
			composedWithControl.add(infoWithoutPic, BorderLayout.CENTER);
			composedWithControl.add(new ButtonControl(), BorderLayout.SOUTH);
			
		listPic = new ImageIcon(path);
			int picWidth = 250;
			int picHeight = 250 * listPic.getIconHeight() / listPic.getIconWidth();
			listPic.setImage(listPic.getImage().getScaledInstance(picWidth, picHeight, Image.SCALE_DEFAULT));
			JLabel listPicLabel = new JLabel(listPic);
			listPicLabel.setPreferredSize(new Dimension(picWidth, picHeight));
			
		add(new JLabel(listPic), BorderLayout.WEST);
		add(composedWithControl, BorderLayout.CENTER);
		//add(new ButtonControl(), BorderLayout.SOUTH);
		setSize(150, 500);
		setVisible(true);
	}
}
