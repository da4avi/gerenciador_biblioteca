import java.util.ArrayList;

public class Livro extends Midia{
    public Autor autor;
    public static ArrayList<Livro> livros = new ArrayList<>();

    public Livro(String titulo, Autor autor, boolean disponivel) {
        super(titulo,disponivel);
        this.autor = autor;

        livros.add(this);
    }

    public Autor getAutor(Autor autor) {
        return this.autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String toString() {
        return "Título: " + this.titulo 
            + ". Autor: " + this.autor.getNome() 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não");
    }

    public static void listarLivros() {
        for(int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i).toString());
        }
    }
}
