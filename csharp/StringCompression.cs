using System;
using System.Text;

public class StringCompression
{
    public static string Compress(string input)
    {
        if (string.IsNullOrEmpty(input))
        {
            return string.Empty;
        }

        var compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= input.Length; i++)
        {
            if (i < input.Length && input[i] == input[i - 1])
            {
                count++;
            }
            else
            {
                compressed.Append(input[i - 1]).Append(count);
                count = 1;
            }
        }

        return compressed.Length < input.Length ? compressed.ToString() : input;
    }

    public static void Main(string[] args)
    {
        string sample = args.Length > 0 ? args[0] : "aabcccccaaa";
        Console.WriteLine(Compress(sample));
    }
}
