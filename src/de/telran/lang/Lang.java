package de.telran.lang;

public class Lang {

    public static class GFG {

        public static void main(String[] args)
        {

            // assign character
            char c1 = 'D', c2 = '/';

            // Function to check if the character is letter or digit
            boolean bool1 = Character.isLetterOrDigit(c1);
            System.out.println(c1 + " is a letter/digit ? " + bool1);

            // Function to check if the character is letter or digit
            boolean bool2 = Character.isLetterOrDigit(c2);
            System.out.println(c2 + " is a letter/digit ? " + bool2);
        }
    }
}
