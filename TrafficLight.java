import javax.swing.*;

public class TrafficLight {
    public static void main(String[] args) {
        JFrame traffic=new JFrame();
        traffic.setSize(100,200);
        traffic.setTitle("Hello");
        traffic.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Traffic light=new Traffic();
        traffic.add(light);
        traffic.setVisible(true);
    }

}
