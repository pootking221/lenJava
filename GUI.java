import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        JTextArea t1, t2;
        t1 = new JTextArea(10, 30);
        t2 = new JTextArea(10, 30);
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(t1);
        container.add(t2);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setVisible(true);
        window.show();
    }
}
