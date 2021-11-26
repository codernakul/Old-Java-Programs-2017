import java.awt.*;
import javax.swing.*;

class Die_dialog

{
    JFrame f;

    Die_dialog()
    {
        f = new JFrame("GridLayout Example");

        JButton b1 = new JButton("\u2680");
        JButton b2 = new JButton("\u2681");
        JButton b3 = new JButton("\u2682");
        JButton b4 = new JButton("\u2683");
        JButton b5 = new JButton("\u2684");
        JButton b6 = new JButton("\u2685");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);

        f.setLayout(new GridLayout(3, 2));
        // setting grid layout of 3 rows and 3 columns

        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args)
    {
        new Die_dialog();
    }
}