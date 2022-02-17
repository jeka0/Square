package com.company;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Square {
    public double side;
    public Point2D.Double[] points = new Point2D.Double[4];
    public Square(double side){this.side = side;}
    public void setStartPoint(double x, double y)
    {
        points[0] =new Point2D.Double(x,y);
        points[1] =new Point2D.Double(x,y-side);
        points[2] =new Point2D.Double(x + side,y - side);
        points[3] =new Point2D.Double(x + side,y);
    }
}
