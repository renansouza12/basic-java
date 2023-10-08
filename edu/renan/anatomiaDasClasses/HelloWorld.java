package edu.renan.anatomiaDasClasses;

import java.util.Locale;
import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       System.out.println("First name:");
       String name = scanner.next();

        System.out.println("Second name:");
          String lastName = scanner.next();

        System.out.println(name + lastName);
    }
}