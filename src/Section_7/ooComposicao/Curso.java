package Section_7.ooComposicao;

import java.util.ArrayList;

public class Curso {
    final String nome;
    ArrayList<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {
        this.nome = nome;
    }

    void adicionarALuno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }
}
