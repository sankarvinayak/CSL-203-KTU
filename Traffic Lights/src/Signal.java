import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Signal extends JPanel{
    Color on;
    int radius = 40;
    int border = 10;
    boolean change;
    Signal(Color color){
        on = color;
        change = false;
    }
    public void turnOn(boolean a){
        change = a;
        repaint();      
    }
    public Dimension getPreferredSize(){
        int size = (radius+border)*2;
        return new Dimension( size, size );
    }
    public void paintComponent(Graphics graphics){
        graphics.setColor( Color.black );
        graphics.fillRect(0,0,getWidth(),getHeight());
        if (change){
            graphics.setColor( on );
        } else {
            graphics.setColor( on.darker().darker().darker() );
        }
        graphics.fillOval( border,border,2*radius,2*radius );
    }
}