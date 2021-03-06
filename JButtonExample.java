import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class JButtonExample extends JFrame
{
    JPanel panel = new JPanel();
    JButton button = new JButton("nakul");

    JButtonExample() // the frame constructor
    {
        super("JButton Example");

        setBounds(100, 100, 300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container con = this.getContentPane(); // inherit main frame
        con.add(panel); // JPanel containers default to FlowLayout

        button.setMnemonic('P'); // associate hotkey to button
        panel.add(button);
        button.requestFocus();

        setVisible(true); // make frame visible
    }

    public static void main(String args[])
    {
        new JButtonExample();
    }
}