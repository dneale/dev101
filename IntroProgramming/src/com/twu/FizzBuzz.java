package com.twu;

/**
 * Created by dmn on 28/05/15.
 */
public class FizzBuzz {

    private static String FIZZ_TEXT = "Fizz";
    private static String BUZZ_TEXT = "Buzz";

    public FizzBuzz()
    {

    }

    public boolean isFizz(int num)
    {
        return true;
    }

    public boolean isBuzz(int num)
    {
        return true;
    }

    public String fizzBuzzGenerate(int range)
    {
        String output = new String();
        for (int i = 1; i <= range; i++) {
            if (isFizz(i))
                output += FIZZ_TEXT;
            if (isBuzz(i))
                output += BUZZ_TEXT;
            if (!isBuzz(i) && !isFizz(i))
                output += Integer.toString(i);
            output += '\n';
        }
        return output;
    }

    public void fizzBuzz() {
        System.out.print(fizzBuzzGenerate(100));
    }
}
