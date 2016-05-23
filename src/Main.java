/**
 * Created by AldoBalderrama on 5/20/2016.
 */

import convexhull.gui.ConvexHullWidows;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {
    public static void main(String[] args)
    {
        ConvexHullWidows frame = new ConvexHullWidows("ConvexHull app");
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