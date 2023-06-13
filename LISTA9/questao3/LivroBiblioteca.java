public class LivroBiblioteca extends Livro {
    private boolean emprestado;
    private String dataDevolucao;

    public LivroBiblioteca() {
        super();
        this.emprestado = false;
        this.dataDevolucao = "";
    }

    public LivroBiblioteca(String titulo, String autor, int nroPaginas, int anoPublicacao) {
        super(titulo, autor, nroPaginas, anoPublicacao);
        this.emprestado = false;
        this.dataDevolucao = "";
    }

    public boolean isAvailable() {
        return !emprestado;
    }

    public void borrow(String dataDevolucao) {
        if (!emprestado) {
            this.emprestado = true;
            this.dataDevolucao = dataDevolucao;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Disponível: " + (isAvailable() ? "Sim" : "Não") +
                ", Data de Devolução: " + dataDevolucao;
    }
}