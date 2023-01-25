package com.company;

public class juego {

    public boolean Disparar(revolver revolver){

        return revolver.getActual() == revolver.getBala();

    }

    public void siguienteBala(revolver revolver){

        if (revolver.getActual() == revolver.getTamañoTambor()){
            revolver.setActual(1);
        } else {
            revolver.setActual((revolver.getActual()+1));
        }

    }
}
