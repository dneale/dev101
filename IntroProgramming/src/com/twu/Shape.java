package com.twu;

/**
 * Created by dmn on 27/05/15.
 */
public abstract class Shape {
    protected int size;

    public Shape(int size) {
        this.size = size;
    }

    static protected String repeatChar(char c, int repeat) {
        String s = new String();
        for (int i = 0; i < repeat; i++) {
            s += c;
        }
        return s;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract String draw();

    public void print() {
        System.out.println(this.draw());
    }


}
