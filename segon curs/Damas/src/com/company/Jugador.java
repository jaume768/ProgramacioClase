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

        tablero.moverFicha(casillaOrigen,casillaFinal);

        // Actualizar el estado del tablero con el nuevo movimiento
        // Cambiar el turno al otro jugador
    }
}
