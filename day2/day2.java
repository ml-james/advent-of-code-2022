package com.lmax.exchange.testing.custodian.cryptocurrency;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class day2
{
    private static final Integer[][] part1ResultMatrix = new Integer[3][3];

    static
    {
        part1ResultMatrix[0][0] = 4;
        part1ResultMatrix[0][1] = 8;
        part1ResultMatrix[0][2] = 3;
        part1ResultMatrix[1][0] = 1;
        part1ResultMatrix[1][1] = 5;
        part1ResultMatrix[1][2] = 9;
        part1ResultMatrix[2][0] = 7;
        part1ResultMatrix[2][1] = 2;
        part1ResultMatrix[2][2] = 6;
    }

    private static final Integer[][] part2ResultMatrix = new Integer[3][3];

    static
    {
        part2ResultMatrix[0][0] = 3;
        part2ResultMatrix[0][1] = 4;
        part2ResultMatrix[0][2] = 8;
        part2ResultMatrix[1][0] = 1;
        part2ResultMatrix[1][1] = 5;
        part2ResultMatrix[1][2] = 9;
        part2ResultMatrix[2][0] = 2;
        part2ResultMatrix[2][1] = 6;
        part2ResultMatrix[2][2] = 7;
    }

    public static void main(String[] args)
    {
        BufferedReader reader;

        try
        {
            reader = new BufferedReader(new FileReader(args[0]));
            String line = reader.readLine();

            long totalScorePart1 = 0;
            long totalScorePart2 = 0;

            while (line != null)
            {
                char[] charArray = new char[3];
                line.getChars(0, 3, charArray, 0);

                final Integer roundResultPart1 = part1ResultMatrix[charArray[0] % 65][(charArray[2] % 65) - 23];
                totalScorePart1 += roundResultPart1;

                final Integer roundResultPart2 = part2ResultMatrix[charArray[0] % 65][(charArray[2] % 65) - 23];
                totalScorePart2 += roundResultPart2;

                line = reader.readLine();
            }

            System.out.println(totalScorePart1);
            System.out.println(totalScorePart2);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
