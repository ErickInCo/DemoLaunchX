package Lol;



public class Champion {
    private int id;
    private String name;
    private String role;
    private String dificultad;
    private String descripccion;

    public Champion(int id, String name, String role, String dificultad, String descripccion) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.dificultad = dificultad;
        this.descripccion = descripccion;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getDificultad() {
        return dificultad;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public boolean setId(int id) {
        if (id > 0) {
            this.id = id;
            return true;
        } else return false;
    }

    public boolean setName( String name) {
        if (!name.isEmpty()) {
            this.name = name;
            return true;
        } else return false;
    }

    public boolean setRole( String role) {
        if (!role.isEmpty()) {
            this.role = role;
            return true;
        } else return false;
    }

    public boolean setDificultad( String dificultad) {
        if (!dificultad.isEmpty()) {
            this.dificultad = dificultad;
            return true;
        } else return false;
    }

    public boolean setDescripccion( String descripccion) {
        if (!descripccion.isEmpty()) {
            this.descripccion = descripccion;
            return true;
        } else return false;
    }


    public String showMsg() {
        return "Lol.Champion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", dificultad='" + dificultad + '\'' +
                ", descripccion='" + descripccion + '\'' +
                '}';
    }
}
