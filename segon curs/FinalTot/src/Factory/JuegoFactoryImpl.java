package Factory;
import Juegos.Ajedrez;
import Juegos.Juego;

public class JuegoFactoryImpl implements JuegoFactory{
    @Override
    public Juego crearJuego(String tipoJuego) {
        if (tipoJuego.equals("ajedrez")) {
            return new Ajedrez();
        }
        return null;
    }
}
