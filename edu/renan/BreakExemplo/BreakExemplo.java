package edu.renan.BreakExemplo;

public class BreakExemplo {
    public static void main(String[] args) {
        for(int num = 1; num <=5; num++){
            if(num ==3){
                System.out.println("number Found");
                break;
            }
            if(num == 3){
                continue;
            }
        }
    }
}
