package Concierto;

public class Cancion {
    private int id;
    private String Titulo;
    private String Album;
    private String Artista;
    private float duracionS;
    private String srcSong;
    private String srcImagen;

    public Cancion(int id, String titulo, String album, String artista, float duracionS, String srcSong, String srcImagen) {
        this.id = id;
        Titulo = titulo;
        Album = album;
        Artista = artista;
        this.duracionS = duracionS;
        this.srcSong = srcSong;
        this.srcImagen = srcImagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAlbum() {
        return Album;
    }

    public void setAlbum(String album) {
        Album = album;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public float getDuracionS() {
        return duracionS;
    }

    public void setDuracionS(float duracionS) {
        this.duracionS = duracionS;
    }

    public String getSrcSong() {
        return srcSong;
    }

    public void setSrcSong(String srcSong) {
        this.srcSong = srcSong;
    }

    public String getSrcImagen() {
        return srcImagen;
    }

    public void setSrcImagen(String srcImagen) {
        this.srcImagen = srcImagen;
    }

    @Override
    public String toString() {
        return "-" +
                "Titulo:'" + Titulo + '\'' +
                ", Album:'" + Album + '\'' +
                ", Artista:'" + Artista + '\'' +
                "}\n";
    }
}
