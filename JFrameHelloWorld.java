import javax.swing.*;

class JFrameHelloWorld
{

    private static void createAndShowGUI()
    {
        // Create and set up the window.
        JFrame frame = new JFrame("HelloWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //setting the height, width and position
        //of the frame
        frame.setBounds(100, 100, 200, 100);

        // Add the "Hello World" label.
        JLabel label = new JLabel("Hello World");
        frame.getContentPane().add(label);

        // Display the window.
        frame.setVisible(true);
    }

    public static void main(String[] args)
    {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable()
        {
            public void run()
            {
                createAndShowGUI();
            }
        });
    }
}