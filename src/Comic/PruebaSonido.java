package Comic;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PruebaSonido {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        FileInputStream fileInputStream = new FileInputStream("src/Comic.Comic/OPSong.mp3");
        Player player = new Player(fileInputStream);
        System.out.println("Song is playing...");
        player.play();
    }
}
