package exercise3;

import javax.swing.*;
import java.awt.*;

public class Panel extends JFrame {
	SubPanel myPanel = new SubPanel();

	public Panel(Drawable[] drawables) {
		super("Panel");
		this.myPanel.setBackground(Color.white);
		this.myPanel.draw(drawables);
		this.setDefaultCloseOperation(3);
		Container contentPane = this.getContentPane();
		contentPane.add(this.myPanel);
		this.setSize(300, 300);
		this.setVisible(true);
	}
}
