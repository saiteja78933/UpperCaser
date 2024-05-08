package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(tc001singleInput());
        System.out.println(tc002emptyInput());
        System.out.println(tc003oneWord());
        System.out.println(tc004Sentence());
        System.out.println(tc005specialInput());
        System.out.println(tc006integerInput());
        System.out.println(tc007mixedCaseInput());
        System.out.println(tc008MixedIntegerandCharacter());
    }

    public static String upperCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 97 && input.charAt(i) <= 112) {
                result += (char) (input.charAt(i) - 32);
            } else {
                result += input.charAt(i);
            }
        }

        return result;
    }

    public static boolean tc001singleInput() {
        String input = "a";
        String expected = "A";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc002emptyInput() {
        String input = "";
        String expected = "";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc003oneWord() {
        String input = "hello";
        String expected = "HELLO";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc004Sentence() {
        String input = "hello world";
        String expected = "HELLO WORLD";
        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc005specialInput() {
        String input = "abc!@#$%^&*()";
        String expected = "ABC!@#$%^&*()";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc006integerInput() {
        String input = "1234567890";
        String expected = "1234567890";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc007mixedCaseInput() {
        String input = "HeLLo WoRld";
        String expected = "HELLO WORLD";

        String output = upperCase(input);
        return (output.equals(expected));
    }
    public static boolean tc008MixedIntegerandCharacter() {
        String input = "Hello1Word";
        String expected = "HELlO1WORD";

        String output = upperCase(input);
        return (output.equals(expected));
    }
}
