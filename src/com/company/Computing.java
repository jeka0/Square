package com.company;

import java.awt.geom.Point2D;

public class Computing {
    static public boolean pointBelongLine(Point2D.Double firstPointOfLine, Point2D.Double lastPointOfLine, Point2D.Double point)
    {
        return point.getY()==determineYByXFromLine(firstPointOfLine,lastPointOfLine,point.getX());
    }
    static public double determineYByXFromLine(Point2D.Double firstPointOfLine, Point2D.Double lastPointOfLine, double x)
    {
        return ((x-firstPointOfLine.getX())*(lastPointOfLine.getY()-firstPointOfLine.getY()))/(lastPointOfLine.getX()-firstPointOfLine.getX())+firstPointOfLine.getY();
    }

}
