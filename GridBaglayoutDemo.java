import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class GridBaglayoutDemo extends Applet
{
    protected void makeButton(String name, GridBagLayout gridbag, GridBagConstraints gbc)
    {
        Button b = new Button(name);
        gridbag.setConstraints(b, gbc);
        b.setBackground(Color.lightGray);
        add(b);
    }

    public void init()
    {
        GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();

        setFont(new Font("Elephanta", Font.PLAIN, 20));
        setLayout(gridbag);

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;       //first column  
        gbc.gridy = 0;       //first row  
        makeButton("Button1", gridbag, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        makeButton("Button2", gridbag, gbc);

        gbc.gridx = 2;
        gbc.gridy = 0;
        makeButton("Button3", gridbag, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 40;         //make this component tall  
        gbc.gridwidth = 3;     //3 column wide  
        gbc.gridx = 0;
        gbc.gridy = 1;      //second row  
        makeButton("Button4", gridbag, gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 0;       //reset to default  
        gbc.anchor = GridBagConstraints.PAGE_END; //bottom of space  
        gbc.insets = new Insets(20, 0, 0, 0);   //top padding  
        gbc.gridx = 1;       //aligned with button 2  
        gbc.gridwidth = 2;      //2 columns wide  
        gbc.gridy = 2;       //third row  
        makeButton("Button5", gridbag, gbc);
    }

    public static void main(String s[])
    {
        Frame f = new Frame("GridBagLayout Demo");
        GridBaglayoutDemo gbl = new GridBaglayoutDemo();

        gbl.init();
        f.add("Center", gbl);
        f.pack();
        f.setSize(f.getPreferredSize());
        f.show();

        f.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
}  