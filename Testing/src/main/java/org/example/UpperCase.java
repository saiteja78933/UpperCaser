package org.example;

public class UpperCase {

    public String upperCase(String input){
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
}
