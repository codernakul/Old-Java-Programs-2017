import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TooltipExample extends JFrame {

	public TooltipExample() {

		initUI();
	}

	private void initUI() {

		JPanel panel = new JPanel();
		getContentPane().add(panel);

		panel.setLayout(null);
		panel.setToolTipText("This is panel");

		JButton btn = new JButton("Button");
		btn.setBounds(100, 60, 100, 30);
		btn.setToolTipText("This is a button");

		panel.add(btn);

		setTitle("Tooltip");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {

				TooltipExample ex = new TooltipExample();
				ex.setVisible(true);

			}
		});
	}
}