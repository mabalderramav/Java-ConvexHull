/**
 * Created by AldoBalderrama on 5/20/2016.
 */

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("ConvexHull app");
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent mouseEvent) {
                super.mouseClicked(mouseEvent);

                System.out.println("Click at : (" + mouseEvent.getX() + "," + mouseEvent.getY() + ")");
            }
        });
        frame.setVisible(true);
    }
}