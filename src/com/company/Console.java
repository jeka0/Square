package com.company;

import java.util.Scanner;

public class Console {
    static private Scanner scanner = new Scanner(System.in);
    static public double ReadDouble(String str)
    {
        WriteMessage(str);
        return scanner.nextDouble();
    }
    static public void WriteMessage(String str)
    {
        System.out.print(str);
    }
}
