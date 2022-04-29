package Comic;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Musica implements Runnable{
    @Override
    public void run() {
        try{
            FileInputStream fis = new FileInputStream("src/Comic/OPSong.mp3");
            Player player = new Player(fis);
            player.play();
            player.close();
            fis.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (JavaLayerException e) {
            throw new RuntimeException(e);
        }

    }
}
