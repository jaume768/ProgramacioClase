package Factory;
import Juegos.Juego;

public interface JuegoFactory {
    Juego crearJuego(String tipoJuego);
}
