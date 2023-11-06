import java.util.ArrayList;

public class Biblioteca {
    public String nome;
    public ArrayList<Midia> midias;

    public static ArrayList<Biblioteca> bibliotecas = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
        this.midias = new ArrayList<>();

        bibliotecas.add(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Midia> getMidias(Midia midias) {
        return this.midias;
    }

    public static Biblioteca getBibliotecas (Biblioteca bibliotecas) {
        return bibliotecas;
    }

    public void adicionarLivro (Livro livro) {
        this.midias.add(livro);
    }

    public void listarMidias() {
        for(int i = 0; i < this.midias.size(); i++) {
            System.out.println(i + " - " + this.midias.get(i).toString());
        }
    }

    public String toString() {
        return "Nome: " + this.nome;
    }

    public static void listarBibliotecas() {
        for(int i = 0; i < bibliotecas.size(); i++) {
            System.out.println(i + " - " + bibliotecas.get(i).toString());
        }
    }
}
