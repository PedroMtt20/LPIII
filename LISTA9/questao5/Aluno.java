import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aluno {
    protected String nome;
    protected String matricula;
    protected LocalDate dataAdmissao;
    protected int semestre;
    protected String tipoCurso;
    protected double mensalidade;

    public Aluno(String nome, String matricula, LocalDate dataAdmissao, int semestre, String tipoCurso) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataAdmissao = dataAdmissao;
        this.semestre = semestre;
        this.tipoCurso = tipoCurso;
        calcularMensalidade();
    }

    public void imprimirDados() {
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Nome: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data de Admissão: " + dataAdmissao);
        System.out.println("Semestre: " + semestre);
        System.out.println("Tipo de Curso: " + tipoCurso);
        System.out.println("Mensalidade: R$" + df.format(mensalidade));
    }

    private void calcularMensalidade() {
        double valorBase = 700.0;
        double acrescimo = 0.0;

        if (tipoCurso.equalsIgnoreCase("Engenharias")) {
            acrescimo += 0.2;
        } else if (tipoCurso.equalsIgnoreCase("Computação")) {
            acrescimo += 0.1;
        } else if (tipoCurso.equalsIgnoreCase("Letras")) {
            acrescimo += 0.05;
        }

        LocalDate dataAtual = LocalDate.now();
        long mesesDiferenca = ChronoUnit.MONTHS.between(dataAdmissao, dataAtual);

        if (mesesDiferenca > semestre) {
            acrescimo += 0.2;
        }

        mensalidade = valorBase + (valorBase * acrescimo);
    }
}
