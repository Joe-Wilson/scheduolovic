import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Window extends JFrame {
	TeacherElement t;
	ClassElement c;

	public Window() {
		this.setSize(1000, 1000);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		t = new TeacherElement(13, 100, 50, 50, this);
		c = new ClassElement(75, 100, 60, 60, this);

	}

	public void paint(Graphics g) {

		t.draw(g);
		c.draw(g);

		for (int i = 0; i < 9; i++) {
			g.setColor(Color.GREEN);
			g.drawString("Period: " + (i + 1), 100 * i + 75, 50);
		}
	}

}
