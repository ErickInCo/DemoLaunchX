package Concierto;

import li.Screen;

public interface ConcertACB {
    void inicializar(Screen s, Screen s2);
    void mostrarimg(Screen s, String src);
    void activarMusica(Screen s, String src);
    void iniciarConcert(Screen s, Concert c);
}
