package com.company;

public class Libros {

    private int NumPaginas;
    private String Nombre;
    private String Autor;

    public Libros(int NumPaginas,String Nombre,String Autor){

        this.NumPaginas = NumPaginas;
        this.Autor = Autor;
        this.Nombre = Nombre;

    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}
