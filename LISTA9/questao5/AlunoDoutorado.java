import java.time.LocalDate;

public class AlunoDoutorado extends AlunoPosGraduacao{
     public AlunoDoutorado(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso,
            String orientador, String projetoPesquisa) {
        super(nome, matricula, dataAdmissao, semestre, tipoCurso, orientador, projetoPesquisa, "Doutorado");
    }
}
