package Controller;

import Model.Aluno;
import Model.Disciplina;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class AlunoController {
    public static void main(String[] args) {



       Aluno a1 = new Aluno(
               1L, "Carlos", "Silva"
       );
       Aluno a2 = new Aluno(
               2L, "Jair", "Nunes"
       );

        Disciplina d1 = new Disciplina(
                1L, "matematica"
        );
        Disciplina d2 = new Disciplina(
                2L, "portugues"
        );
        Disciplina d3 = new Disciplina(
                3L, "ingles"
        );

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.println("\nDisciplinas aluno 1: ");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1.getDisciplinas());
        System.out.println("\nDisciplinas aluno 2: ");
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2.getDisciplinas());

        a2.getDisciplinas().clear();
        System.out.println("\nDisciplinas aluno 1: ");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1.getDisciplinas());
        System.out.println("\nDisciplinas aluno 2: ");
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2.getDisciplinas());




    }
}
