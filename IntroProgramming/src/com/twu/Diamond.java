package com.twu;

/**
 * Created by dmn on 28/05/15.
 */
public class Diamond extends Shape {

    private String name;

    public Diamond(int size)
    {
        super(size);
        this.name = new String();
    }

    public Diamond(int size, String name)
    {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String draw()
    {
        /* Top Half */
        String output = new String();
        for (int i = 0; i < this.size - 1; i++) {
            output += Shape.repeatChar(' ', this.size - (i + 1));
            output += Shape.repeatChar('*', (2 * (i + 1)) - 1);
            output += '\n';
        }

        /* Draw middle of Diamond */
        if (this.name.isEmpty()){
            output += Shape.repeatChar('*', (2 * (this.size)) - 1) + '\n';
        }
        else
        {
            output += this.name + '\n';
        }

        /* Bottom Half */
        for (int i = this.size - 2; i >= 0; i--) {
            output += Shape.repeatChar(' ', this.size - (i + 1));
            output += Shape.repeatChar('*', (2 * (i + 1)) - 1);
            output += '\n';
        }
        return output;
    }

}
