import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Traffic extends JComponent  {public void paintComponent(Graphics g){
Graphics2D g1=( Graphics2D) g;
    Ellipse2D.Double fact=new Ellipse2D.Double(5,10,100,150);
    g1.draw(fact);
    g1.setColor(Color.GREEN);
    Rectangle eye=new Rectangle(45,110,20,20);
    g1.fill(eye);
    g1.setColor(Color.yellow);
    Rectangle eye1=new Rectangle(45,80,20,20);
    g1.fill(eye1);
    g1.setColor(Color.RED);
    Rectangle eye2=new Rectangle(45,50,20,20);
    g1.fill(eye2);

}
}

