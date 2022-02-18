package com.company;

import java.awt.geom.Point2D;

public class Main {
    static Square bigSquare, smallSquare;
    static Line line;
    public static void main(String[] args) {
        EnteringParameters();
        bigSquare.setStartPoint(0, bigSquare.side);
        smallSquare.setStartPoint(bigSquare.side/2 - smallSquare.side/2,bigSquare.side);
        FindLine();
        Console.WriteMessage("Угол равняется: " +line.calculateLineAngle() + " градусов\n");
    }
    static public void EnteringParameters()
    {
        double a,b;
        boolean err=false;
        do {
            if(err)Console.WriteMessage("Параметры введены неверно!!! Повторите ввод.\n");
            a = Console.ReadDouble("Введите сторону a:");
            b = Console.ReadDouble("Введите сторону b:");
            err=true;
        }while(a<=0||b<=0||a<=b);
        bigSquare = new Square(a);
        smallSquare = new Square(b);
    }
    static public void FindLine()
    {
        double step = bigSquare.side - smallSquare.side,i=0,y;
        line = new Line(bigSquare.points[0],new Point2D.Double(bigSquare.side/2,i));
        do
        {
            line.lastPointOfLine.y = i;
            y = line.determineYByXFromLine(bigSquare.side/2-smallSquare.side/2);
            i-=step;
        }while(y > bigSquare.side - smallSquare.side);
        i+=step;
        System.out.println(1-2*i/step);
    }
}
