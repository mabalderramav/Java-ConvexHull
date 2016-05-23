/**
 * Created by AldoBalderrama on 5/23/2016.
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Line2D;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Panel extends JFrame {
    public Panel() {
        super("Lines Drawing Demo");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    void drawLines(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //Plano Carteciano
        g2d.drawLine(200, 50, 200, 450);
        g2d.drawLine(150, 400, 600, 400);

        //Eje Y
        g2d.drawLine(200 - 10, 300, 200 + 10, 300);
        g2d.drawLine(200 - 10, 200, 200 + 10, 200);
        g2d.drawLine(200 - 10, 100, 200 + 10, 100);

        //Eje X
        g2d.drawLine(300, 400 - 10, 300, 400 +10);
        g2d.drawLine(400, 400 - 10, 400, 400 + 10);
        g2d.drawLine(500, 400 - 10, 500, 400 + 10);

        //g2d.draw(new Line2D.Double(59.2d, 99.8d, 419.1d, 99.8d));

        //g2d.draw(new Line2D.Float(21.50f, 132.50f, 459.50f, 132.50f));

    }

    public void paint(Graphics g) {
        super.paint(g);
        drawLines(g);
    }

    public static void main(String[] args) {
        Panel myPanel = new Panel();
        /*SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                myPanel.setVisible(true);
            }
        });*/
        myPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);

                System.out.println("Click at : (" + mouseEvent.getX() + "," + mouseEvent.getY() + ")");
            }
        });
        myPanel.setVisible(true);
    }
}
