package Concierto;

import li.Screen;

public interface PlayerACB {
    void play();
    void pausa();
    void siguiente(Cancion c);
    void anterior(Cancion c);
    void mostrarDatos(Screen s, Cancion c);



}
