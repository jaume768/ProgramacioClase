package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String[] NomLlibres = {"Geronimo Stilton","Los vengadores", "Avatar"};

        List<Llibre> LlistaLlibres = new ArrayList<>();

        GenerarLlibres(NomLlibres,LlistaLlibres);

        System.out.println(LlistaLlibres.get(0).getTitulo() + " " + LlistaLlibres.get(0).getISBN());

    }

    public static List GenerarLlibres(String[] NomLlibres, List<Llibre> LlistaLlibres){

        for (int i = 0; i < NomLlibres.length; i++) {

            System.out.println("ISBN: ");
            int ISBN = sc.nextInt();
            System.out.println("Num pag: ");
            int NumPag = sc.nextInt();

            Llibre llibre = new Llibre(ISBN,"Autor",NomLlibres[i],NumPag);
            LlistaLlibres.add(llibre);

        }

        return LlistaLlibres;

    }

}
