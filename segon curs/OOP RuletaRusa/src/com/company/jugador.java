package com.company;

public class jugador {

    private int id;
    private String nombre;
    private boolean vivo;

    public jugador(int id, String nombre, boolean vivo) {
        this.id = id;
        this.nombre = nombre;
        this.vivo = vivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
