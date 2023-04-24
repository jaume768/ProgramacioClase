package com.company;

public class Jugador {

    private String color;
    private int punts;

    public Jugador(String color,int punts){
        this.color = color;
        this.punts = punts;
    }

    public void moverFicha(Tablero tablero, int filaOrigen, int columnaOrigen, int filaDestino, int columnaDestino,Jugador jugador) {
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

        if ((filaDestino - filaOrigen) >= 1 && (columnaDestino - columnaOrigen) >= 1 || (columnaDestino-columnaOrigen) >= -1 || (filaDestino - filaOrigen) >= -1){
            tablero.moverFicha(casillaOrigen,casillaFinal);
        }

        // Verificar si ha pasado por encima de una dama rival y matarla en el caso correcto

        if ((filaDestino - filaOrigen) == 2 && (columnaDestino - columnaOrigen) == 2 || (columnaDestino-columnaOrigen) == -2 || (filaDestino - filaOrigen) == -2){
            int fila = 0;
            int colum = 0;

            if ((filaDestino - filaOrigen) == 2 && (columnaDestino - columnaOrigen) == 2){
                fila = (filaDestino - 1);
                colum = (columnaDestino - 1 );
            }

            if ((columnaDestino-columnaOrigen) == -2){
                fila = (filaDestino - 1);
                colum = (columnaDestino + 1);
            }

            if (tablero.getCasilla(fila,colum).getFicha() != null){
                tablero.matarFicha(tablero.getCasilla(fila,colum));
                jugador.setPunts(jugador.getPunts()+1);
            }

        }

        // Actualizar el estado del tablero con el nuevo movimiento

        tablero.ImprimirTablero();
    }

    public String getColor() {
        return color;
    }

    public int getPunts() {
        return punts;
    }

    public void setPunts(int punts) {
        this.punts = punts;
    }
}
