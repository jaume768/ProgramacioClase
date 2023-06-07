package com.company;

public class Peon extends Ficha{
    public Peon(int fila, int columna, String color) {
        super(fila, columna, color);
    }

    @Override
    public char getTipo() {
        return 'P';
    }

    @Override
    public boolean esMovimientoValido(Casilla casillaOrigen, Casilla casillaDestino, Tablero tablero) {
        int filaOrigen = casillaOrigen.getFila();
        int columnaOrigen = casillaOrigen.getColumna();
        int filaDestino = casillaDestino.getFila();
        int columnaDestino = casillaDestino.getColumna();

        // Verificar que la casilla de origen y destino contengan fichas
        if (casillaOrigen.getFicha() == null || casillaDestino.getFicha() != null) {
            return false;
        }

        // Obtener la ficha de la casilla de origen
        Ficha ficha = casillaOrigen.getFicha();

        // Verificar si el movimiento es diagonal y tiene una distancia de 1 casilla
        if (Math.abs(filaDestino - filaOrigen) == 1 && Math.abs(columnaDestino - columnaOrigen) == 1) {
            // Movimiento diagonal simple
            return true;
        }

        // Verificar si el movimiento es diagonal y tiene una distancia de 2 casillas
        if (Math.abs(filaDestino - filaOrigen) == 2 && Math.abs(columnaDestino - columnaOrigen) == 2) {
            // Movimiento diagonal con salto (captura de ficha o movimiento múltiple)
            int filaIntermedia = (filaOrigen + filaDestino) / 2;
            int columnaIntermedia = (columnaOrigen + columnaDestino) / 2;

            Casilla casillaIntermedia = tablero.getCasilla(filaIntermedia,columnaIntermedia);

            // Verificar si hay una ficha en la casilla intermedia y es de un color diferente
            return casillaIntermedia.getFicha() != null && !casillaIntermedia.getFicha().getColor().equals(ficha.getColor());
        }

        return false;
    }


}
