import javax.swing.*;
import java.awt.*;

public class Namee extends JComponent {public void paintComponent(Graphics g){
    Graphics2D g2=(Graphics2D) g;
    g2.setColor(Color.GREEN);
Rectangle eye=new Rectangle(20,70,200,30);
g2.fill(eye);
g2.setColor(Color.RED);
g2.drawString("Abdul kahlaq fotieh",20,90);
}
}
