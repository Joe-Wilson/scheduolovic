import java.awt.Color;
import java.awt.Graphics;

public class ClassElement extends GridElement {

	public ClassElement(int x, int y, int h, int w, Window win) {
		super(x, y, h, w, win);

	}

	@Override
	public void draw(Graphics g) {
		int yPos = y + h / 2;
		super.draw(g);
		g.setColor(Color.RED);
		g.drawString("test class", x, yPos);
	}
}
