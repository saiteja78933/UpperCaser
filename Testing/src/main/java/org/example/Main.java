package org.example;

public class Main {
    public static void main(String[] args) {
        tc001singleInput();
    }
    public static String upperCase(String input){
        String result="";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>=97&&input.charAt(i)<=112){
                result+=(char)(input.charAt(i)-32);
            }
            else{
                result+=input.charAt(i);
            }
        }

        return result;
    }

    public static void tc001singleInput(){
        String input="a";
        String expected="A";

        String output=upperCase(input);
        if(output.equals(expected))
            System.out.println("tc 1 success");
        }
}