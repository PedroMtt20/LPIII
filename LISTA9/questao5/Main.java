import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Aluno alunoGraduacao = new Aluno("João", "20210001", LocalDate.of(2021, 1, 1), 4, "Engenharias");
        alunoGraduacao.imprimirDados();

        System.out.println();

        AlunoPosGraduacao alunoPosgraduacao = new AlunoPosGraduacao("Maria", "20200001",
                LocalDate.of(2020, 1, 1), 8, "Letras", "Dr. Silva", "Estudo sobre poesia moderna", "Mestrado");
        alunoPosgraduacao.imprimirDados();

        AlunoMestrado alunoMestrado = new AlunoMestrado("Maria", "20200001", LocalDate.of(2020, 8, 1), 3,
                "Computação", "Dr. Silva", "Estudo sobre Inteligência Artificial");
        alunoMestrado.imprimirDados();

        System.out.println("-------------------------");

        // Exemplo de aluno de doutorado
        AlunoDoutorado alunoDoutorado = new AlunoDoutorado("Pedro", "20190001", LocalDate.of(2019, 8, 1), 4,
                "Letras", "Dr. Souza", "Estudo sobre Literatura Contemporânea");
        alunoDoutorado.imprimirDados();
    }
}
