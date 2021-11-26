import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CardLayoutDemo extends JFrame implements ActionListener
{
    CardLayout card;
    JButton b1, b2, b3;
    Container c;

    CardLayoutDemo()
    {
        c = getContentPane();
        //create CardLayout object with 40 horizontal space and 30 vertical space
        card = new CardLayout(40, 30);

        c.setLayout(card);

        b1 = new JButton("Card 1.");
        b2 = new JButton("Card 2.");
        b3 = new JButton("Card 3.");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        c.add("a", b1);
        c.add("b", b2);
        c.add("c", b3);
    }

    public void actionPerformed(ActionEvent e)
    {
        card.next(c);
    }

    public static void main(String args[])
    {
        CardLayoutDemo cl = new CardLayoutDemo();
        cl.setSize(400, 400);
        cl.setVisible(true);
        cl.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}