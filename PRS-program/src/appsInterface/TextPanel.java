package appsInterface;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextPanel extends JPanel {

	public TextPanel() {
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Consolas",Font.PLAIN,20));
		this.add(textArea);
	}
}
