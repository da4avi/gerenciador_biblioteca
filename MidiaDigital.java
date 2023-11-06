public class MidiaDigital extends Midia {
    public String album;
    
    public MidiaDigital (String titulo, boolean disponivel, String album) {
        super(titulo, disponivel);
        this.album = album;
    }

    public String getAlbum() {
        return this.album;
    }

    public void setAlbum(String album) {
        this.album = album;
    } 

    public String toString() {
        return "Título: " + this.titulo 
            + ". Disponível: " + (this.disponivel ? "Sim" : "Não")
            + ". Álbum: " + this.album;
    }

}
