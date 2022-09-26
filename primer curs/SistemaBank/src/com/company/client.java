package com.company;

public class client {

    private  int IdClient;
    private  String NomClient;
    private  int CantidadDobes;

    public client(int IdClient, String NomClient, int CantidadDobes){

        this.IdClient = IdClient;
        this.NomClient = NomClient;
        this.CantidadDobes = CantidadDobes;

    }

    public void setIdClient(int IdClient){ this.IdClient = IdClient;}

    public int getIdClient(){ return IdClient;}

    public void setNomClient(String NomClient){ this.NomClient = NomClient;}

    public String getNomClient(){ return NomClient;}

    public void setCantidadDobes(int CantidadDobes){ this.CantidadDobes = CantidadDobes;}

    public int getCantidadDobes(){ return CantidadDobes;}
}
