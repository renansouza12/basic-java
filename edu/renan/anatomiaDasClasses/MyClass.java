package edu.renan.anatomiaDasClasses;
public class MyClass{
    public static void main(String[] args){
        String firstName = "Bob";
        String lastName = "Walter";

        String fullName = entireName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String entireName(String firstName, String lastName ){
        return firstName.concat(" ").concat(lastName);    
    }
}