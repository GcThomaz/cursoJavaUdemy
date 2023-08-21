package Section_7.ooComposicao;

import java.util.ArrayList;

public class Aluno {

    final String nome;
    ArrayList<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public String toString() {
        return nome;
    }

    Curso obterCursoPorNome(String nome) {

        for (Curso curso:
             this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)) {
                return curso;
            }
        }
        return null;
    }
}
