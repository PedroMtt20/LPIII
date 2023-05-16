// package LPIII.LISTA7.questao1;

import java.util.Calendar;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;
    private static int totalContatos = 0;

    public Contato(String _nome, String _email, String _telefone, String _dataNascimento) {
        nome = _nome;
        email = _email;
        telefone = _telefone;
        dataNascimento = _dataNascimento;
        incrementaContatos();
    }

    public Contato(String nome) {
        this.nome = nome;
        incrementaContatos();
    }

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.telefone = "XXXX-XXXX";
        this.dataNascimento = "XX/XX/XXXX";
        incrementaContatos();
    }

    private void incrementaContatos() {
        totalContatos++;
    }

    public void setNome(String _nome) {
        if (_nome == null || _nome.trim().equals("")) {
            throw new IllegalArgumentException("Nome inválido!");
        }
        nome = _nome;
    }

    public void setEmail(String _email) {
        if (_email == null || !_email.contains("@")) {
            throw new IllegalArgumentException("Email inválido!");
        }
        email = _email;
    }

    public void setTelefone(String _telefone) {
        if (_telefone == null || _telefone.trim().equals("")) {
            throw new IllegalArgumentException("Telefone inválido!");
        }
        telefone = _telefone;
    }

    public void setDataNascimento(String _dataNascimento) {
        String[] data = _dataNascimento.split("/");
        int dia = Integer.parseInt(data[0]);
        int mes = Integer.parseInt(data[1]);
        int ano = Integer.parseInt(data[2]);

        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1900
                || ano > Calendar.getInstance().get(Calendar.YEAR)) {
            throw new IllegalArgumentException("Data de nascimento inválida!");
        }

        dataNascimento = _dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void imprimirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + telefone);
        System.out.println("Data de nascimento: " + dataNascimento);
    }

    public int calcularIdade() {
        final String dataInfo[] = dataNascimento.split("/");
        Calendar calendar = Calendar.getInstance();

        int idade = 0;
        int diaNascimento = Integer.parseInt(dataInfo[0]);
        int mesNascimento = Integer.parseInt(dataInfo[1]);
        int anoNascimento = Integer.parseInt(dataInfo[2]);

        final int anoAtual = calendar.get(Calendar.YEAR);
        final int mesAtual = calendar.get(Calendar.MONTH) + 1;
        final int diaAtual = calendar.get(Calendar.DAY_OF_MONTH);

        if (diaAtual >= diaNascimento && mesAtual >= mesNascimento) {
            idade = anoAtual - anoNascimento;
        } else {
            idade = (anoAtual - anoNascimento) - 1;
        }
        return idade;
    }

    public void totalDeContatos() {
        System.out.println("Total de contatos: " + totalContatos);
    }
}
