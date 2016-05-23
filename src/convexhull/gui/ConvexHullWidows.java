/*
* Gui life cycle
* 1.- Instantiate the frame
* 2.- Initialize components
* 3.- Set Layout
* 4.- Add Events Listener
* 5.- Show gui
* */
package convexhull.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by AldoBalderrama on 5/23/2016.
 */
public class ConvexHullWidows extends JFrame
{
    private JPanel canvas;
    public  ConvexHullWidows (String title)
    {
        //tips: always
        super(title);
        //init components
        canvas = new ConvexHullCanvas();

        //set layout
        this.getContentPane().setLayout(new BorderLayout());
        this.getContentPane().add(canvas,BorderLayout.CENTER);

        this.getContentPane().add(new Button("add"),BorderLayout.NORTH);

        //add listeners
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(800,600);
    }
}
