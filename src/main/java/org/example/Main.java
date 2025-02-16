package org.example;


import java.util.LinkedList;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));


    }

    public static boolean checkForPalindrome(String word) {
        String editedWord = word.toLowerCase(Locale.ENGLISH).replaceAll("[^a-zA-Z0-0]", "");
        String reversed = new StringBuilder(editedWord).reverse().toString();
        System.out.println(editedWord);
        System.out.println(reversed);

        if (editedWord.equals(reversed)){
            return Boolean.TRUE;
        }
        else {
            return Boolean.FALSE;
        }
    }

    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList =  new LinkedList<>();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2 ;
        }
        StringBuilder binaryString  = new StringBuilder();
        for (int digit: binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();
    }
}