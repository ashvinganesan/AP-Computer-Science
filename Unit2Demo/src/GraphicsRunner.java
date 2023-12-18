
import java.awt.Graphics;
import javax.swing.JFrame; 

/**
 *
 * @author ashvin
 */
public class GraphicsRunner extends JFrame {
    private static final int WIDTH = 640;
    private static final int HEIGHT = 480;
    
    public GraphicsRunner(){
        setSize(WIDTH,HEIGHT);
        setVisible(true);
    
    }
    public void paint(Graphics window) {
       window.setColor(Color.blue);
       window.drawRect(200, 200, 100, 50);
    }
    
}
