public class Livro extends Produto {
    private String genero;
    private String nomeAutor;
    private int numeroPaginas;

    public Livro(String nome, double preco, String genero, String nomeAutor, int numeroPaginas) {
        super(nome, preco);
        this.genero = genero;
        this.nomeAutor = nomeAutor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void imprimirDetalhes() {
        System.out.println("Nome: " + this.getNome() + "\nPreco: " + this.getPreco() + "\nGenero: " + this.getGenero() +
                           "\nAutor: " + this.getNomeAutor() + "\nNumero de Paginas: " + this.getNumeroPaginas());
    }
}
