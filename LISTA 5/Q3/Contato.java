import java.util.Calendar;

public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private String dataNascimento;

    public Contato(String _nome, String _email, String _telefone, String _dataNascimento){
        nome = _nome;
        email = _email;
        telefone = _telefone;
        dataNascimento = _dataNascimento;
    }

    public void inicializarContato(String _nome, String _email, String _telefone, String _dataNascimento) {
        nome = _nome;
        email = _email;
        telefone = _telefone;
        dataNascimento = _dataNascimento;
    }

    public void setDataNascimento(String _dataNascimento) {
        dataNascimento = _dataNascimento;
    }

    public void setEmail(String _email) {
        email = _email;
    }

    public void setNome(String _nome) {
        nome = _nome;
    }

    public void setTelefone(String _telefone) {
        telefone = _telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
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

        if(diaAtual >= diaNascimento && mesAtual >= mesNascimento){
            idade = anoAtual - anoNascimento;
        } else {
            idade = (anoAtual - anoNascimento) - 1;
        }
        return idade;
    }
}
