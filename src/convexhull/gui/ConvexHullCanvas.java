package convexhull.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by AldoBalderrama on 5/23/2016.
 */
public class ConvexHullCanvas extends JPanel {
    public  ConvexHullCanvas()
    {
        super();
        setBackground(Color.BLUE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                System.out.println("Click (" + mouseEvent.getX() +"," + mouseEvent.getY() + ")");
            }
        });
    }
    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Plano Carteciano
        g2d.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        g2d.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
        g2d.fillOval((this.getWidth() / 2) - 10,(this.getHeight() / 2) - 10, 20, 20);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }
}
