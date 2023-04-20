package com.company;

import java.util.ArrayList;

public abstract class operatorias {
    protected ArrayList<Object> list;

    // Constructor para inicializar la lista
    public operatorias() {
        list = new ArrayList<Object>();
    }

    // Métodos abstractos para agregar y eliminar elementos
    public abstract void add(Object obj);
    public abstract Object remove();

    // Método para obtener el tamaño de la lista
    public int size() {
        return list.size();
    }
}
