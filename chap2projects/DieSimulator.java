import java.util.Random;

public class DieSimulator
{
    public static void main(String[] args)
    {
        Random die = new Random();
        int dieReturn = die.nextInt(6);
        dieReturn = dieReturn + 1;
        System.out.println(dieReturn);
    }
}