package Comic;

import li.Colors;
import li.Screen;

public class Comic implements ComicACB {
    private int id;
    private int nCapitulo;
    private int nPaginas;
    private Pagina[] p;
    private String descripcion;
    private String fechaEmision;

    public Comic(int id, int nCapitulo, String descripcion, String fechaEmision) {
        this.id = id;
        this.nCapitulo = nCapitulo;
        this.descripcion = descripcion;
        this.fechaEmision = fechaEmision;
    }

    public Comic(int id, int nCapitulo, int nPaginas, Pagina[] p, String descripcion, String fechaEmision) {
        this.id = id;
        this.nCapitulo = nCapitulo;
        this.nPaginas = nPaginas;
        this.p = p;
        this.descripcion = descripcion;
        this.fechaEmision = fechaEmision;
    }

    public int getId() {
        return id;
    }

    public int getnCapitulo() {
        return nCapitulo;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public Pagina[] getP() {
        return p;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setnCapitulo(int nCapitulo) {
        this.nCapitulo = nCapitulo;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }

    public void setP(Pagina[] p) {
        this.p = p;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }


    @Override
    public void mostrarPagina(Screen s, int np)  {
        for (int i=0;i<np;i++){
            s.cls();
            s.repaint();
//        s.out(showMsg(), "Helvetica", 28, Colors.BlueHorizon);
            s.showImage2(p[i].getSrc(),1000,1000);
            s.setBounds(200, 0, 1200, 1200);
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void iniciarComic(Screen s, int np) {
        s.setVisible(true);
        s.out(getDescripcion(), "Helvetica", 28, Colors.BlueHorizon);
//        System.out.println(p[0].getSrc());
        s.showImage(p[0].getSrc());
        s.setBounds(500, 0, 700, 1200);

        mostrarPagina(s,np);

    }


}
