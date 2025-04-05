import java.awt.*;
import java.awt.event.*;
public class ColorSwitch {
public static void main(String[] args) {
Frame f = new Frame("Color Switch");
Button b = new Button("Change Color");
b.addActionListener(e -> {
Color c = new Color(
(int)(Math.random() * 255),
(int)(Math.random() * 255),
(int)(Math.random() * 255)
);
f.setBackground(c);
});
f.add(b);
f.setSize(200, 200);
f.setVisible(true);
}
}