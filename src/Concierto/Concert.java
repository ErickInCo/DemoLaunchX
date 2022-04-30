package Concierto;

import li.Screen;

import java.util.Arrays;

public class Concert implements ConcertACB{
    private int id;
    private Cancion songs[];
    private int numeroSongs;
    private String nombreConcert;
    private String artistaPrincipal;

    public Concert(int id, Cancion[] songs, int numeroSongs, String nombreConcert, String artistaPrincipal) {
        this.id = id;
        this.songs = songs;
        this.numeroSongs = numeroSongs;
        this.nombreConcert = nombreConcert;
        this.artistaPrincipal = artistaPrincipal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cancion[] getSongs() {
        return songs;
    }

    public void setSongs(Cancion[] songs) {
        this.songs = songs;
    }

    public int getNumeroSongs() {
        return numeroSongs;
    }

    public void setNumeroSongs(int numeroSongs) {
        this.numeroSongs = numeroSongs;
    }

    public String getNombreConcert() {
        return nombreConcert;
    }

    public void setNombreConcert(String nombreConcert) {
        this.nombreConcert = nombreConcert;
    }

    public String getArtistaPrincipal() {
        return artistaPrincipal;
    }

    public void setArtistaPrincipal(String artistaPrincipal) {
        this.artistaPrincipal = artistaPrincipal;
    }

    @Override
    public String toString() {
        return "Concierto " + nombreConcert + "\n"+
                "Artista Principal: '" + artistaPrincipal + '\n' +
                "Numero de Canciones: " + numeroSongs + "\n"+
                "###########################################\n" + Arrays.toString(songs) +
                "###########################################\n";
    }

    @Override
    public void inicializar(Screen s, Screen s2) {
        s.setVisible(true);
        s2.setVisible(true);
//        s.out(this.toString(), "Helvetica", 25, Colors.BeniukonBronze);
        s.showImage2("src/Concierto/recursos/musica.jpg",550,750);
        s.setBounds(0, 0, 600, 800);
        s2.setBounds(600,0,300,300);
    }

    @Override
    public void mostrarimg(Screen s, String src) {

    }

    @Override
    public void activarMusica(Screen s, String src) {

    }

    @Override
    public void iniciarConcert(Screen s, Concert c) {

    }
}
