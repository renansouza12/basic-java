package edu.renan.ForArrays;

public class ExemploForArray {
    public static void main(String[] args) {
        String students[] = {"Aluno1","Aluno2","Aluno3"};

        // for(int x =0; x< students.length ; x++){
        //     System.out.println(students[x]);
        // }

        for (String student : students) {
            System.out.println(student);
        }
    }
}
