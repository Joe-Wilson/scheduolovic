import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EditWindow extends JFrame {

	public EditWindow(int h, int w) {
		super("Edit");
		this.setLayout(null);
		this.setSize(w, h);

		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField name = new JTextField("Student ID");
		name.setBounds(0, 50, 100, 50);
		this.add(name);

		JTextField period = new JTextField("Class ID");
		period.setBounds(0, 100, 100, 50);
		this.add(period);

		JButton add = new JButton("Add to Class");
		add.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println(name.getText());
				System.out.println(period.getText());

			}
		});

		add.setBounds(0, 0, 100, 50);
		this.add(add);

		this.setVisible(true);
	}

}
