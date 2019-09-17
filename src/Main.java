import java.util.Random;

public class Main{
    public static void main(String[] args)
    {
        output("Generate 10 random integers between 0 and 6");
        Random r = new Random();

        for (int i = 1; i <= 10; ++i)
        {
            int randomInt = 1 + r.nextInt(6);
            output("Generated number: " + randomInt);
        }

        output("Done.");
    }

    private static void output(String aMessage)
    {
        System.out.println(aMessage);
    }
}