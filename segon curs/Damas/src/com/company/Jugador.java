package com.company;

public class Jugador {

    private String color;

    public Jugador(String color){
        this.color = color;
    }

    public void moverFicha(Tablero tablero, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino) {
        // Verificar que la casilla de origen contenga una ficha del jugador

        Casilla casillaOrigen = tablero.getCasilla(filaOrigen,columnaOrigen);
        Casilla casillaFinal = tablero.getCasilla(filaDestino,columnaDestino);

        if (casillaOrigen.getFicha() == null || !casillaOrigen.getFicha().getColor().equals(color)){
            throw new IllegalArgumentException("La casilla de origen no contiene una ficha del jugador ");
        }

        // Verificar que la casilla de destino esté vacía

        if (casillaFinal.getFicha() != null){
            throw new IllegalArgumentException("La casilla donde lo quieres mover ya contiene una ficha");
        }

        // Verificar que el movimiento sea válido según las reglas del juego

        if ((filaDestino - filaOrigen) == 1 && ((columnaDestino - columnaOrigen) == 1 || (columnaDestino-columnaOrigen) == -1)){
            tablero.moverFicha(casillaOrigen,casillaFinal);
        }

        // Verificar si ha pasado por encima de una dama rival y matarla en el caso correcto

        

        // Actualizar el estado del tablero con el nuevo movimiento

        tablero.ImprimirTablero();
    }

    public String getColor() {
        return color;
    }
}
