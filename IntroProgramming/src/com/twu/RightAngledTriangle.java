package com.twu;

/**
 * Created by dmn on 27/05/15.
 */
public class RightAngledTriangle extends Shape {

    public RightAngledTriangle(int size) {
        super(size);
    }

    public String draw() {
        String output = new String();
        for (int i = 1; i <= this.size; i++) {
            for (int j = 0; j < i; j++) {
                output += '*';
            }
            output += '\n';
        }
        return output;
    }

}
