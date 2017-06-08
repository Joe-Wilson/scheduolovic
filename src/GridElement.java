import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class GridElement {

	Rectangle self;
	Window win;
	int x, y, h, w;

	public GridElement(int x, int y, int h, int w, Window win) {
		self = new Rectangle(x, y, w, h);
		this.win = win;
		this.x = x;
		this.y = y;
		this.h = h;
		this.w = w;
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(self.x, self.y, self.width, self.height);
		g.setColor(Color.BLUE);
	}

}
