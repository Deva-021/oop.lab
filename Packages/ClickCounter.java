import java.awt.*;
import java.awt.event.*;

public class ClickCounter {
    public static void main(String[] args) {
        Frame f = new Frame("Click Counter");
        Button b = new Button("Click Me");
        Label l = new Label("Clicks: 0");
        
        b.addActionListener(e -> {
            int count = Integer.parseInt(l.getText().split(" ")[1]) + 1;
            l.setText("Clicks: " + count);
        });
        
        f.add(b, BorderLayout.CENTER);
        f.add(l, BorderLayout.SOUTH);
        f.setSize(200, 100);
        f.setVisible(true);
    }
}