package com.company;

import java.util.ArrayList;

// Clase concreta para implementar el método FIFO
class FIFO extends operatorias {

    // Implementación del método abstracto para agregar un elemento al final de la lista (FIFO)
    public void add(Object obj) {
        list.add(obj);
    }

    // Implementación del método abstracto para eliminar y devolver el primer elemento de la lista (FIFO)
    public Object remove() {
        if (list.size() == 0) {
            throw new RuntimeException("No hay elementos en la lista");
        }

        System.out.println(list.get(0));

        return list.remove(0);
    }
}

