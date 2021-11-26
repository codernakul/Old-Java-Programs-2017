import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.EtchedBorder;

class MultipleEventSources extends JFrame
{
    JLabel statusbar;

    public MultipleEventSources()
    {
        initUI();
    }

    public final void initUI()
    {
        JPanel panel = new JPanel();
        statusbar = new JLabel("Click on any button");

        statusbar.setBorder(BorderFactory
                                    .createEtchedBorder(EtchedBorder.RAISED));

        panel.setLayout(null);

        JButton close = new JButton("Button 1");
        close.setBounds(40, 30, 90, 25);
        close.addActionListener(new ButtonListener());

        JButton open = new JButton("Button 2");
        open.setBounds(40, 80, 90, 25);
        open.addActionListener(new ButtonListener());

        JButton find = new JButton("Button 3");
        find.setBounds(40, 130, 90, 25);
        find.addActionListener(new ButtonListener());

        JButton save = new JButton("Button 4");
        save.setBounds(40, 180, 90, 25);
        save.addActionListener(new ButtonListener());

        panel.add(close);
        panel.add(open);
        panel.add(find);
        panel.add(save);

        add(panel);
        add(statusbar, BorderLayout.SOUTH);

        setTitle("Multiple Event Sources");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    class ButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            JButton o = (JButton) e.getSource();
            String label = o.getText();
            statusbar.setText(" " + label + " button clicked");
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                MultipleEventSources ms = new MultipleEventSources();
                ms.setVisible(true);
            }
        });
    }
}