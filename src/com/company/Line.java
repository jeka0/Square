package com.company;

import java.awt.geom.Point2D;

public class Line {
    public Point2D.Double firstPointOfLine, lastPointOfLine;
    public Line(){}
    public Line(Point2D.Double firstPointOfLine, Point2D.Double lastPointOfLine)
    {
        this.firstPointOfLine = firstPointOfLine;
        this.lastPointOfLine = lastPointOfLine;
    }
    /*public boolean pointBelongLine(Point2D.Double point)
    {
        return point.getY()==determineYByXFromLine(point.getX());
    }*/
    public double determineYByXFromLine( double x)
    {
        return ((x-firstPointOfLine.getX())*(lastPointOfLine.getY()-firstPointOfLine.getY()))/(lastPointOfLine.getX()-firstPointOfLine.getX())+firstPointOfLine.getY();
    }
    public double calculateLineAngle()
    {
        double hight = firstPointOfLine.getY() - lastPointOfLine.getY(),
                width = lastPointOfLine.getX() - firstPointOfLine.getX();
        return Math.toDegrees(Math.asin(hight/Math.sqrt(hight*hight + width*width)));
    }
   /* public Point2D.Double lineIntersectionPoint(Line secondLine)
    {
        double x,y;
        x = (firstPointOfLine.getX()*(lastPointOfLine.getY()-firstPointOfLine.getY())*(secondLine.lastPointOfLine.getX()-secondLine.firstPointOfLine.getX())-firstPointOfLine.getY()*(secondLine.lastPointOfLine.getX()-secondLine.firstPointOfLine.getX())
                -secondLine.firstPointOfLine.getX()*(secondLine.lastPointOfLine.getY()-secondLine.firstPointOfLine.getY())*(lastPointOfLine.getX()-firstPointOfLine.getX())+secondLine.firstPointOfLine.getY()*(lastPointOfLine.getX()-firstPointOfLine.getX()))
                /((lastPointOfLine.getY()-firstPointOfLine.getY())*(secondLine.lastPointOfLine.getX()-secondLine.firstPointOfLine.getX())-(secondLine.lastPointOfLine.getY()-secondLine.firstPointOfLine.getY())*(lastPointOfLine.getX()-firstPointOfLine.getX()));
        y = determineYByXFromLine(x);
        return new Point2D.Double(x,y);
    }*/

}
