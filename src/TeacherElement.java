import java.awt.Graphics;

public class TeacherElement extends GridElement {

	public TeacherElement(int x, int y, int h, int w, Window win) {
		super(x, y, h, w, win);

	}

	@Override
	public void draw(Graphics g) {
		int yPos = y + h / 2;
		super.draw(g);
		g.drawString("test", x, yPos);
	}

}
