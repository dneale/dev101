package com.twu;

/**
 * Created by dmn on 28/05/15.
 */
public class FizzBuzz {

    private static String FIZZ_TEXT = "Fizz";
    private static String BUZZ_TEXT = "Buzz";

    public FizzBuzz() {}

    public boolean isFizz(int num)
    {
        /* Is divisible by 3? */
        return num % 3 == 0;
    }

    public boolean isBuzz(int num)
    {
        /* Is divisible by 5? */
        return num % 5 == 0;
    }

    public String fizzBuzzGenerate(int range)
    {
        String output = "";
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
