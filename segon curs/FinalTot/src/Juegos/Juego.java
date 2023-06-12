package Juegos;
import Jugadores.Jugador;
import Tableros.Tablero;

public abstract class Juego {
    protected Tablero tablero;
    protected Jugador jugador1;
    protected Jugador jugador2;

    public abstract void iniciarJuego();
    public abstract void jugar();
    public abstract boolean hayGanador();
}
