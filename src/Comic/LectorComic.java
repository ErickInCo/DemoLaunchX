package Comic;

import li.Screen;

public class LectorComic {
    public static void main(String[] args) {
        TestComic(14);
    }

    public static void TestComic(int np) {
        Screen s = new Screen();
        Pagina p[]=new Pagina[np];
        for (int i=1; i<=np;i++){
            String st="src/Comic/";
            st=st+i+".jfif";
            p[i-1]=new Pagina(i-1,st);
        }
        Comic op1044 = new Comic(1044,1044,np,p,"\t\tGuerrero de la Liberacion\n","28 Mar. 2022");
        Runnable mostrar = new Runnable() {
            @Override
            public void run() {
                op1044.iniciarComic(s,np);
            }
        };
        Thread mostrarComic = new Thread(mostrar);
        Thread musica =new Thread(new Musica());
        mostrarComic.start();
        musica.start();
    }


}
