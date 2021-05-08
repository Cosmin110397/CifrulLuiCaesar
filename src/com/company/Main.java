package com.company;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Enter your Text: ");

            String text = scan.nextLine();
            int dim = text.length();
            System.out.print("Enter the value: ");
            int key = scan.nextInt();

            String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String lowercase = "abcdefghijklmnopqrstuvwxyz";
            String special = "!#$%&'()*+,-./:;<=>?@[]^_`{|}~";
            String numbers = "0123456789";
            System.out.print("The output Text is: ");
            for (int i = 0; i < dim; i++) {
                for (int j = 0; j < 26; j++) {
                    if( j < special.length() && text.charAt(i) == special.charAt(j))
                        System.out.print(special.charAt(j));
                    else if (j< numbers.length() && text.charAt(i) == numbers.charAt(j))
                        System.out.print(numbers.charAt(i));
                    else if (text.charAt(i) == lowercase.charAt(j))
                        System.out.print(lowercase.charAt((j + key) % 26));
                    else if (text.charAt(i) == uppercase.charAt(j))
                        System.out.print(uppercase.charAt((j + key) % 26));
                }
            }
            System.out.println();
        }
}
