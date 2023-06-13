import java.time.LocalDate;

public class AlunoMestrado extends AlunoPosGraduacao {
  public AlunoMestrado(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso,
            String orientador, String projetoPesquisa) {
        super(nome, matricula, dataAdmissao, semestre, tipoCurso, orientador, projetoPesquisa, "Mestrado");
    }
}
