package com.twu;

/**
 * Created by dmn on 27/05/15.
 */
public class IsoscelesTriangle extends Shape {
    public IsoscelesTriangle(int size) {
        super(size);
    }

    public String draw() {
        String output = new String();
        for (int i = 0; i < this.size; i++) {
            output += Shape.repeatChar(' ', this.size - (i + 1));
            output += Shape.repeatChar('*', (2 * (i + 1)) - 1);
            output += '\n';
        }
        return output;
    }
}
