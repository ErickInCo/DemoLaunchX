package Concierto;

import javazoom.jl.decoder.JavaLayerException;
import li.Colors;
import li.Screen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class PlayerC implements PlayerACB, Runnable {

    private Cancion songs[];
    private Screen pantalla;
    private int numeroS;

    public PlayerC(Cancion[] songs, Screen pantalla, int numeroS) {
        this.songs = songs;
        this.pantalla = pantalla;
        this.numeroS = numeroS;
    }

    public int getNumeroS() {
        return numeroS;
    }

    public void setNumeroS(int numeroS) {
        this.numeroS = numeroS;
    }

    public Screen getPantalla() {
        return pantalla;
    }

    public void setPantalla(Screen pantalla) {
        this.pantalla = pantalla;
    }

    public Cancion[] getSongs() {
        return songs;
    }

    public void setSongs(Cancion[] songs) {
        this.songs = songs;
    }

    @Override
    public void play() {

    }

    @Override
    public void pausa() {

    }

    @Override
    public void siguiente(Cancion c) {

    }

    @Override
    public void anterior(Cancion c) {

    }

    @Override
    public void mostrarDatos(Screen s,Cancion c) {
        s.cls();
        s.repaint();
        s.showImage2(c.getSrcImagen(),300,300);
        System.out.println(c.getSrcImagen());
        s.setBounds(600,0,400,450);
        s.out("\n"+c.toString(),"Helvetica", 16, Colors.BeniukonBronze);
    }



    @Override
    public void run() {
        try{

            for(int i=0;i<numeroS;i++){
                mostrarDatos(pantalla,songs[i]);
                FileInputStream fis = new FileInputStream(songs[i].getSrcSong());
                javazoom.jl.player.Player player = new javazoom.jl.player.Player(fis);
                player.play();
                player.close();
                fis.close();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JavaLayerException e) {
            throw new RuntimeException(e);
        }
    }
}