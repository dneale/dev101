package com.twu;

/**
 * Created by dmn on 27/05/15.
 */
public class Line extends Shape {

    private boolean vertical;

    public Line(int size, boolean vertical) {
        super(size);
        this.vertical = vertical;
    }

    public String draw() {
        String output = new String();
        for (int i = 0; i < this.size; i++){
            if (this.vertical)
                output += "*\n";
            else
                output += '*';
        }
        if (!this.vertical)
            output += '\n';

        return output;
    }
}
