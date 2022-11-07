package com.company;

public class Llibre {

    private int ISBN;
    private String Autor;
    private String Titulo;
    private int NumeroPag;

    public Llibre(int ISBN, String Autor, String Titulo, int NumeroPag){

        this.ISBN = ISBN;
        this.Autor = Autor;
        this.Titulo = Titulo;
        this.NumeroPag = NumeroPag;

    }

    public int getISBN() {
        return ISBN;
    }

    public int getNumeroPag() {
        return NumeroPag;
    }

    public String getAutor() {
        return Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumeroPag(int numeroPag) {
        NumeroPag = numeroPag;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
}
