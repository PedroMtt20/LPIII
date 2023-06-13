public class Livro {
    protected String titulo;
    protected String autor;
    protected int nroPaginas;
    protected int anoPublicacao;

    public Livro() {
        this.titulo = "";
        this.autor = "";
        this.nroPaginas = 0;
        this.anoPublicacao = 0;
    }

    public Livro(String titulo, String autor, int nroPaginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPaginas = nroPaginas;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPaginas() {
        return nroPaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + nroPaginas +
                ", Ano de Publicação: " + anoPublicacao;
    }

    public boolean isOlder(int ano) {
        return anoPublicacao < ano;
    }
}