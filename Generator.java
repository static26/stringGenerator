package com.example.generator;

import java.util.Random;

public class Generator {


    public static String alfabeLower = "abcdefghytzxvnmlsipou";
    public static String alfabeUpper = alfabeLower.toUpperCase().replace("İ", "I");
    public static String numbers = "0123456789";
    public static String specielsChars = ".!?*%";

    public static String allStr = alfabeLower + alfabeUpper + numbers + specielsChars;

    public static String generateRandomString(int size){
        String text = "";
        char[] chars = allStr.toCharArray();
        for(int j = 0; j < size; j++){
            char c = chars[new Random().nextInt(chars.length)];
            text += c;
        }
        return text;
    }
    
     public static String generateRandomString(int size, String alphabet){
        String text = "";
        char[] chars = alphabet.toCharArray();
        for(int j = 0; j < size; j++){
            char c = chars[new Random().nextInt(chars.length)];
            text += c;
        }
        return text;
    }
}
