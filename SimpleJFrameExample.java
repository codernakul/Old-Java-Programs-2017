import javax.swing.JFrame;

class SimpleJFrameExample extends JFrame
{
    public SimpleJFrameExample()
    {
        setTitle("Simple JFrame Example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        SimpleJFrameExample ex = new SimpleJFrameExample();
    }
}