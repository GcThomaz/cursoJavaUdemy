package Section_7.ooComposicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("Pedro");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Web 2023");
        Curso c3 = new Curso("React Native");

        c1.adicionarALuno(a1);
        c1.adicionarALuno(a2);

        c2.adicionarALuno(a1);
        c2.adicionarALuno(a3);

        a1.adicionarCurso(c3);
        a2.adicionarCurso(c3);
        a3.adicionarCurso(c3);

        for (Aluno aluno :
                c1.alunos) {
            System.out.println("Estou matriculado no curso " + c1.nome + " e o meu nome é: " + aluno.nome);
        }

        System.out.println(a1.cursos.get(0).alunos);

        Curso cursoEncontrado = a1.obterCursoPorNome("Java Completo");

        if (cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
