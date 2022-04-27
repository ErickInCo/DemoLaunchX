package Comic;

public class Pagina {
    private int id;
    private String src;

    public Pagina(int id, String src) {
        this.id = id;
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public String getSrc() {
        return src;
    }

    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        } else return false;
    }

    public boolean setSrc(String src) {
        if (!src.isEmpty()) {
            this.src = src;
            return true;
        } else return false;
    }
}
