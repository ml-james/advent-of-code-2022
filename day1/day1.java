import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

class day1
{
    public static void main(String[] args)
    {
        {
            BufferedReader reader;

            try
            {
		reader = new BufferedReader(new FileReader(args[0]));
		
                final TreeSet<Integer> elfCalories = new TreeSet<>();
                int calories = 0;

		String line = reader.readLine();
                while (line != null)
                {
                    if (line.trim().equals(""))
                    {
                        elfCalories.add(calories);
                        calories = 0;
                    }
                    else
                    {
                        calories += Integer.parseInt(line);
                    }
                    line = reader.readLine();
                }

                final Integer elfWithMostCalories = elfCalories.pollLast();
                final Integer elfWithSecondMostCalories = elfCalories.pollLast();
                final Integer elfWithThirdMostCalories = elfCalories.pollLast();

                assert elfWithMostCalories != null;
                assert elfWithSecondMostCalories != null;
                assert elfWithThirdMostCalories != null;

		System.out.println(elfWithMostCalories);
                System.out.println(elfWithMostCalories + elfWithSecondMostCalories + elfWithThirdMostCalories);
            }
            catch (final IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
