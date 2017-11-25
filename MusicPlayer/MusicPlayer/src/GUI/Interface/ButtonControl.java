package Interface;
import javax.swing.*;
import java.awt.*;

public class ButtonControl extends JPanel{
	private static final long serialVersionUID = 1L;
	private JButton PlayAndPauseButton;
	private JButton previousButton;
	private JButton nextButton;

	private JComboBox<String> PlayModeCombo;
	public ButtonControl() {
		super();
		setLayout(new GridLayout(1, 4, 5, 5));
		Dimension buttonSize = new Dimension(30, 30);
		previousButton = new JButton("Previous");
			previousButton.setPreferredSize(buttonSize);
		nextButton = new JButton("Next");
			nextButton.setPreferredSize(buttonSize);
		PlayAndPauseButton = new JButton("Play / Pause");
			PlayAndPauseButton.setPreferredSize(buttonSize);
		PlayModeCombo = new JComboBox<String>(new String[]{"Ramdomly", "Orderly", "Single"});
		add(previousButton);
		add(nextButton);
		add(PlayAndPauseButton);
		add(PlayModeCombo);
		setSize(50, 200);
	}
}
