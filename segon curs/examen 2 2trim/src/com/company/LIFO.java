package com.company;

class LIFO extends operatorias {

    // Implementación del método abstracto para agregar un elemento al final de la lista (LIFO)
    public void add(Object obj) {
        list.add(obj);
    }

    // Implementación del método abstracto para eliminar y devolver el último elemento de la lista (LIFO)
    public Object remove() {
        if (list.size() == 0) {
            throw new RuntimeException("No hay elementos en la lista");
        }

        System.out.println(list.get(0));

        return list.remove(list.size() - 1);
    }
}
