package com.company;

import java.awt.*;
import java.awt.geom.Point2D;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Square bigSquare = new Square(Console.ReadDouble("Введите сторону a:"));
        Square smallSquare = new Square(Console.ReadDouble("Введите сторону b:"));
        bigSquare.setStartPoint(0, bigSquare.side);
        smallSquare.setStartPoint(bigSquare.side/2 - smallSquare.side/2,bigSquare.side);
        double step = bigSquare.side - smallSquare.side,i=0,y;
        do
        {
          y = Computing.determineYByXFromLine(bigSquare.points[0],new Point2D.Double(bigSquare.side/2,i),bigSquare.side/2-smallSquare.side/2);
          i-=step;
        }while(y> bigSquare.side- smallSquare.side);
        i+=step;
        System.out.println(i);
    }
}
