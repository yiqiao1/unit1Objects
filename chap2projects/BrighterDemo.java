import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class BrighterDemo extends JComponent
{
    public void paintComponent(Graphics g)
    { 
            Graphics2D g2 = (Graphics2D) g;
        
            JFrame frame = new JFrame();
            frame.setSize(1000, 1000);
            Color myColor = new Color(60, 10, 50);
            frame.getContentPane().setBackground(myColor);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        
            g2.setColor(Color.BLUE);
            g2.drawString("Hello, World!", 0, 0);
        }
    }