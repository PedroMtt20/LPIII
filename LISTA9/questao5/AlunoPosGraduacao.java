import java.time.LocalDate;

public class AlunoPosGraduacao extends Aluno {
    private String orientador;
    private String projetoPesquisa;
    private String nivel;

    public AlunoPosGraduacao(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso,
            String orientador, String projetoPesquisa, String nivel) {
        super(nome, matricula, dataAdmissao, semestre, tipoCurso);
        this.orientador = orientador;
        this.projetoPesquisa = projetoPesquisa;
        this.nivel = nivel;
    }

    @Override
    public void imprimirDados() {
        super.imprimirDados();
        System.out.println("Orientador: " + orientador);
        System.out.println("Projeto de Pesquisa: " + projetoPesquisa);
        System.out.println("Nível: " + nivel);
    }
}