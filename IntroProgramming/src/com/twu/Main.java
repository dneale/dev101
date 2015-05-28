package com.twu;


public class Main {

    public static void main(String[] args) {

        // Print One Asterisk
        Line line = new Line(1, false);
        line.print();

        // Draw horizontal line
        line = new Line(8, false);
        line.print();

        // Draw vertical line
        line = new Line(3, true);
        line.print();

        RightAngledTriangle shape = new RightAngledTriangle(3);
        shape.print();

    }
}