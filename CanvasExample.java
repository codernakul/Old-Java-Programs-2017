import java.awt.*;
import javax.swing.JFrame;

public class CanvasExample extends Canvas {

	public void paint(Graphics g) {

		Toolkit t = Toolkit.getDefaultToolkit();
		Image i = t.getImage("bugs.gif");
		g.drawImage(i, 10, 10, this);

	}

	public static void main(String[] args) {
		
		CanvasExample m = new CanvasExample();
		JFrame f = new JFrame("Canvas Example");
		f.add(m);
		f.setSize(300, 300);
		f.setVisible(true);
		
	}

}