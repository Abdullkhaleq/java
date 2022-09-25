import javax.swing.*;

public class MayName {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setSize(150,250);
        frame.setTitle("An Alien Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Namee nam=new Namee();
        frame.add(nam);
        frame.setVisible(true);
    }
}
