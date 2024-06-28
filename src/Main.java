import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livros = new ArrayList<Livro>();

        livros.add(new Livro("O Retorno do Rei", 59.9, "Fantasia", "J.R.R. Tolkien", 432));
        livros.add(new Livro("O Herói das Eras", 49.9, "Fantasia", "Brandon Sanderson", 572));
        livros.add(new Livro("Introdução à Programação Java", 144.9, "Programação", "Y. Daniel Liang", 1300));
        livros.add(new Livro("Frankenstein", 29.9, "Ficção", "Mary Shelley", 261));

        for (Livro livro : livros) {
            livro.imprimirDetalhes();
            System.out.println("------------------");
        }
    }
}